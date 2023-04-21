<%@ page import="br.com.alura.manager.classes.Company" %>

<% 
	Company company = (Company) request.getAttribute("company");
	System.out.println(company.getName());
%>

<html>
<body>
	<h1>Company Created!</h1>
	<h2>Company Name: <%= company.getName() %> | Company ID: <%= company.getId() %></h2>
	<button><a href="/Servlets_Course_1/formNewCompany.html">Create New Company</a></button>
	<button><a href="/Servlets_Course_1/companyList">See the CompanyList</a></button>
</body>
</html>