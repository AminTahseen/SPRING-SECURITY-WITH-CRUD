<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login" method="post">

<table align="center">
<caption>
<h3>Login Now</h3>
</caption>

<tr>
<td>Username</td>
<td><input type="text" name="username"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td><input type="submit" value="login"></td>
</tr>

</table>
</form>
<center>
<p style="color:red;">${SPRING_SECURITY_LAST_EXCEPTION.message} </p>
</center>

</body>
</html>