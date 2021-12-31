package com.smhrd.sevlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ImageView")
public class ex05ImageView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		
		String src = "img/";
		
		if (num == 1) {
			src += "����̹ڽ�1.jpg";
		} else if (num == 2) {
			src += "����̹ڽ�2.jpg";
		} else if (num == 3) {
			src += "�������1.jpg";
		}
		
		out.print("<html>");
		out.print("<head><title>Image</title></head>");
		out.print("<body>");
		out.printf("<img src = '%s' alt = '�ش� �̹����� �ҷ��� �� �����ϴ�.'>\n",src);
		out.print("</body>");
		out.print("</html>");
	}

}
