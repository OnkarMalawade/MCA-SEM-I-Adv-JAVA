<%@ page import = "java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Integer n = Integer.parseInt(request.getParameter("num"));
	if(n % 2 == 0){
		out.print("Even Number " + n );
	}
	else{
		out.print("Odd Number " + n );
	}
	
	Calendar c = Calendar.getInstance();
	int h = c.get(Calendar.HOUR_OF_DAY);
	String user = request.getParameter("uname");
	
	if(h > 0 &&  h < 12){
		out.println("<b> Good Morning! " + user + "</b>");
	}
	else if(h > 12 && h < 15){
		out.println("<b> Good Afternoon! " + user + "</b>");
	}else if(h > 15 && h < 18){
		out.println("<b> Good Evening! " + user + "</b>");
	}else{
		out.println("<b> Good Night! " + user + "</b>");
	}
	
	%>
</body>
</html>