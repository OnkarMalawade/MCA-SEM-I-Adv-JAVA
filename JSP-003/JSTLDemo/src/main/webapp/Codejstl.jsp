<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
	<c:out value="${'Hello Onkar!!!'}"></c:out><br>
	<c:out value="${'7020767185'}"></c:out><br>
	
	Name: <c:out value="${param.nm}"></c:out><br>
	Age: <c:out value="${param.age}"></c:out>
	</h2><br>
	<%
		String unm=request.getParameter("nm");
		out.print(unm);
	%>
	
	<c:set var="userAge" scope="session" value="${param.age}"/>
	User Age is <c:out value="${userAge}"></c:out><br>
	<c:if test="${userAge >= 18}">
		<c:out value="${'You are Eligible for Voting...'}"></c:out>
	</c:if>
	<c:if test="${userAge < 18}">
		<c:out value="${'You are Not Eligible for Voting...'}"></c:out>
	</c:if>
	<br>
	<c:forEach var="i" begin="5" end="10">
	Count: <c:out value="${i},"></c:out>
	</c:forEach>
	<br>
	<c:set var="myNm" value="${param.nm}"/>
	<c:set var="myClg" value="fmt"/>
	Hi, I am ${fn:toUpperCase(myNm)} at College ${fn:toUpperCase(myClg)}.
	
	<c:set var="Amount" value="78697.08400"/>
	<fmt:parseNumber var="j" type="number" value="${Amount}"/>
	<p><i>Amount: </i> <c:out value="${j}"></c:out> </p>
</body>
</html>