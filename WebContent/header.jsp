<%@ page import="java.util.*"%>
<%@ page isThreadSafe="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
	<h1>Header</h1>
	<%
		List<String> menu = new ArrayList<>();
		menu.add("Home");
		menu.add("Contact Us");
		menu.add("About Us");

		for (String item : menu) {
	%><a href="index.html">
		<%
			out.print(item + " ");
		%>
	</a>
	<%
		}
		//int i = 10/0;
	%>
	<hr>
	${param.un}
	<br /> ${param.msg}
	<br /> ${requestScope.something}

</body>
</html>