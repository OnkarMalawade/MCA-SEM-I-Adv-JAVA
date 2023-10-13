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
		Integer n1 = Integer.parseInt(request.getParameter("num1"));
		Integer n2 = Integer.parseInt(request.getParameter("num2"));
		
		Integer sum = n1 + n2;
		
		out.println("Sum "+n1+" + "+n2+" = "+sum);
	%>
</body>
</html>