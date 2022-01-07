<%@ page import="javax.servlet.http.Cookie"
	import ="java.net.URLEncoder"	
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cookie 생성</title>
</head>
<body>
	
	<h1>Cookie 생성</h1>
	
	<%
		// Cookie 생성
		Cookie cookie = new Cookie("message","CookieCreate");
		Cookie cookie2 = new Cookie("message2",URLEncoder.encode("Cookie Create!한글","UTF-8"));
		response.addCookie(cookie);
		response.addCookie(cookie2);
		
	%>
</body>
</html>