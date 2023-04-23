package br.com.alura.manager.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.classes.Company;
import br.com.alura.manager.classes.Database;

@WebServlet("/companyList")
public class CompanyListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Saving it's Company List in a new Variable 
		List<Company> companyList = Database.getCompanyList();
		
		request.setAttribute("companyList", companyList); // 1 -> Define Attributes (Name, Atribute)
		
		RequestDispatcher rd = request.getRequestDispatcher("/companyList.jsp"); // 2 -> Dipatch and ("/url")
		
		rd.forward(request, response); // 3 -> Finally send them
	}
	

}
