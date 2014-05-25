package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import dataaccess.ListaAlunoDAO;


public class AdicionaAluno {
       
	protected void executa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException{

		Aluno a = new Aluno();
//TODO	Quando arrumar o banco, usar a classe AlunoDAO
//		AlunoDAO alDAO = new AlunoDAO();
//		alDAO.inserir(a);
		
		ListaAlunoDAO alDao = new ListaAlunoDAO();
		
		a.setNome(request.getParameter("nome"));
		a.setRa(Integer.parseInt(request.getParameter("RA")));
		a.setCurso(request.getParameter("curso"));
		a.setPeriodo(request.getParameter("periodo"));
		a.setSenha(request.getParameter("senha"));
		
		alDao.inserir(a);
		
	}

}
