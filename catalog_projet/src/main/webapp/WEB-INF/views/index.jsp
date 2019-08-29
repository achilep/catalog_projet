<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
 <head>
  <title>Yahoo!!</title>
  <!-- Bootstrap core CSS -->
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
	<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
	
  
  </head>
    <body>
    <nav class="navbar navbar-default">

		<a href="/welcome.ca" class="navbar-brand">HOmee</a>
        <ul class="nav navbar-nav">
			<li class="active"><a href="/category.ca">category</a></li>
			<li><a href="/product.ca">product</a></li>
			
		</ul>
        <ul class="nav navbar-nav navbar-right">
        <li><a href="/Signup.ca">signup</a></li>
			<li><a href="/Login.ca">Login</a></li>
		</ul>

	</nav>
        
        <div class="container">
		<H1>Heading</H1>
		Body of the Page
	
        
   <H1>Welcome </H2>

   the product and category page+welcome
						     <ol>
			<c:forEach items="${product}" var="todo">
			   <li><img src="data:image/jpg;Base64,${todo.baseimg}" width="40" height="50"/></li>

			   <li>${todo.product_id}</li>
			   <li>${todo.product_name}</li>
			   <li>${todo.product_description}</li>
			   <li>${todo.category_name}</li>
			   <a href="delete.ca?product_id=${todo.product_id}" > delete</a></li> <a href="modifyproduct.ca?product_id=${todo.product_id}"> modify</a></li> 			   			    	 
			</c:forEach>
				     <ol>
			<c:forEach items="${category}" var="cat">
			   <li>${cat.category_id}</li>
			   <li>${cat.category_name}</li>
			   <li>${cat.category_description}</li>
			    	 
			</c:forEach>
			  			
			      
   </div>
   </div>

	<footer class="footer">
		<div>footer content</div>
	</footer>

   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
 </body>
</html>
