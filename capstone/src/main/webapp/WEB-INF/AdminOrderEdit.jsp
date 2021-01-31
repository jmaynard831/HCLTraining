<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Order</title>
</head>
<body>
<c:forEach items="${OIList}" var="oi">
				<h1>${oi.getOI_id()}</h1>
				<form method="post">
				
				<ul>
					<li>Product: ${oi.getProduct_id().getProd_name()}</li>
					<li>Qty: <input type="number" step="1" value="${oi.getQuantity()}" min="0" name="quantity"> 
					</li>
				</ul>
					<input type="text" hidden name="OI_id" value="${oi.getOI_id().toString()}" >	
					<input type="submit" value="Edit">
					</form>
			</c:forEach>
</body>
</html>