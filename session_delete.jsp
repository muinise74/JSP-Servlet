<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>세션 삭제</h1>
	<%
		// 특정 이름의 세션 삭제
		session.removeAttribute("msg");
		// 세션 전부 삭제(로그인 기능에 활용)
		session.invalidate();
	%>
</body>
</html>