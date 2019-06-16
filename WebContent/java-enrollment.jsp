<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Java Enrollment...</h1>

	<form action="java" method="post">
		<input type="text" name="name" placeholder="Enter name" /> <input
			type="submit" value="Enroll">

	</form>
${applicationScope.msg}
<br />
${header.host}<br />
${header.referer}<br />
${headrValues.accept-language[0]}<br />
${headrValues.accept-language[1]}<br />


<br />
${pageContext.request.contextPath}
</body>
</html>