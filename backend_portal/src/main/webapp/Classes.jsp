<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add classes</title>
</head>
<body>
<h2>Add Classes</h2>
<form action="ClassesController" method="post">
<label>Class Id</label>
<input type="text" placeholder="Enter Class Id" name="cid"><br><br>
<label>Subject Id</label>
<input type="text" placeholder="Enter Subject Id" name="csid"><br/>
<br>
<input type="submit" value="Store Record">
<input type="reset" value="reset">
<br> <br>
<a href="http://localhost:8080/backend_portal/ClassesController">Show Classes List</a>
<br> <br>
<a href="homepage.jsp">Main Menu</a>
</form>

</body>
</html>