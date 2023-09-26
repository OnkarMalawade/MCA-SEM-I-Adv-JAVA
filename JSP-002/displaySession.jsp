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
		String uNm = (String)application.getAttribute("userNm");
		String mil = (String)application.getAttribute("mail");
		
		out.println("User Name: " + uNm);
		out.println("Mail Id: " + mil);
	%>
</body>
</html>