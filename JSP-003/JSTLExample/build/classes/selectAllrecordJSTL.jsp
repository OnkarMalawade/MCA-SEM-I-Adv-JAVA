<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="java.io.*,java.util.*,java.sql.*"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/studinfo"  
     user="root"  password=""/>  
     
     <sql:query dataSource="${db}" var="rs">  
		SELECT * FROM student;  
	</sql:query>  
	
	<table border="1">  
		<tr>  
			<th>Roll No</th>  
			<th>Student Name</th>  
		</tr>  
		
		<c:forEach var="table" items="${rs.rows}">  
			<tr>  
				<td><c:out value="${table.rollno}"/></td>  
				<td><c:out value="${table.studnm}"/></td>  
			</tr>  
		</c:forEach>  
	</table>
</body>
</html>