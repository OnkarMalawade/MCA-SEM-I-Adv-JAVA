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
     url="jdbc:mysql://localhost:3306/studentdb"  
     user="root"  password=""/>  
     
     <sql:query dataSource="${db}" var="">  
		INSERT INTO studentinfo VALUES(37,'RAM',100,100);  
	</sql:query> 
	
     <sql:query dataSource="${db}" var="rs">  
		SELECT * FROM studentinfo;  
	</sql:query>  
	
	<table border="1">  
		<tr>  
			<th>Roll No</th>  
			<th>Student Name</th>  
			<th>Mark1</th>  
			<th>Mark2</th> 
		</tr>  
		
		<c:forEach var="table" items="${rs.rows}">  
			<tr>  
				<td><c:out value="${table.stdid}"/></td>  
				<td><c:out value="${table.stdname}"/></td>  
				<td><c:out value="${table.mark1}"/></td>  
				<td><c:out value="${table.mark2}"/></td>
			</tr>  
		</c:forEach>  
	</table>
</body>
</html>