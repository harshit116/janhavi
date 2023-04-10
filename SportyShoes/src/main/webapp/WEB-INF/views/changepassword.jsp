<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
	<div align="center">
		<h1>Change Password</h1>
		<form action="/changepassword" method="post">
			<table>
				<tr>
					<td>Enter UserName</td>
					<td><input name="username" type="text"></td>
				</tr>

				<td>Enter New Password</td>
				<td><input name="password" type="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save" /></td>
				</tr>
			</table>


		</form>
		<p>${message}</p>
	</div>
	
</body>
</html>