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
<title>Buy this thing</title>
<style type="text/css">
td {
	border: 1px solid black;
}
img {
	width:100px;
	height:100px;
}
</style>
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


<table id= "myTable" class="table table-striped">
		<thead>
			<tr>
				<th>Image</th>
				<th>Name</th>
				<th>Category</th>
				<th>Condition</th>
				<th>Manufacturer</th>
				<th>Genre</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
<tr>
		<td><img src="${thisProduct.getImage_url()}" ></td>
					<td><a href="/product_list/${thisProduct.getProduct_id()}">${thisProduct.getProd_name()}</a></td>
					<td>${thisProduct.getProd_category()}</td>
					<td>${thisProduct.getProd_condition()}</td>
					<td>${thisProduct.getProd_manufacturer()}</td>
					<td>${thisProduct.getProd_genre()}</td>
					<td>${thisProduct.getProd_price()}</td>

				</tr>
				</tbody>
	</table>

<br>
<form action="/addtocart" method="post">
Qty:
<input type="number" step="1" value="1" min="0" name="quantity" id="quantity">
<input type="text" value="${thisProduct.getProduct_id()}" name="prod_id" id="prod_id" hidden>
<input type="submit" value="Buy Now!">
</form>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>