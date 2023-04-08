<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<div align="center">
<h1>Please Signup  </h1>
<form action="/signupuser" method="post" >
		<table>
			<tr>
				<td>User Name</td>
				<td><input name="username" type="text" ></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password" type ="password" ></td>
			</tr>
			</tr>
			
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>
</form>
</div>
</body>
</html>