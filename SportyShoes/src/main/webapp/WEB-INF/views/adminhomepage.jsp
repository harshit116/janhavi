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
		<h1>Admin HomePage</h1>
		<form action="/changepassword">
			<input type="submit" value="Change Password" />
		</form>
		<br>

		<h2>Manage Product</h2>
		<form action="/addproduct">
			<input type="submit" value="Add Product" />
		</form>
		<form action="/listproduct">
			<input type="submit" value="List Product" />
		</form>
		<h2>Categorized Product</h2>
		<form action="/category">
			<input type="submit" value="Filter By Category" />
		</form>
		<h2>Click Below Button to Find List of User</h2>
		<form action="/listuser">
			<input type="submit" value="list of User" />
		</form>
		
	</div>
</body>
</html>