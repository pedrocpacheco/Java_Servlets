package br.com.alura.manager.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.classes.Company;
import br.com.alura.manager.classes.Database;

@WebServlet("/editedCompany")
public class EditedCompanyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String companyName = request.getParameter("name");
		Integer id = Integer.parseInt(request.getParameter("id"));
		System.out.println(id);
		String strCompanyDate = request.getParameter("date");
	
		Date companyDate = null; // Creating before try-catch block to be used after it
		
		try { // Since we can't modify the method signiture (doe to inheritance) we do a try-catch
			SimpleDateFormat parsing = new SimpleDateFormat("dd/MM/yyyy"); // Creating and configuring our parser
			companyDate = parsing.parse(strCompanyDate); // Passing the String to a Date
		} catch(ParseException e) {
			throw new ServletException(e); // Catch and ReThrow -> Since doesnt make sense going on
		}
		
		Database db = new Database();
		Company company = db.getCompanyById(id);
		System.out.println(company.getName() + "rolou");
		company.setName(companyName);
		company.setDate(companyDate);
		System.out.println(company.getName());
	
		response.sendRedirect("companyList");

		
	}


}
