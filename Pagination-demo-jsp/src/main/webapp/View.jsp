<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import="java.sql.*,java.util.*,com.java.bean.*,com.java.dao.*" %>
<%
String spageid = request.getParameter("page");
int pageid = Integer.parseInt(spageid);
int total=5;
if(pageid == 1)
{
	
}
else
{
	pageid = pageid -1;
	pageid = pageid*total +1;
}
List<Employee> list = EmployeeDao.getRecords(pageid, total);
out.print("<h1>page id:"+pageid+"</h1>");
out.print("<table>");
out.print("<tr><th>id</th><th>Name</th><th>Salary</th></tr>");
for(Employee e : list)
{
	out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");
}
out.print("</table>");
%>
<a href="View.jsp?page=1">1</a>
<a href="View.jsp?page=2">2</a>
<a href="View.jsp?page=3">3</a>
</body>
</html>