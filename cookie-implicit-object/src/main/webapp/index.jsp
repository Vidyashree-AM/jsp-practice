<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is index page</h1>
<%
Cookie ck =new Cookie("name","Vidya");
response.addCookie(ck);
%>
<a href="process.jsp">Visit</a>
</body>
</html>