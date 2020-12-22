<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Products</title>
</head>
<body>
<h1>Add Products to the DB:</h1>
	<form action="AddProduct" method="post">
		Name:<input type="text" name="productName"><br>
		Description:<input type="text" name="ProductDescription"><br>
		Cost:<input type="number" name="productCost"><br> 
		Weight:<input type="number" name="productWeight"><br>
		<button type="submit">Submit</button>
	</form>


</body>
</html>