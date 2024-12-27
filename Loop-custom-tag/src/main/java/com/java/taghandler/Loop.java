package com.java.taghandler;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.TagSupport;

public class Loop extends TagSupport{

	private int start;
	private int end;
	
	public void setStart(int start) {
		this.start = start;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	@Override
	public int doStartTag() throws JspException
	{
		return EVAL_BODY_INCLUDE;
	}
	
	@Override
	public int doAfterBody() throws JspException
	{
		start++;
		if(start < end)
			return EVAL_BODY_AGAIN;
		else
			return SKIP_BODY;
	}
	
	@Override
	public int doEndTag() throws JspException
	{
		return EVAL_PAGE;
	}
}
