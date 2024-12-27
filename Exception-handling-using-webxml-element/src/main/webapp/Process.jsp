<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>To process the input</title>
</head>
<body>
<%
String n1 = request.getParameter("n1");
String n2 = request.getParameter("n2");
int a = Integer.parseInt(n1);
int b = Integer.parseInt(n2);
int c = a/b;
out.print("Division result is:"+ c);
%>
</body>
</html>