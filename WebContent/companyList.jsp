<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/formNewCompany.jsp" var="linkForm"/>


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
		<h2>Company Name: ${company.name} | Company Id: ${company.id}</h2>
	</c:forEach>
	<a href="${linkForm}"><button>Create New Company</button></a>
</body>
</html>