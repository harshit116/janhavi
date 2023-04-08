<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<h1>
		User HomePage
		</h2>
		<h2>Login Credentials Required</h2>
		<form action="/userlogin" method="post">
			<table>
				<tr>
					<td>User Name</td>
					<td><input name="username" type="text"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input name="password" type="password"></td>
				</tr>

				<td><input type="submit" value="Login" /></td>
				</tr>


			</table>

			<br> <br>
		</form>


		<form action="/signupuser">
			<table>
				</tr>

				<td><input type="submit" value="Sign Up" /></td>
				</tr>
			</table>
		</form>
</body>
</html>