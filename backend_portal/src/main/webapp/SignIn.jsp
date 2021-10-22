<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<h2>Backend Admin Portal for Learner's Academy</h2>
<h2>Login Page</h2>
<form action="LoginController" method="get">
<label>Email id</label>
<input type="email" placeholder="Enter Email" name="email"><br><br>
<label>Password</label>
<input type="password" placeholder="Enter Password" name="pass"><br/>
<br>
<input type="submit" value="SignIn"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="SignUp.jsp">SignUp!</a>

</body>
</html>