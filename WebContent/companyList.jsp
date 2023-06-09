<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
		<h2>Company Name: ${company.name} | Company Id: ${company.id} | Company Launch Date: <fmt:formatDate value="${company.date}" pattern="dd/MM/yyyy"/></h2>
		<a href="/Servlets_Course_1/showCompany?id=${company.id}&name=${company.name}&date=<fmt:formatDate value="${company.date}" pattern="dd/MM/yyyy"/>"><button>Edit</button></a>
		<a href="/Servlets_Course_1/removeCompany?id=${company.id}"><button>Delete</button></a>
		</c:forEach>
		
		<!-- Navigation Buttons -->
		<br>
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