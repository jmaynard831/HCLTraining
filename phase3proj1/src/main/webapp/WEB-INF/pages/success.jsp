<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User ID found</title>
</head>
<body>

	You searched for User #${user.getUserID()}
	<br>
	<br> Username: ${user.getName()}
	<br> Password: ${user.getPass()}
	<br> City: ${user.getCity()}
	<br> Email: ${user.getEmail()}
	<br>
	<br>

	<a href="edit?userID=${user.getUserID()}" type="button">Edit user</a>


	<br>
	<a href="usersearch" type="button">Search Again!</a>
</body>
</html>