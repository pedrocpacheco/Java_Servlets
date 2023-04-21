package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Signing Up a New Company");
		
		// Passing information and Creating Page
		PrintWriter out = response.getWriter();
		out.println("<html><body><h1>Signing Up a New Company</h1></body></html>");

		// Getting information by the Request
		String companyName = request.getParameter("name");
		out.println(companyName);
		
		
	}

}
