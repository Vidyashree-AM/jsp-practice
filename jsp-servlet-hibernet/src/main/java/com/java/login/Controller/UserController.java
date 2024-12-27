package com.java.login.Controller;

import java.io.IOException;

import com.java.login.Dao.UserDao;
import com.java.login.Model.User;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class UserController extends HttpServlet{

	private UserDao dao;
	
	public void init() {
		dao = new UserDao();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		response.sendRedirect("index.jsp");
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		register(request,response);
	}
	
	public void register(HttpServletRequest req,HttpServletResponse res)
	{
		try {
			
		String name = req.getParameter("name");
		String pass = req.getParameter("password");
		
		User u = new User();
		u.setName(name);
		u.setPassword(pass);
		
		dao.SaveUser(u);
		
		RequestDispatcher disp = req.getRequestDispatcher("register-success.jsp");
		disp.forward(req, res);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
