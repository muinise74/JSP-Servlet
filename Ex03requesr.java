package com.smhrd.servlet1229;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex03requesr")
public class Ex03requesr extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		String ip = request.getRemoteAddr();
		

		String name;
		out.print("<html>");
		out.print("<head><title>Request&Response �ǽ�</title>");
		out.print("</head>");
		out.print("<body>");
		
		if (ip.equals("220.93.229.187")) {
			name = "�ڻ��";
		} else if (ip.equals("211.223.37.175")) {
			name = "���϶�";
		} else if (ip.equals("220.80.88.62")) {
			name = "���°�";
		} else if (ip.equals("211.63.240.99")) {
			name = "�ڳ���";
		} else if (ip.equals("59.0.236.207")) {
			name = "����";
		} else if (ip.equals("222.102.104.24"))	{
			name ="��";
		} else {
			name = "��";
		}
		
		out.printf("<h1>%s�� ȯ���մϴ�.\n</h1>",name);
		out.print("</body>");
		out.print("</html>");
	}

}
