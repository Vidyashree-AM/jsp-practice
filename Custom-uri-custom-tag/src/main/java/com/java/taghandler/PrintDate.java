package com.java.taghandler;

import java.util.Calendar;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class PrintDate extends TagSupport{
   
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException
	{
		JspWriter out = pageContext.getOut();
		try {
			out.print(Calendar.getInstance().getTime());
		}catch(Exception e) {
		     e.printStackTrace();
		}
		
		return SKIP_BODY;
	}
}
