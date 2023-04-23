<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/editedCompany" var="linkEditedCompany"/>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editing Company</title>
</head>
<body>
	<h2>Editing Company!</h2>
	<form action="${linkEditedCompany}" method="post">
	
		Name: <input type="text" name="name" placeholder="${company.name}"/>
		Launch Date: <input type="text" name="date" placeholder="<fmt:formatDate value="${company.date}" pattern="dd/MM/yyyy"/>"/>
		<input type="hidden" name="id" value="${company.id}">
		
		<input type="submit">
		
	</form>
</body>
</html>