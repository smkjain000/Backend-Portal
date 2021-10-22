<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Subject</title>
</head>
<body>
<h2>Add Subject</h2>
<form action="SubjectController" method="post">
<label>Subject Id</label>
<input type="text" placeholder="Enter Subject Id" name="sid"><br><br>
<label>Subject Name</label>
<input type="text" placeholder="Enter Subject Name" name="sname"><br/>
<br>
<input type="submit" value="Store Record">
<input type="reset" value="reset">
<br> <br>
<a href="http://localhost:8080/backend_portal/SubjectController">Show Subjects List</a>
<br> <br>
<a href="homepage.jsp">Main Menu</a>
</form>
</body>
</html>