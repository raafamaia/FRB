package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastraAluno
 */
@WebServlet("/CadastraAluno")
public class AdicionaAlunoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {

		try {
			new AdicionaAluno().executa(request, response);
		} catch (Exception e) {
			throw new ServletException("A camada model gerou uma exce��o", e);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("aluno-cadastrado.jsp");
		rd.forward(request, response);
		
	}

}
