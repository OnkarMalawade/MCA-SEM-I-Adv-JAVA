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
		String nm = request.getParameter("nm");
		String add = request.getParameter("add");
		String browserNm = request.getParameter("browserNm");
		
		out.println("Name:" + nm);
		out.println("Address:" + add);
		out.println("Browser:" + browserNm);
	%>
</body>
</html>