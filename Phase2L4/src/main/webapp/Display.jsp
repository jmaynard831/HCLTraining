<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Your Product</title>
</head>
<body>
	Hello!
	<br>
	<%
		com.entity.Product p = (com.entity.Product) session.getAttribute("product");
	%>

	Product Name:<%=p.getName()%><br> 
	Product Description: <%=p.getDescription()%><br> 
	Product Cost: $<%=p.getCost()%><br>
	<br>
	<br>
	<br>
	<form method="post" action="AddProduct.jsp">
		<button type="submit">Add Again</button>
	</form>
</body>
</html>