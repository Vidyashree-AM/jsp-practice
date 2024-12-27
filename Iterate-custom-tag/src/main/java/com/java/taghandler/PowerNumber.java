package com.java.taghandler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class PowerNumber extends TagSupport{
	
	private int number;
	private int power;
	
	public static int result=1;
	public static int counter=0;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int doStartTag() throws JspException{
	
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() 
	{
		counter++;
		result *= number;
		if(counter == power)
			return SKIP_BODY;
		else
			return EVAL_BODY_AGAIN;
	}
	
	public int doEndTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		try
		{
		  out.print(result);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
}
