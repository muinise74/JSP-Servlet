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
		
		// ����ڰ� �Է��� Data ��������
		String input = request.getParameter("data");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		System.out.println("������ ��û�� ���Խ��ϴ�.....�Ф�");
		System.out.printf("%s �ش޷���..\n",input);
		
		
		out.print("<html>");
		out.print("<head><title>response��ü</title>");
		out.print("<style>");
		out.print("h1 {");
		out.print("color: red;");
		out.print("background-color: pink;");
		out.print("}");
		out.print("</style>");
		out.print("</head>");
		out.print("<body>");
		out.printf("<h1>%s ���ֱ� ��������....</h1>\n",input);
		out.print("</body>");
		out.print("</html>");
	}

}
