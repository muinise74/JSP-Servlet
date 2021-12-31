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
		// Post 방식 한글 깨짐 방지 메소드
		request.setCharacterEncoding("UTF-8");
		
		System.out.println("요청이 들어 옴!!");
		
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		System.out.println("ID :"+id);
		System.out.println("PW :"+pw);

//    // Get 방식일 때 호출
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Get방식으로 실행");
//	}
//	// Post 방식일 때 호출
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Post방식으로 실행");
//	}

	}
}
