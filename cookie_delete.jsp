<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 삭제</title>
</head>
<body>
	<h1>쿠키 삭제</h1>
	
	<%
		
		Cookie cookie = new Cookie("message","");
		cookie.setMaxAge(0); // 쿠키 정보 삭제 <- 만료 기한 = 0
		response.addCookie(cookie);
	%>
</body>
</html>