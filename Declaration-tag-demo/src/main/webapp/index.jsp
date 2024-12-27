<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declaration tag demo</title>
</head>
<body>
<%! int data=5; %>
<%= "value of data is"+ data %>
<%! int cube(int n){
    return n*n*n;	
}%>
<%= "Cube of 3 is:" + cube(3) %>
</body>
</html>