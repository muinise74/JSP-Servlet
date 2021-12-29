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
		out.print("<head><title>Request&Response 실습</title>");
		out.print("</head>");
		out.print("<body>");
		
		if (ip.equals("220.93.229.187")) {
			name = "박상민";
		} else if (ip.equals("211.223.37.175")) {
			name = "서하라";
		} else if (ip.equals("220.80.88.62")) {
			name = "갬태경";
		} else if (ip.equals("211.63.240.99")) {
			name = "박나영";
		} else if (ip.equals("59.0.236.207")) {
			name = "강사";
		} else if (ip.equals("222.102.104.24"))	{
			name ="나";
		} else {
			name = "손";
		}
		
		out.printf("<h1>%s님 환영합니다.\n</h1>",name);
		out.print("</body>");
		out.print("</html>");
	}

}
