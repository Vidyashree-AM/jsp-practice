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
String name = request.getParameter("uname");
pageContext.setAttribute("user", name, PageContext.SESSION_SCOPE);
out.print("user name is"+name);
%>
<a href="Second.jsp">Second jsp page</a>
</body>
</html>