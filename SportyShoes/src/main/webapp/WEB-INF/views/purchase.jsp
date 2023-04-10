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
	<h1>Item you Purchased</h1>
	
	<h4><p>${shoe}</p></h2>
	<form action="/buyshoe" method="post" >
		<table>
			
			<tr>
				<td><input name="brand" type ="text" value=${shoe.brand}></td>
			</tr>
			</tr>
			
				<td><input name="size" type ="text" value=${shoe.size}></td>
			</tr>
			</tr>
			
				<td><input name="category" type ="text" value=${shoe.category}></td>
			</tr>
			</tr>
			
				<td><input name="price" type ="text" value=${shoe.price}></td>
			</tr>
			</tr>
			
				<td>Date:<input name="date" type ="date" ></td>
			</tr>
			</tr>
			
				<td><input type="submit" value="Click To Proceed" /></td>
			</tr>
		</table>
</form>
				
	<h4>Thank You For Shopping With Us</h4>			
				
		
</body>
</html>