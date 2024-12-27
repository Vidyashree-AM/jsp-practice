<%@page import="com.java.RegisterDao.RegisterDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.java.RegisterDao.RegisterDao" %>
<jsp:useBean id="u" class="com.java.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
int status = RegisterDao.register(u);
if(status > 0)
	out.print("you are successfully registered");
%>
</body>
</html>