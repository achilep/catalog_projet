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
	
	<ol>
			<c:forEach items="${prodtoupdate}" var="tod">
			<form action="/modifyproduct.ca?product_id=${tod.product_id}" method="POST">
		product name : <input name="prod_name" value="${tod.product_name}" type="text" /> 
		 product  description : <input name="prod_des" value="${tod.product_description}" type="text"/>
		 file to upload <input type="file" name="file" value="data:image/jpg;Base64,${todo.baseimg}" width="40" height="50""/>
		  <input type="submit" value="${update}"/>
	</form>
			 
			  	</c:forEach>
        
    
   <H1>update </H2>
      <p><font color="red">${errorMessage}</font></p>
	<form action="/photo.ca" method="POST">
		product name : <input name="prod_name" type="text" /> 
		 product  description : <input name="prod_des" type="text"/>
		 file to upload <input type="file" name="file" value="Upload"/>
		  <input type="submit" value="Submit">
	</form>
   signup page
   </div>
   </div>

<footer class="footer">
		<div>footer content</div>
	</footer>

   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>


</body>

</html>