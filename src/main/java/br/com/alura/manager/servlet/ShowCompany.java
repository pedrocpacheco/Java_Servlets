package br.com.alura.manager.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.manager.classes.Company;
import br.com.alura.manager.classes.Database;

@WebServlet("/showCompany")
public class ShowCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strId = request.getParameter("id");
		Integer id = Integer.parseInt(strId);
		
		Database db = new Database();
		
		Company company = db.getCompanyById(id);
		
	}

}
