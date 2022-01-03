<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border: 1px solid black;
	}
	td {
		border : 1px solid black;
	}
</style>
</head>
<body>
	<table>
	<tr>
		<%
			String a ="";
			for(int i = 1; i <= 10; i++){
				a += "<td>";
				a += i;
				a += "</td>";
			}
		%>
		<%= a %>
	</tr>
	</table>
</body>
</html>