package controllers;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import dataaccess.UsuarioDAO;

public class AdicionaAluno {

	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException{

		// AlunoDAO alDAO = new AlunoDAO();
		UsuarioDAO userDao = new UsuarioDAO();
		
		Usuario a = new Usuario();

		a.setNome(request.getParameter("nome"));
		a.setRa(Integer.parseInt(request.getParameter("RA")));
		a.setCurso(request.getParameter("curso"));
		a.setPeriodo(request.getParameter("periodo"));
		a.setSenha(request.getParameter("senha"));
		a.setEmail(request.getParameter("email"));

		userDao.inserir(a);
		
	}

}
