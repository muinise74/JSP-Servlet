package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex02response")
public class Ex02response extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response(응답객체) : 사용자에게 요청결과를 보내줄 때 사용하는 객체
		// 응답데이터 : HTML과 같은 문서, 텍스트, 이미지 ,파일 형태 등
		// 페이지 이동(redirect)
		
		// 응답데이터의 포맷을 설정하는 메소드
		// MIME Type : data format 설정
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>response객체</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Hello</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
