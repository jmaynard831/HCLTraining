<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<p>I just wanna see if i can access the attributes of the user here: </p>
<br>

	<h1>Hello, ${user.getUsername()}</h1>
	<br>
	<h3>Password: ${user.getPassword()}</h3>
	<br>
	<h3>UUID: ${user.getUser_id()}</h3>

<form method="post">
<label for="testname">testname:</label>
<input type="text" id="testname" name="testname"><br>

<input type="submit" value="Register!">
</form>


</body>
</html>