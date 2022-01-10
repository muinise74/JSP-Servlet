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
	<h1>세션 값 조회</h1>
	<!-- 세셩 정보를 바로 출력할 때 -->
	<!-- 세션에 저장된 값 : session.getAttribute("msg") -->
	<!-- 세션 정보를 활용할 때 -->
	<%
		String msg = (String)session.getAttribute("msg");
		out.print(msg);
		Integer num = (Integer)session.getAttribute("num");
		out.print(num);
		ArrayList<String> list = (ArrayList)session.getAttribute("list");
		for (int i = 0; i < list.size(); i++){
			out.print(list.get(i)+"<br>");
		}
	%>
</body>
</html>