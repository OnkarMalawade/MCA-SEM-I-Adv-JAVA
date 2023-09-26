<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Session management Demo</h2>
	
	<%!
		int count  = 1;
	%>
	<%
		String param = request.getParameter("count");
		if(param != null){
			count  = Integer.parseInt(param);
		}
		out.println("You have visited page " + count);
		if(count >= 100000){
			out.println("Abey Saale Ruk...");
		}
	%>
	<a href = "UrlSessionDemo.jsp?count=<%=count+1%>">Hit Again</a>
</body>
</html>