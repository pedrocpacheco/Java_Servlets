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
	<h1>Company Lists</h1> <!-- Title -->
	
	<!-- Case: Companys Already Created -->
	<c:if test="${not empty companyList }">
		<!-- Loop of Companys and it's infos -->
		<c:forEach items="${companyList}" var="company">
		<h2>Company Name: ${company.name} | Company Id: ${company.id}</h2>
		</c:forEach>
		
		<!-- Navigation Buttons -->
		<a href="${linkForm}"><button>Create New Company</button></a>
	</c:if>
	
	<!-- Case: No Company Created Yet -->
	<c:if test="${empty companyList}">
		<!-- Warning saying there are no companys -->
		<h2>None Companys Created Yet!</h2>
		<h3>Go to the Company Creation Form to add Companys to the Company List!</h3>
		
		<!-- Navigation Buttons -->
		<a href="${linkForm}"><button>Create New Company</button></a>
	</c:if>
</body>
</html>