<%@ page
	import = 'java.net.URLEncoder'
	import = 'java.sql.Connection'
	import = 'java.sql.DriverManager'
	import = 'java.sql.PreparedStatement'
	import = 'java.sql.ResultSet'
	import = 'java.sql.SQLException'
 %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 체크</title>
</head>
<body>

	<%!
		private Connection conn;
		private PreparedStatement psmt;
		private ResultSet rs;
	
		private void getConnection() {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
	
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String id = "hr";
				String pw = "hr";
	
				conn = DriverManager.getConnection(url, id, pw);
	
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	
		}
		private void close() {
			try {
				if (rs != null) {
					rs.close();
				}
				if (psmt != null) {
					psmt.close();
				}
				if (conn != null) {
					conn.close();
				}
	
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		public String login(String id, String pw) {
	
			getConnection();
	
			try {
				String sql = "select * from s_member where m_id = ? and m_pw = ?";
	
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				psmt.setString(2, pw);
	
				rs = psmt.executeQuery();
				
				if (rs.next()) {
					return rs.getString("m_nick");
				}
	
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				close();
			}
			
			return null;
		}
	%>
	
	<%
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = login(id,pw);
		if (nick != null){
			response.sendRedirect("loginTrue.jsp?nick="+URLEncoder.encode(nick,"UTF-8"));
		} else {
			response.sendRedirect("loginFalse.jsp");
		}
	%>
</body>
</html>