<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="com.java.bean.LoginBean" %>
<p>You have loged in successfully</p>
<%
LoginBean bean = (LoginBean)request.getAttribute("Bean");
out.print("welcome:"+ bean.getName());
%>
</body>
</html>