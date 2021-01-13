<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Search</title>
</head>
<body>
	<h1>Search a user!</h1>
	<form method="post">
		User Id:<input type="number" name="userID" required="required" /><br>
		<input type="submit">
	</form>

	<br>

	<h1>or register one</h1>
	<a href="/main/registration" type="button">Register User</a>

</body>
</html>