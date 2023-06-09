package br.com.alura.manager.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello") 
public class HelloWorldServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override // HTTP Protocol always have a Request and a Response
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Congrats, this is a Servlet!</h1>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Hello Servlet Running"); // Showing the process work
	}
	

}
