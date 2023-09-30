<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Record</title>
</head>
<body>
	<%
	String dNm = "com.mysql.cj.jdbc.Driver";
	
	try{
		Class.forName(dNm);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentsdb", "root", "");
		Statement stmt = con.createStatement();
		String sql = "SELECT * FROM studentinfo";
		
		ResultSet resultSet = stmt.executeQuery(sql);
	%>
	<table border="1">
		<%while(resultSet.next()) { %>
		<tr>
			<td><%=resultSet.getString("stdid")%></td>
			<td><%=resultSet.getString("stdname")%></td>
			<td><%=resultSet.getString("mark1")%></td>
			<td><%=resultSet.getString("mark2")%></td>
			<td><%=resultSet.getInt("mark1")+resultSet.getInt("mark2")%></td>
		</tr>
		<%}// close while %>
	</table>
	<%
		resultSet.close();
		con.close();
	} 
	catch(Exception e){
		out.println(e.getMessage());
	}
	%>
</body>
</html>