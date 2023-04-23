package br.com.alura.manager.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.classes.Database;

/**
 * Servlet implementation class RemoveCompanyServlet
 */
@WebServlet("/removeCompany")
public class RemoveCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String stringId = request.getParameter("id");
		
		Integer id = Integer.valueOf(stringId);
		
		System.out.println(id);
		
		Database db = new Database();
		
		db.delete(id);
		
		response.sendRedirect("companyList");
	}

}
