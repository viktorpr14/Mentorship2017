<!Doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User profile</title>
</head>
<body>
    <h2>User info</h2>
    <table>
        <tr>
            <td>First name :</td>
            <td>${user.firstName}</td>
        </tr>
        <tr>
            <td>Last name :</td>
            <td>${user.lastName}</td>
        </tr>
        <tr>
            <td>id :</td>
            <td>${user.id}</td>
        </tr>
    </table>
    <a href="/user-manager/">To main page</a>
</body>
</html>