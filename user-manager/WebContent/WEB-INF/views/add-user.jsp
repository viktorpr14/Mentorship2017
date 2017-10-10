<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
</head>
<body>
	<h3>Welcome, Enter user details</h3>
	<form:form method="POST" action="/user-manager/users/"
		modelAttribute="user">
		<table>
			<tr>
				<td><form:label path="firstName">First name</form:label></td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last name</form:label></td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td><form:label path="id">id</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add user" /></td>
			</tr>
		</table>
	</form:form>
	<div>
		<a href="/user-manager/">To main page</a>
	</div>
</body>
</html>