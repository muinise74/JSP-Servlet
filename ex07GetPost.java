package com.smhrd.sevlet1231;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPost")
public class ex07GetPost extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Post ��� �ѱ� ���� ���� �޼ҵ�
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("��û�� ��� ��!!");
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		System.out.println("ID :"+id);
		System.out.println("PW :"+pw);

//    // Get ����� �� ȣ��
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Get������� ����");
//	}
//	// Post ����� �� ȣ��
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Post������� ����");
//	}

	}
}
