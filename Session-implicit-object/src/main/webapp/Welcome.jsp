<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome jsp</title>
</head>
<body>
<%
String name=request.getParameter("uname");
out.print("user name is " + name);
session.setAttribute("user", name);
%>
<a href="Second.jsp"> Second jsp page</a>
</body>
</html>