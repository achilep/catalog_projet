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

		<ul class="nav navbar-nav">
	     	<a href="/welcome.ca" class="navbar-brand">Homee</a>
        
			<a class="navbar-brand" href="/category.ca">category</a>
			<a class="navbar-brand" href="/product.ca">product</a>
			<a class="navbar-brand" href="/product.ca">product per category </a>
			
		</ul>
        <ul class="nav navbar-nav navbar-right">
        <li><a href="/Signup.ca">signup</a></li>
		
			<li><a href="/Logout.ca">Logout</a></li>
		</ul>

	</nav>
	
        <div class="container">
	
	<ol>
			
			<c:forEach items="${catetomody}" var="cat">
			<form action="/updatecategory.ca?category_id=${cat.category_id}" method="POST">
		product name : <input name="category_name" value="${cat.category_name}" type="text" /> 
		 product  description : <input name="category_des" value="${cat.category_description}" type="text"/>
		
		  <input type="submit" value="modify"/>
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