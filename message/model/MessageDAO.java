package com.message.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MessageDAO {
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

	public ArrayList<MessageDTO> showMSG(String email) {
		ArrayList<MessageDTO> messages = new ArrayList<MessageDTO>();
		connect();
		try {
			String sql = "select * from web_message where m_receiveEmail = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
			rs =  psmt.executeQuery();
			while (rs.next()) {
				messages.add(new MessageDTO(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return messages;
	}
	
	public int sendMSG(MessageDTO msg) {
		int cnt = 0;
		connect();
		try {
			String sql = "insert into web_message values(num_seq.nextval,?,?,?,sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, msg.getSendName());
			psmt.setString(2, msg.getReceiveEmail());
			psmt.setString(3, msg.getContent());
			cnt =  psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
	public int deleteMSG(String email) {
		int cnt = 0;
		connect();
		try {
			String sql = "delete from web_message where m_receiveEmail = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, email);
			cnt =  psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	
}
