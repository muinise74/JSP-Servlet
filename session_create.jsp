<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 세션 : 사용자의 정보를 서버에 저장하는 기술, 내장객체
		// 논출되면 안되는 중요한 정보들
		session.setAttribute("msg","세션에 데이터 저장");
		session.setAttribute("num",150);
		ArrayList<String> list = new ArrayList<String>();
		list.add("오늘");
		list.add("미세먼지");
		list.add("최악");
		session.setAttribute("list",list);
		
		// 세션정보의 유효기간을 설정하는 메소드(초단위)
		session.setMaxInactiveInterval(30);
	%>
</body>
</html>