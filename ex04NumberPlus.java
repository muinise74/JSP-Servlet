package com.smhrd.servlet1230;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberPlus")
public class ex04NumberPlus extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String num1 = request.getParameter("number1");
		String num2 = request.getParameter("number2");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int number1 = Integer.parseInt(num1);
		int number2 = Integer.parseInt(num2);
		out.print("<html>");
		out.print("<head><title>NumberPlus</title>");
		out.print("</head>");
		out.print("<body>");
		out.printf("<h1>%d + %d = %d</h1>\n",number1,number2,number1+number2);
		out.print("</body>");
		out.print("</html>");
	}
}
