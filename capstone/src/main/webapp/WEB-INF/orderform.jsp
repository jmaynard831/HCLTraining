<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

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

<p>Place an Order!</p>

<table class="table table-striped">
		<thead>
			<tr>
				<th>Product</th>
				<th>Qty</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${ShoppingCart}" var="item">
				<tr>
					<td>${item.getProduct().getProd_name()}</td>
					<td>${item.getQuantity()}</td>
					<td>${item.getProduct().getProd_price() * item.getQuantity()}</td>
					
				</tr>
			</c:forEach>
		</tbody>
	</table>
<p>Shipping Address:</p>
<form method="post">
<div class="form-group">
Street Address:<input type="text" name="saStreet"><br>
City:<input type="text" name="saCity"><br>
State:<input type="text" name="saState"><br>
Zip:<input type="text" name="saZip"><br>
<input type="submit" value="Ship!">
</div>
</form>
<p> this is where we put the final button that makes the order</p>


<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>
</html>