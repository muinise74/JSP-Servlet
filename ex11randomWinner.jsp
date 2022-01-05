<%@ page import="java.util.Random" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style = "text-align: center;">
		<fieldset>
			<legend>랜덤 당첨 결과</legend>
			<%  
				request.setCharacterEncoding("UTF-8");
				String title = request.getParameter("title");
				String[] item = request.getParameterValues("item");
				
				Random rd = new Random();
				int i = rd.nextInt(item.length);
				out.print(title+"<br>");
				out.print(item[i]);
			%>
		</fieldset>
	</div>
	
</body>
</html>