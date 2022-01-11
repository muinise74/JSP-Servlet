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
		/* Scope : 웹 서버에 저장할수 있는 영역
		 	1. pageContext : 하나의 웹 페이지 안에서 정보를 저장하는 영역
			2. request : 하나 이상의 웹 페이지 안에서 정보를 저장하는 영역
		 		- forward 방식으로 이동할 경우 데이터를 가지고 넘어간다.
		 	3. session : 하나 브라우저 안에서 정보를 저장하는 영역
			4. application : 하나의 웹 application 안에서 정보를 저장하는 영역
		 */
		 
		 pageContext.setAttribute("page","100");
		 request.setAttribute("request","200");
		 session.setAttribute("session","300");
		 application.setAttribute("application","400");
	%>
	
	페이지 영역 : <%= pageContext.getAttribute("page") %><br>
	리퀘스트 영역 : <%= request.getAttribute("request") %><br>
	세션 영역 : <%= session.getAttribute("session") %><br>
	어플리케이션 영역 : <%= application.getAttribute("application") %><br>
	
	<%	
		response.sendRedirect("ex02Scope.jsp");
		/* forward
			- 웹 서버 내부에서만 이동하는 기술
			- request와 response정보를 가지고 이동
			- URL이 변하지 않는다..
		*/
		//RequestDispatcher dispatcher = request.getRequestDispatcher("ex02Scope.jsp");
		//dispatcher.forward(request, response);
	%>
</body>
</html>