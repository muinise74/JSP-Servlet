<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 선언문 : 필드(멤버변수,전역변수)나 메소드를 만들 때 사용  -->
	<%! int myNum1 = 100;
		public String hello(){
			return "안녕하세요..";
		}
	%>
	<% int myNum2 = 200;%>
	<%= hello() %>
</body>
</html>