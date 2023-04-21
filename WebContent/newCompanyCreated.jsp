<%@ page import="br.com.alura.manager.servlet.Company" %>

<% 
	Company company = (Company) request.getAttribute("company");
	System.out.println(company.getName());
%>

<html>
<body>
	<h1> Company Name: <%= company.getName() %> | Company ID: <%= company.getId() %> | created!
</body>
</html>