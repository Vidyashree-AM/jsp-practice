package com.java.employee.web;

import java.io.IOException;

import com.java.employe.model.User;
import com.java.employee.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class UserServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		User u = new User();
		u.setName(name);
		u.setPassword(password);
		
         try {
        	 UserDao.register(u);
         }catch(Exception e) {
        	 e.printStackTrace();
         }
        
		response.sendRedirect("registered.jsp");
	}
	
}
