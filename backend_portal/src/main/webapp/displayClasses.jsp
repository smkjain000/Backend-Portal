<%@page import ="java.util.Iterator" %>
<%@page import ="com.entity.Classes" %>
<%@page import ="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Classes Details</title>
</head>
<body>
<h2>Classes Details</h2>
<table>
<tr>
<th>CID</th>
<th>CSID</th>
</tr>
<%
Object obj=request.getAttribute("obj");
List<Classes> listOfClasses=(List<Classes>)obj;
Iterator<Classes> li=listOfClasses.iterator();
while(li.hasNext()){
	Classes cc=li.next();
	%>
	<tr>
	<td><%=cc.getCid()%></td>
	<td><%=cc.getCsid()%></td>
	</tr>
	<% 
}
%>
</table>

</body>
</html>