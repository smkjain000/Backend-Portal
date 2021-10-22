<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Assign Teachers to Subjects</h2>
<form action="AssignTeachersController" method="post">
<label>Teacher Id</label>
<input type="text" placeholder="Enter Teacher Id" name="stid"><br><br>
<label>Subject Id</label>
<input type="text" placeholder="Enter Subject Id" name="sid"><br/>
<br>
<input type="submit" value="Store Record">
<input type="reset" value="reset">
<br> <br>
<a href="http://localhost:8080/backend_portal/AssignTeachersController">Show List</a>
<br> <br>
<a href="homepage.jsp">Main Menu</a>
</form>
</body>
</html>