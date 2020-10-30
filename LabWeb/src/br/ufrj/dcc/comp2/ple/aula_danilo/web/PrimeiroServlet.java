package br.ufrj.dcc.comp2.ple.aula_danilo.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	private static final long serialVersionUID = 1000L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimeiroServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		response.getWriter().append("<!DOCTYPE html>\n");
		response.getWriter().append("<html>\n");
		response.getWriter().append("<body>\n");
		
		if (nome == null)
			response.getWriter().append("<b>Olá Web!</b>\n");
		else if (senha == null)
			response.getWriter().append("<b>Olá " + nome + " na Web!</b>\n");
		else if (senha == "Comp2Java")
			response.getWriter().append("<b>Bem vindo " + nome + ", aluno de Comp2!</b>\n");
		else
			response.getWriter().append("<b>Você enviou dados que não devia...</b>\n");
		
		response.getWriter().append("</body>\n");
		response.getWriter().append("</html>\n");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		response.setHeader("Content-Type", "application/json");
		response.getWriter().printf("{\"nome\": \"%s\", \"sobrenome\": \"%s\"}", nome, senha);
		request.pa
	}
	
	
}
