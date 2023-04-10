<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Display</title>
</head>
<body>
<h2>The user you want to find</h2>
	<table border="2">
		<tr>
			<th>UserId</th>
			<th>UserName</th>
		</tr>

		

			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
			</tr>
		
	</table>
</body>
</html>