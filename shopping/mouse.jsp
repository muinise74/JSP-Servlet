<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	마우스에 대한 상세 페이지입니다.<br>
	모델명: 로지텍 게이밍 마우스<br>
	제품가격: 21,900원<br>
	<%
	//1.상품정보를 저장한 쿠기객체 생성
			Cookie mouse = new Cookie("mouseitem",URLEncoder.encode("로지텍 게이밍 마우스","UTF-8"));
		
			//2.1시간동안 유지
			mouse.setMaxAge(3600);
			
			//3.클라이언트PC에 쿠키를 보내기 위해 response객체에 저장
			response.addCookie(mouse);
		
	%>
	<a href="list.jsp">제품 목록 페이지</a>
</body>
</html>