<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border: 3px solid black;
	}
</style>
</head>
<body>

	<%!
		public String Grade(double a){
			String result = "";
			if (a >= 90) {
				result += "A";
			} else if (a >= 80) {
				result += "B";
			} else if (a >= 70) {
				result += "C+";
			} else if (a >= 60) {
				result += "D";
			} else{
				result += "F";
			}
			
			if (a >= 60 && (int)a%10 >= 5){
				result += "+";
			}
			
			return result;
		}
	%>
	
	<%
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		int java = Integer.parseInt(request.getParameter("java"));
		int web = Integer.parseInt(request.getParameter("web"));
		int iot = Integer.parseInt(request.getParameter("iot"));
		int android = Integer.parseInt(request.getParameter("android"));
		double avg = (java+web+iot+android)/4.0;
		String grade = Grade(avg);
	%>
	
	<table>
		<tr>
			<td>이름</td>
			<td><%= name %></td>
		</tr>
		<tr>
			<td>Java 점수</td>
			<td><%= java %></td>
		</tr>
		<tr>
			<td>Web 점수</td>
			<td><%= web %></td>
		</tr>
		<tr>
			<td>IOT 점수</td>
			<td><%= iot %></td>
		</tr>
		<tr>
			<td>Android 점수</td>
			<td><%= android %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%= avg %></td>
		</tr>
		<tr>
			<td>학점</td>
			<th><%= grade %></td>
		</tr>
	</table>
</body>
</html>