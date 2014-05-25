package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import dataaccess.ListaAlunoDAO;

public class AdicionaAluno {

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{

		// AlunoDAO alDAO = new AlunoDAO();
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
