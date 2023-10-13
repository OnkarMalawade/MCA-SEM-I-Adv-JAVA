<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page="p2.jsp">
		<jsp:param value="ABC" name="userNm"/>
		<jsp:param value="FAMT" name="clgNm"/>
	</jsp:forward>
</body>
</html>