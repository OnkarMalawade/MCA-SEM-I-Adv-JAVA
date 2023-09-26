<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Cookie Session</h2>
	<%!
		final int ONE_MIN = 60;
		int pgCount = 1;
		boolean found;
	%>
	<%
		Cookie cookies[] = request.getCookies();
		if(cookies != null){
			for(int i = 0; i < cookies.length; i++){
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("pageCount")){
					found = true;
					pgCount = Integer.parseInt(cookie.getValue());
					pgCount++;
					cookie.setValue(String.valueOf(pgCount));
					response.addCookie(cookie);
					break;
				}
				else{
					found = false;
				}
			}
		}
			if(cookies != null || found == false){
				Cookie cookie = new Cookie("pageCount",String.valueOf(pgCount));
				cookie.setMaxAge(ONE_MIN);
				response.addCookie(cookie);
			}
			
			out.println("You have hit cookie "+pgCount+" times");
	%>
	
	<a href = "CookieSession.jsp"> Hit Again</a>
</body>
</html>