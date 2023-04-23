<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/editedCompany" var="linkCompanyList"/> <!-- Defining the Path to companyList in var -->

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
	<form action="${linkNewCompany}" method="post">
	
		Name: <input type="text" name="name" placeholder="${}"/>
		Launch Date: <input type="text" name="date" placeholder="00/00/0000"/>
		
		<input type="submit">
		
	</form>
</body>
</html>