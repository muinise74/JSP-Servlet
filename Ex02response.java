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
		// response(���䰴ü) : ����ڿ��� ��û����� ������ �� ����ϴ� ��ü
		// ���䵥���� : HTML�� ���� ����, �ؽ�Ʈ, �̹��� ,���� ���� ��
		// ������ �̵�(redirect)
		
		// ���䵥������ ������ �����ϴ� �޼ҵ�
		// MIME Type : data format ����
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>response��ü</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h1>Hello</h1>");
		out.print("</body>");
		out.print("</html>");
	}

}
