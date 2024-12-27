package com.java.dao;

import java.sql.*;
import java.util.*;

import com.java.bean.Employee;

public class EmployeeDao {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_schema", "root", "vidya123");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}

	public static List<Employee> getRecords(int start,int end)
	{
		ArrayList<Employee> list = new ArrayList<Employee>();
		try
		{
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from Employee limit "+(start-1)+", "+end);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
			    list.add(e);
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
}
