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
			<th>Category And Their Count</th>
			
			
			
		</tr>
		
		<c:forEach var="shoe" items="${shoes}">
		
			<tr>
				<td>${shoe}</td>
				
				
				
			
			</tr>
			
		</c:forEach>
		
	</table>
</body>
</html>