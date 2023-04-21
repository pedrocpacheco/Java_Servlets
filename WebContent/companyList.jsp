<!DOCTYPE html>
<%@ page import="br.com.alura.manager.classes.Company" %>
<%@ page import="java.util.List" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<head>
<meta charset="UTF-8">
<title>Company List</title>
</head>
<body>
	<h1>Company Lists</h1>
	<% 
	List<Company> companyList = (List<Company>)request.getAttribute("companyList");
	for (Company company : companyList) {
	%>
		<h2>Company Name: <%= company.getName() %> | Company ID: <%= company.getId() %> </h2>
	<%
	}
	%>
	<button><a href="/Servlets_Course_1/formNewCompany.html">Create New Company</a></button>
</body>
</html>