package myPackjsp;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class DateHandler extends SimpleTagSupport{
	public void doTag() throws JspException, IOException{
		JspWriter out = getJspContext().getOut();
		//Writing Date Format
		SimpleDateFormat sdf = new SimpleDateFormat("E, dd-MM-yyyy HH:mm:ss a");
		Calendar cal = Calendar.getInstance();// Feteching date from the Calender Class
		Date dt = cal.getTime();
		out.println("Current Date & Time is : " +sdf.format(dt));
	}
}
