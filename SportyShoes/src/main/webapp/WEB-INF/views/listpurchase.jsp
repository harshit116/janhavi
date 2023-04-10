<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
	<h1>List Product</h1>
	<table border="2">
		<tr>
			<th>PurchaseId</th>
			<th>Brand</th>
			<th>Size</th>
			<th>Category</th>
			<th>Price</th>
			<th>Date</th>
			
			
		</tr>
		
		<c:forEach var="purchases" items="${purchase}">
		
			<tr>
				<td>${purchases.id}</td>
				<td>${purchases.brand}</td>
				<td>${purchases.size}</td>
				<td>${purchases.category}</td>
				<td>${purchases.price}</td>
				<td>${purchases.date}</td>
				
			
			</tr>
			
		</c:forEach>
		
	</table>
</body>
</html>