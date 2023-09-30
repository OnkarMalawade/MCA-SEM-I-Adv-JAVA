<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello...
	<form method = "post" action = "JSPDbDemo.jsp">
		<table>
			<tr>
				<td>ID:</td> <td> <input type="text" name="stdid" size="15" placeholder = "Please Enter Id!"/></td>
			</tr>
			<tr>	
				<td>Name:</td> <td> <input type="text" name="stdname" size="15" placeholder = "Please Enter Name!"/></td>
			</tr>
			<tr>
				<td>Mark 1:</td> <td> <input type="text" name="mark1" size="15" placeholder = "Please Enter Mark 1!"/></td>
			</tr>
			<tr>
				<td>Mark 2:</td> <td> <input type="text" name="mark2" size="15" placeholder = "Please Enter Marks 2!"/></td>
			</tr>
			<tr><td><input type="submit" name="submit" value="submit">  
			</td></tr>
		</table>
	</form>
</body>
</html>