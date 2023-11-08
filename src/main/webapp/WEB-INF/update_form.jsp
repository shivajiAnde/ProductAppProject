<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp" %>
</head>
<body>
	<div class="container">
		<form action="${pageContext.request.contextPath }/handler_product" method="post">
				<h1 style="text-align: center">Change the Product details</h1>
			<pre>
				ProductName <input type="text" name="name" placeholder="Enter the product" value="${product.name }"/>
				About Product <input type="text" rows="5" name="description" placeholder="About the product"  value="${product.description }">
				Price <input type="number" name="price" placeholder="Enter the price" value="${product.price }">		
			</pre>
			<button><a href="${pageContext.request.contextPath }/">back</a></button>
			<button type="submit">update</button>
		</form>
	</div>
</body>
</html>