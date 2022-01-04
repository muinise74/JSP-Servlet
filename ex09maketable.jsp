<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border = "1px solid black">
		<%
			request.setCharacterEncoding("UTF-8");
			int floor = Integer.parseInt(request.getParameter("floor"));
			int room = Integer.parseInt(request.getParameter("room"));
			for (int i = 1; i <= floor; i++) {
				out.print("<tr><th colspan ='"+room+"'>"+(floor+1-i)+"층</th></tr><tr>");
				for (int j = 1; j <= room; j++) {
					if (j < 10) {
						out.print("<td align = 'right'>"+(floor+1-i)+"0"+j+"호</td>");
					} else {
						out.print("<td align = 'right'>"+(floor+1-i)+""+j+"호</td>");
					}
				}
				out.print("</tr>");
			}
		%>	
	</table>
</body>
</html>