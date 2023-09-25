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
		
		int n = Integer.parseInt(request.getParameter("num"));
		
		String op = request.getParameter("Submit");
		int res = n;
		if(op.equals("Fibbo")){
			int num1 = 1;
			int num2 = 1;
			int sum = 0;
	
			out.print(num1+ " ");
			out.print(num2+ " ");
		
			for(int i = 2; i < n; i++){
				sum = num1+num2;
				num1 = num2;
				num2 = sum;
				out.print(sum + " ");
			}
		}
		else if(op.equals("Add 3")){
			out.print(res+3);
		}else if(op.equals("Add 6")){
			out.print(res+6);
		}else{
			out.print("Wrong Option Choosen!!");
		}
	%>
	
</body>
</html>