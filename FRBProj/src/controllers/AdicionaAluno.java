package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import model.Conta;
import dataaccess.ListaAlunoDAO;
import dataaccess.ListaContasDAO;
import dataaccess.UsuarioDAO;

public class AdicionaAluno {

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{

		// AlunoDAO alDAO = new AlunoDAO();
		ListaAlunoDAO alDao = new ListaAlunoDAO();
		UsuarioDAO userDao = new UsuarioDAO();
		Aluno a = new Aluno();

		a.setNome(request.getParameter("nome"));
		a.setRa(Integer.parseInt(request.getParameter("RA")));
		a.setCurso(request.getParameter("curso"));
		a.setPeriodo(request.getParameter("periodo"));
		a.setSenha(request.getParameter("senha"));

		alDao.inserir(a);
		userDao.inserir(a);
		
		Conta conta = new Conta();
		conta.setIdUsuario(a.getId());
		new ListaContasDAO().inserir(conta);
		 
		a.setConta(conta);
		userDao.atualizar(a);
	}

}
