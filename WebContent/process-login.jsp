
<%
	String un = request.getParameter("un");
	String p = request.getParameter("password");

	if (un.equals(p)) {
		out.print("Hi, " + un + " Login successful!");
	} else {
		response.sendRedirect("jsp-login.jsp?message=Login Failed");
	}
%>