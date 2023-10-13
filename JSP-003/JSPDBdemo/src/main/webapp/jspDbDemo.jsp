<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
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
	int id = Integer.parseInt(request.getParameter("stdid"));
	String  stdname = request.getParameter("stdname");
	int mark1 = Integer.parseInt(request.getParameter("mark1"));
	int mark2 = Integer.parseInt(request.getParameter("mark2"));
	
	String dNm = "com.mysql.cj.jdbc.Driver";
	
	try{
		Class.forName(dNm);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "");
		Statement stmt = con.createStatement();
		String sql = "INSERT INTO studentinfo VALUES("+id+",'"+stdname+"',"+mark1+","+mark2+")";
		out.print(sql);
		// executeUpdate() Rows Affected
		int noOfRowsAffected = stmt.executeUpdate(sql);
		//  if you want to print data execute file  want  to execute() use
		if(noOfRowsAffected != 0){
			out.println("Value Inserted");
		}
		else{
			out.println("Value Not Inserted");			
		}
	}
	catch(Exception e){
		out.print(e);
	}
	%>

</body>
</html>