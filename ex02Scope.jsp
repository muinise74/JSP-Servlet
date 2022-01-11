<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	페이지 영역 : <%= pageContext.getAttribute("page") %><br>
	리퀘스트 영역 : <%= request.getAttribute("request") %><br>
	세션 영역 : <%= session.getAttribute("session") %><br>
	어플리케이션 영역 : <%= application.getAttribute("application") %><br>
</body>
</html>