package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Aluno;
import dataaccess.AlunoDAO;

/**
 * Servlet implementation class CadastraAluno
 */
@WebServlet("/CadastraAluno")
public class CadastraAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			new AdicionaAluno().executa(request, response);
		} catch (Exception e) {
			throw new ServletException("A camada model gerou uma exceção", e);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("aluno-cadastrado.jsp");
		rd.forward(request, response);
		
	}

}
