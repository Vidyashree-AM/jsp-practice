package com.java.taghandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class PrintRecord extends TagSupport{

	String tableName;
	String userName;
	
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public int doStartTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_schema","root","vidya123");
			PreparedStatement ps = con.prepareStatement("select * from "+ tableName+" where name=?");
			ps.setString(1, userName);
			ResultSet rs = ps.executeQuery();
			if(rs != null)
			{
				ResultSetMetaData mt = rs.getMetaData();
				int totalcols = mt.getColumnCount();
				out.print("<table border='2'>");
				out.print("<tr>");
				for(int i=1;i<=totalcols;i++)
				{
					out.print("<th>"+mt.getColumnName(i)+"</th>");
				}
				out.print("</tr>");
				if(rs.next())
				{
					out.print("<tr>");
					for(int i=1;i<=totalcols;i++)
					{
						out.print("<td>"+rs.getString(i)+"</td>");
					}
					out.print("</tr>");
				}
				else
				{
					out.print("table or user doesnot exits");
				}
				out.print("</table>");
				con.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
	
}
