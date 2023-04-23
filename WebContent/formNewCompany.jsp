<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/newCompany" var="linkNewCompany"/> <!-- Defining the Path to newCompany in var -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form New Company</title>
</head>
<body>   		 <!-- Calling the var -->
	<form action="${linkNewCompany}" method="post">
	
		Name: <input type="text" name="name" placeholder="Your Company's Name"/>
		Launch Date: <input type="text" name="date" placeholder="00/00/0000"/>
		
		<input type="submit">
		
	</form>
</body>
</html>