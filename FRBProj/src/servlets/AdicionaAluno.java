package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataaccess.AlunoDAO;
import entities.Aluno;


/**
 * Servlet implementation class AdicionaAluno
 */
@WebServlet("/adicionaAluno")
public class AdicionaAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		AlunoDAO alDAO = new AlunoDAO();
		Aluno a = new Aluno();
		
		a.setNome(request.getParameter("nome"));
		a.setRa(Integer.parseInt(request.getParameter("RA")));
		a.setCurso(request.getParameter("curso"));
		a.setPeriodo(request.getParameter("periodo"));
		a.setSenha(request.getParameter("senha"));
		

		try {
			alDAO.inserirAluno(a);
			//alDAO.inserirLista(a);
			out.println("<p>Aluno cadastrado:</p>");
		} catch (Exception e) {
			out.println("<p style='color: red;'>"+ e.getMessage() +"</p>");
		}
		
		// Escreve texto
		StringBuilder htmls = new StringBuilder();
		htmls.append("<html>" 
				+ "<body>" 
				+ a.getNome() + " - " + a.getRa()
				+ "<br><a href='lista-alunos.jsp'>Lista Alunos</a>"
				+ " </body>" 
				+ "</html>");

		
		out.println(htmls);
	}

}
