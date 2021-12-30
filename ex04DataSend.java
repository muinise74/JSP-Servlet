package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataSend")
public class ex04DataSend extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 사용자가 입력한 Data 가져오기
		String input = request.getParameter("data");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		System.out.println("서버에 요청이 들어왔습니다.....ㅠㅠ");
		System.out.printf("%s 해달래요..\n",input);
		
		
		out.print("<html>");
		out.print("<head><title>response객체</title>");
		out.print("<style>");
		out.print("h1 {");
		out.print("color: red;");
		out.print("background-color: pink;");
		out.print("}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.printf("<h1>%s 해주기 싫은데요....</h1>\n",input);
		out.print("</body>");
		out.print("</html>");
	}

}
