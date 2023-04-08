<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<h1>Add Product</h1>
	<form action="addproduct" method="post">
		<table>
		
			<tr>
				<td>Brand</td>
				<td><input name="brand" type="text"></td>
			</tr>
			<tr>
				<td>Size</td>
				<td><input name="size" type="text"></td>
			</tr>
			<tr>
				<td>Category</td>
				<td><input name="category" type="text"></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input name="price" type="text"></td>
			</tr>

			<td><input type="submit" value="Add" /></td>
			</tr>


		</table>

		<br> <br>
	</form>
	
	<p>${message}</p>
	<form action="addproduct" method="post">
		<table>
		
			<tr>
				<td>Brand</td>
				<td><input name="brand" type="text"></td>
</body>
</html>