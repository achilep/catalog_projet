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
			<li><a href="/Login.ca">Login</a></li>
		</ul>

	</nav>
        
        <div class="container">
    
   <H1>Login </H2>

   <form action="/Login.ca" method="POST">
		 username : <input name="username" type="text"/>
		 Password : <input name="password" type="password" /> 
		 ${echec}
		
		  <input type="submit" value="login">
	</form>

   </div>
   </div>
   <footer class="footer">
		<div>footer content</div>
	</footer>

   <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
   
 </body>
</html>
