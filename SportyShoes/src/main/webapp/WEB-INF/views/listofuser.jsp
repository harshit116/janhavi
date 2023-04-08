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
	<h1>List of User</h1>
	<table border="2">
		<tr>
			<th>UserId</th>
			<th>UserName</th>
		</tr>

		<c:forEach var="users" items="${user}">

			<tr>
				<td>${users.id}</td>
				<td>${users.username}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>