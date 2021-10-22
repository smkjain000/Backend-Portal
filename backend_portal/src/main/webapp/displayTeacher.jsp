<%@page import ="java.util.Iterator" %>
<%@page import ="com.entity.Teacher" %>
<%@page import ="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher details</title>
</head>
<body>
<h2>Teacher details</h2>
<table>
<tr>
<th>TID</th>
<th>TName</th>
</tr>
<%
Object obj=request.getAttribute("obj");
List<Teacher> listOfTeacher=(List<Teacher>)obj;
Iterator<Teacher> li=listOfTeacher.iterator();
while(li.hasNext()){
	Teacher tt=li.next();
	%>
	<tr>
	<td><%=tt.getTid()%></td>
	<td><%=tt.getTname()%></td>
	</tr>
	<% 
}
%>
</table>
</body>
</html>