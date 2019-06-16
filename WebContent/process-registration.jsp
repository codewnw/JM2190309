<jsp:useBean id="user" class="com.jm2190309.model.User"></jsp:useBean>
<jsp:setProperty property="*" name="user" />
<jsp:setProperty property="type" name="user" value="Admin" />

<%=user%>
<br />
<jsp:getProperty property="age" name="user" />

<table border="1">
	<tr>
		<td>Name:</td>
		<td>${user.name}</td>
	</tr>
	<tr>
		<td>Password:</td>
		<td>${user.password}</td>
	</tr>
	<tr>
		<td>Age:</td>
		<td>${user.age}</td>
	</tr>
	<tr>
		<td>Email:</td>
		<td>${user.email}</td>
	</tr>
	<tr>
		<td>Gender:</td>
		<td>${user.gender}</td>
	</tr>
	<tr>
		<td>Courses:</td>
		<td>${user.courses[0]}${user.courses[1]} ${user.courses[2]}</td>
	</tr>
	<tr>
		<td>Country:</td>
		<td>${user.country}</td>
	</tr>
	<tr>
		<td>Comment:</td>
		<td>${user.comment}</td>
	</tr>
	<tr>
		<td>Type:</td>
		<td>${user.type}</td>
	</tr>
</table>