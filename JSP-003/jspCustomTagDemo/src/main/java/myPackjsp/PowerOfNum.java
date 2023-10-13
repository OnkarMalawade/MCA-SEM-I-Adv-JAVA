package myPackjsp;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.BodyTagSupport;

public class PowerOfNum extends BodyTagSupport{
	private int num, pow;

	public void setNum(int num) {
		this.num = num;
	}

	public void setPow(int pow) {
		this.pow = pow;
	}
	
	public int doStartTag() throws JspException{
		long result = 1;
		
		for(int i=1; i<=pow; i++) {
			result = result * num;
		}
		
		JspWriter out = pageContext.getOut();
		
		try {
			out.print(num +" ^ "+pow+" = " + result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SKIP_BODY;	
	}
}
