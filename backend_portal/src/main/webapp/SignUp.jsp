<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<h2>Backend Admin Portal for Learner's Academy</h2>
<title>Create Account</title>
</head>
<body>
<h2>Create Account</h2>
<form action="LoginController" method="post">
<label>Email id</label>
<input type="email" placeholder="Enter Email" name="email"><br><br>
<label>Password</label>
<input type="password" placeholder="Enter Password" name="pass"><br/>
<br>
<input type="submit" value="SignUp"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>