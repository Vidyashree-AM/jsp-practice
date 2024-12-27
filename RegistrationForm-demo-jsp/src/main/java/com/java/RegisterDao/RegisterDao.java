package com.java.RegisterDao;

import java.sql.*;

import com.java.bean.User;

public class RegisterDao {
	
	public static Connection getConnection()
	{
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_schema","root","vidya123");			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static int register(User u)
	{
		Connection con = null;
		 int status = 0;
		try
		{
		   con = getConnection();
		   PreparedStatement ps = con.prepareStatement("insert into User values(?,?)");
		   ps.setString(1, u.getName());
		   ps.setString(2, u.getPassword());
		   status = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}

}
