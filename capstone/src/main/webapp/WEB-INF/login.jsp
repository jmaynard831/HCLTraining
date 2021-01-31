<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login!</title>
</head>
<body>

<header>
<ul class="nav">

  <li class="nav-item">
    <a class="nav-link active" href="/product_list">Products!</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/AdminOrderList">Admins: Order Editor</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/newprod">Admins: Product Editor</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/shoppingcart">Shopping Cart</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/login">Login!</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="/register">Register</a>
  </li>
  
</ul>
</header>

	<h1>Login here</h1>
	<form method="post">
		<label for="username">Username:</label> <input type="text"
			id="username" name="username"><br> <label for="password">Password:</label>
		<input type="text" id="password" name="password"><br> <input
			type="submit" value="Log in!">
	</form>

</body>
</html>