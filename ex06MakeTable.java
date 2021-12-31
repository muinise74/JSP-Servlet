package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MakeTable")
public class ex06MakeTable extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int cnt = Integer.parseInt(request.getParameter("cnt"));
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head><title>MakeTable</title></head>");
		out.print("<body>");
		out.print("<table border = '1px solid black'>");
		out.printf("<tr><th colspan = '%d'>Room</th></tr>\n", cnt);
		out.print("<tr>");
		for (int i = 0; i < cnt; i++) {
			out.printf("<td>%d</td>\n",i+1);
		}
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
