<%@ page import = "java.net.URLDecoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 정보 조회</title>
</head>
<body>
	<h1>쿠키 정보 조회</h1>
	
	<%
		// 사용자의 쿠키정보는 request 객체로부터 접근이 가능
		// 접근 시 Cookie 배열을 반환 받을 수 있음
		Cookie[] cookies = request.getCookies();
		for (int i = 0; i < cookies.length; i++) {
			out.print("쿠키 이름 : "+cookies[i].getName()+"<br>");
			//out.print("쿠키 값 : "+cookies[i].getValue());
			out.print("쿠키 값 : "+URLDecoder.decode(cookies[i].getValue(),"UTF-8"));
			out.print("<hr>");	
		}
	%>
</body>
</html>