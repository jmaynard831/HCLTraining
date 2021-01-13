<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit User</title>
</head>
<body>

	<form method="post" action="edit">
		<input type="hidden" name="userID" value=${user.getUserID()}>
		Username:<input type="text" name="uname" value=${user.getName()}><br>
		Password:<input type="text" name="pass" value=${user.getPass()}><br>
		City:<input type="text" name="city" value=${user.getCity()}><br>
		Email:<input type="text" name="email" value=${user.getEmail()}><br>
		<input type="submit">
	</form>


</body>
</html>