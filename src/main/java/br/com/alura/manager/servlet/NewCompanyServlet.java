package br.com.alura.manager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Signing Up a New Company");
		
		String companyName = request.getParameter("name"); // Getting the Parameter and Saving in Variable
		
		Company company = new Company(companyName.hashCode(), companyName); // Creating a Company
		Database database = new Database(); // Creating a Database
		
		database.add(company); // Saving Company in Database
		
		// Passing to .jsp page that prints the info
		RequestDispatcher rd = request.getRequestDispatcher("/newCompanyCreated.jsp"); 
		request.setAttribute("company", company);
		
		rd.forward(request, response); // Passing the Request ahead
		
	}

}
