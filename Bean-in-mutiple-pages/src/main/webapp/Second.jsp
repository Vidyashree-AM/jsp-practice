<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="com.java.bean1.User" scope="session"></jsp:useBean>

Record:
<jsp:getProperty property="name" name="u"/>
<jsp:getProperty property="password" name="u"/>

</body>
</html>