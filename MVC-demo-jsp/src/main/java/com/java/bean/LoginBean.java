package com.java.bean;

public class LoginBean {

	String name;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean Validate()
	{
		if(password.equals("admin"))
		{
			return true;
		}
		
		return false;
	}
}
