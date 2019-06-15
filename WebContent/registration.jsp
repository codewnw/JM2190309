<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page!!!</title>
</head>
<body>
	<h1>Register yourself</h1>

	<form action="process-registration.jsp" method="post">

		<table border="1">
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" required placeholder="Enter your name" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"
					placeholder="Enter your password" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" required placeholder="Enter your email" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><input type="number" name="age" required placeholder="Enter your age" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="Male" /> Male &nbsp; <input
					type="radio" name="gender" gender="Female" /> Female &nbsp; <input type="radio"
					name="gender" value="I'll not tell" checked="checked" /> Do't want to disclose</td>
			</tr>
			<tr>
				<td>Courses:</td>
				<td><input type="checkbox" name="courses" value="Core Java" /> Core Java &nbsp; <input
					type="checkbox"  name="courses" value="Advance Java" /> Advance Java &nbsp; <input type="checkbox"
					checked="checked"  name="courses" value="Java Frameworks" /> Java Frameworks &nbsp;</td>
			</tr>

			<tr>
				<td>Country:</td>
				<td><select name="country">
						<option value="">--SELECT--</option>
						<option value="India">India</option>
						<option value="USA">USA</option>
						<option value="UK">UK</option>
				</select></td>
			</tr>

			<tr>
				<td>Comment</td>
				<td><textarea name="comment" rows="3" cols="50"></textarea></td>
			</tr>

			<tr>
				<td><input type="reset" value="Reset Values" /></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>

	</form>
</body>
</html>