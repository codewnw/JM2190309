<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<%-- <%@ include file="header.jsp" %> --%>
<jsp:include page="header.jsp" />
	<h1>Please login...</h1>
	<%
	String message = request.getParameter("message");
	%>
	<%= message != null ? message : "" %>
	<form action="process-login.jsp" method="post">
		<input type="text" name="un" placeholder="Enter Username" /> 
		<input type="password" name="password" placeholder="Enter password" /><br /> 
		<input type="submit" value="Login">
	</form>
<%-- <%@ include file="footer.jsp" %> --%>
<jsp:include page="footer.jsp" />
</body>
</html>