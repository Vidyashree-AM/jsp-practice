<%@page import="javax.xml.crypto.dsig.spec.ExcC14NParameterSpec"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page isErrorPage="true" %>
<%out.print("Sorry exception occured"); %>
<%= exception %>
</body>
</html>