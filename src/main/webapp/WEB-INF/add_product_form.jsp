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
		<form action="handler_product" method="post">
				<h1 style="text-align: center">Fill the Product details</h1>
			<pre>
				ProductName <input type="text" name="name" placeholder="Enter the product"/>
				About Product <input type="text" rows="5" name="description" placeholder="About the product" >
				Price <input type="number" name="price" placeholder="Enter the price">		
			</pre>
			<button><a href="${pageContext.request.contextPath }/">back</a></button>
			<button type="submit">Add</button>
		</form>
	</div>
</body>
</html>