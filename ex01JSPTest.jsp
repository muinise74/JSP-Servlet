<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- JSP에서 정수형 변수 num에 100을 넣고 웹페이지에 출력 -->
	<!-- JSP에서 java 코드를 사용하고 싶다면 스크립트릿을 사용한다. -->
	
	<%-- JSP주석 F12 눌러도 안보여요--%>
	
	<%
		// <% 안쪽은 java 영역입니다.
		// java 에서 처럼 주석 달면 JSP 주석 처럼 사용됩니다.
		
		int num = 100;
	%>
	
	<!-- JSP에서 java 변수의 값을 웹페이지로 꺼내고 싶을 때는 표현식을 사용한다. -->
	num의 값 : <%= num %>
	<br>
	
	<hr width = "500px" size = "<%=num %>px" color = "red">
</body>
</html>