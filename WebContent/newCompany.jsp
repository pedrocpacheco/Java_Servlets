<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/formNewCompany.jsp" var="linkForm"/> <!-- Defining the Path to form in var -->
<c:url value="/companyList" var="linkList"/> <!-- Defining the path to list in var -->


<html>
<body>
	<h1>Company Created!</h1>
	<h2>Company Name: ${ company.getName() } | Company ID: ${ company.getId() }</h2>
	<a href="${linkForm}"><button>Create New Company</button></a>
	<a href="${linkList}"><button>See CompanyList</button></a>
</body>
</html>