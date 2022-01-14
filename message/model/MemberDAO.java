package com.message.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class MemberDAO {
	
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;

	public void connect() {
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
	public void close() {
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
	
	public MemberDTO login(String email, String pw) {
		connect();
		MemberDTO member = null;
		try {
			String sql = "select * from web_member where m_email = ? and m_pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();
			if (rs.next()) {
				String temp1 = rs.getString("m_email");
				String temp2 = null;
				String temp3 = rs.getString("m_tel");
				String temp4 = rs.getString("m_adress");
				member = new MemberDTO(temp1,temp2,temp3,temp4);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return member;
	}
	
	public int memberJoin(MemberDTO member) {
		connect();
		int cnt = 0;
		try {
			String sql = "insert into web_member values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, member.getM_email());
			psmt.setString(2, member.getM_pw());
			psmt.setString(3, member.getM_tel());
			psmt.setString(4, member.getM_address());
			cnt =  psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	public int memberUpdate(MemberDTO member) {
		connect();
		int cnt = 0;
		try {
			String sql = "update web_member set m_pw = ?, m_tel = ?, m_adress = ? where m_email = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(4, member.getM_email());
			psmt.setString(1, member.getM_pw());
			psmt.setString(2, member.getM_tel());
			psmt.setString(3, member.getM_address());
			cnt =  psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
}
