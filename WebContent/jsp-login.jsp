<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Please login...</h1>
	<%
	String message = request.getParameter("message");
	%>
	<%= message != null ? message : "" %>
	<form action="process-login.jsp" method="post">
		<input type="text" name="un" placeholder="Enter Username" /> <input
			type="password" name="password" placeholder="Enter password" /><br /> <input
			type="submit" value="Login">

	</form>

</body>
</html>