<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Teacher</title>
</head>
<body>
<h2>Add Teacher</h2>
<form action="TeacherController" method="post">
<label>Teacher Id</label>
<input type="text" placeholder="Enter Teacher Id" name="tid"><br> <br>
<label>Teacher Name</label>
<input type="text" placeholder="Enter Teacher Name" name="tname"><br/>
<br>
<input type="submit" value="Store Record">
<input type="reset" value="reset">
<br> <br>
<a href=http://localhost:8080/backend_portal/TeacherController>Show Teachers List</a>
<br> <br>
<a href="homepage.jsp">Main Menu</a>
</form>
</body>
</html>