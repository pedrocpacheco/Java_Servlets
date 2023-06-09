<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/formNewCompany.jsp" var="linkForm"/> <!-- Defining the Path to form in var -->
<c:url value="/companyList" var="linkList"/> <!-- Defining the path to list in var -->


<html>
<body>
	<!-- Info Printed if Company Sended has value -->
	<c:if test="${not empty company}">
		<h1>Company Created!</h1>
		<h2>Company Name: ${ company.name } | Company ID: ${ company.id } | Company Launch Date: <fmt:formatDate value="${company.date}" pattern="dd/MM/yyyy"/> </h2>
		<a href="${linkForm}"><button>Create New Company</button></a>
		<a href="${linkList}"><button>See CompanyList</button></a>
	</c:if>
	
	<!-- Info Printed if Company Sended doesn't has value -->
	<c:if test="${empty company}">
		<h1>No Company Created!</h1>
		<h2>Check if you used the Form to send the Company info!</h2>
		<a href="${linkForm}"><button>Create New Company</button></a>
		<a href="${linkList}"><button>See CompanyList</button></a>
	</c:if>
</body>
</html>