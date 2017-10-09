<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User manager</title>
</head>
<body>
	<h2>User manager</h2>
	<a href="/user-manager/users/add">Add user</a>
	<a href="/user-manager/users/">All users</a>
	<form action="/user-manager/users" method="get">
		<input type="text" name="id">
		<input type="submit" value="search">
	</form>
</body>
</html>