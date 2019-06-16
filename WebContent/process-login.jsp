
<%
	String un = request.getParameter("un");
	String p = request.getParameter("password");

	if (un.equals(p)) {
		request.setAttribute("something", "I don't know");
%>
<jsp:forward page="header.jsp">
	<jsp:param value="Success" name="msg" />
</jsp:forward>
<!-- request.getRequestDispatcher("header.jsp").forward(request, response);
		out.print("Hi, " + un + " Login successful!"); -->
<%
	} else {
		response.sendRedirect("jsp-login.jsp?message=Login Failed");
	}
%>