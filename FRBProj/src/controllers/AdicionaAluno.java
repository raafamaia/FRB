package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import dataaccess.ListaAlunoDAO;


/**
 * Servlet implementation class AdicionaAluno
 */
@WebServlet("/adicionaAluno")
public class AdicionaAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void executa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

//		AlunoDAO alDAO = new AlunoDAO();
		ListaAlunoDAO alDao = new ListaAlunoDAO();
		
		Aluno a = new Aluno();
		
		a.setNome(request.getParameter("nome"));
		a.setRa(Integer.parseInt(request.getParameter("RA")));
		a.setCurso(request.getParameter("curso"));
		a.setPeriodo(request.getParameter("periodo"));
		a.setSenha(request.getParameter("senha"));
		
		alDao.inserir(a);
	}

}
