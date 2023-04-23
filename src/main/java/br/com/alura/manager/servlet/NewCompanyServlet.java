package br.com.alura.manager.servlet;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.classes.Company;
import br.com.alura.manager.classes.Database;

@WebServlet("/newCompany")
public class NewCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String companyName = request.getParameter("name"); // Getting the Parameter and Saving in Variable
		String strCompanyDate = request.getParameter("date"); // Getting the Parameter Date but saving in a Sting
		
		Date companyDate = null; // Creating before try-catch block to be used after it
		
		try { // Since we can't modify the method signiture (doe to inheritance) we do a try-catch
			SimpleDateFormat parsing = new SimpleDateFormat("dd/MM/yyyy"); // Creating and configuring our parser
			companyDate = parsing.parse(strCompanyDate); // Passing the String to a Date
		} catch(ParseException e) {
			throw new ServletException(e); // Catch and ReThrow -> Since doesnt make sense going on
		}
		
		Company company = new Company(companyName.hashCode(), companyName, companyDate); // Creating a Company
		Database database = new Database(); // Creating a Database
		
		database.add(company); // Saving Company in Database
		
		// Passing to .jsp page that prints the info
		RequestDispatcher rd = request.getRequestDispatcher("/newCompany.jsp"); 
		request.setAttribute("company", company);
		
		rd.forward(request, response); // Passing the Request ahead
		
	}

}
