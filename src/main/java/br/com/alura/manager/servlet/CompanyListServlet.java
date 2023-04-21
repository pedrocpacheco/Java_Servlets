package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CompanyListServlet
 */
@WebServlet("/companyListServlet")
public class CompanyListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Acessing our Database
		Database database = new Database();
		
		// Saving it's Company List in a new Variable 
		List<Company> companyList = database.getCompanyList();
		
		// Getting our Printer
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		
		for (Company company : companyList) {
			out.println("<h1>Company Name: " + company.getName() + " | Company ID: " + company.getId() + "</h1>");
		}
		
		out.println("</body></html>");
		
	}

}
