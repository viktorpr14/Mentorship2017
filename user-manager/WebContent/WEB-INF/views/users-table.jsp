<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All users</title>
</head>
<body>
     <c:forEach items="${users}" var="user">
        ${user.id}: ${user.firstName} ${user.lastName} </br>
      </c:forEach>
    <div>
    	<a href="/user-manager/">To main page</a>
    </div>
</body>
</html>