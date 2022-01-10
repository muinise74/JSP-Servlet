<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<form action = "LoginService" method = "post">
		<%
			String nick = (String)session.getAttribute("login_nick");
			if (nick == null){
				out.print("<input type = 'text' name ='id'><br>");
				out.print("<input type = 'password' name = 'pw'><br>");
				out.print("<input type ='submit' value = '로그인'>");
				
			} else {
				out.print("<h1>"+nick+"님</h1>");
				out.print("로그인 중입니다<br>");
				out.print("<a href = 'logout.jsp'>로그아웃 하기</a>");
			}
		%>
	</form>
</body>
</html>