<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello <c:out value="${param.user}" default="ABC" />
 	<br> 
 	Welcome to the world of ${fn:toUpperCase("java standard tag library")}

 	<br>
 	<c:set var = "salary" scope = "session" value = "${2000*2}"/>
    <c:out value = "${salary}"/>
 	
 	<br>
	<c:catch var="myException">
   		<% int num = 10/0; %>
	</c:catch>
	<c:if test = "${exception == null}">
		<p>The Exception is : ${myException}
		Exception Message: ${myException.message}</p>
	</c:if> 
 	
 	<c:choose>
         <c:when test = "${salary <= 0}">
            Salary is very low to survive.
         </c:when>
         
         <c:when test = "${salary > 1000}">
            Salary is very good.
         </c:when>
         
         <c:otherwise>
            No comment sir...
         </c:otherwise>
      </c:choose>
 	
 	<%-- forEach is similar to for loop --%>
 	<br>
	<c:forEach var="counter" begin="15" end="25">
 		<c:out value="${counter}"/>
	</c:forEach>
 	
 	<br>
 	<fmt:formatNumber value="00099765.4355" type="currency" 
 		currencySymbol="$" maxFractionDigits="2"/>
	
	<br>
	 
 	<c:import var="data" url="http://www.google.com"/>  
	<c:out value="${data}"/>
	
</body>
</html>