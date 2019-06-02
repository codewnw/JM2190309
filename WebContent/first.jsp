<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My first JSP file</title>
</head>
<body>
	<h1>This is JSP</h1>
	Sum: <%=2 + 3 %> <br />
	Random Number: <%= (int)(Math.random() * 10000) %> <br />
	Current Date: <%= (new Date()).toString() %>

	<br />

	<%
		int localVal = 50;
		out.println("Hi, sum is: " + (sum(10, 20) + localVal));
		%>
		<br />
		<%
		for(int i = 0; i < 10; i++){
			out.println(i+" ");
		}
	%>

	<%!int val = 100;

	int sum(int a, int b) {
		return a + b + val;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	%>
</body>
</html>