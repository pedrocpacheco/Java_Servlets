<!DOCTYPE html>
<%@ page import="br.com.alura.manager.classes.Company" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<html>
<head>
<meta charset="UTF-8">
<title>Company List</title>
</head>
<body>
	<h1>Company Lists</h1>
	
	<c:forEach items="${companyList}" var="company">
		<h2>Company Name: ${company.Name} | Company Id: ${company.Id}</h2>
	</c:forEach>

	<button><a href="/Servlets_Course_1/formNewCompany.html">Create New Company</a></button>
</body>
</html>