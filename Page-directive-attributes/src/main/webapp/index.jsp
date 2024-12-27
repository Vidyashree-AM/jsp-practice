<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.util.Date" %>
<%@ page  info="my jsp page" %>
<%@ page buffer="16kb" %>
Today is : <%= new Date() %>
<%@ page errorPage="Myerrorpage.jsp" %>
<% int i=100/0; %>
</body>
</html>