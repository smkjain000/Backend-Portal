<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Welcome to Backend portal home page </h2>
<a href="homepage.jsp"><button>Home</button></a><br><br>

<a href="teacher.jsp"><button>Manage Teacher</button></a>
<a href="subject.jsp"><button>Manage Subject</button></a>
<a href="Classes.jsp"><button>Manage Classes</button></a>
<br> <br>
<a href="AssignTeachers.jsp"><button>Assign Teachers to Subjects</button></a>
<br> <br>
<form action="LogoutController" method="get">
<button>Logout</button>
</form>
</body>
</html>