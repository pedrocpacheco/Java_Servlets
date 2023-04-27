package br.com.alura.manager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.model.Company;
import br.com.alura.manager.model.Database;

@WebServlet("/showCompany")
public class ShowCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strId = request.getParameter("id");
		Integer id = Integer.parseInt(strId);
		
		Database db = new Database();
		
		Company company = db.getCompanyById(id);
		System.out.println(company.getName());
		
		request.setAttribute("company", company); // Defining what the dispatcher will send
		
		RequestDispatcher rd = request.getRequestDispatcher("/formEditCompany.jsp"); // Sending the dispatcher
		
		rd.forward(request, response);
		
		
	}

}
