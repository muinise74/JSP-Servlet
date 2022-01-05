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
		request.setCharacterEncoding("UTF-8");
	int num = Integer.parseInt(request.getParameter("num"));
	%>
	<div style = "text-align: center;">
		<fieldset>
			<legend>랜덤 당첨 작성</legend>
			<form action ="ex11randomWinner.jsp" method = "post">
				<table align = "center">
					<%for (int i = 0; i <= num; i++){
						if (i == 0) {
							out.print("<tr><td>주제</td><td><input type = 'text' name = 'title'></td></tr>");
						} else {
							out.print("<tr><td>Item"+i+"</td><td><input type = 'text' name = 'item'></td></tr>");
						}
					}%>
					<tr>
						<td colspan = "2">
							<input type = "submit" value ="시작">
						</td>
					</tr>
				</table>
			</form>
		</fieldset>
	</div>
</body>
</html>