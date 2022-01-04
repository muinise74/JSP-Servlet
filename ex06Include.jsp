<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- 내 페이지에 외부 페이지를 포함시키는 태그 -->
	<iframe src = "https://www.daum.net" width = "600px" height = "600px"></iframe>
	<% String name = "PBK"; %>
	<%@ include file = "ex06Test.jsp"%>
</body>
</html>