package com.smhrd.sevlet1231;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/JoinService")
public class ex09Join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("ID");
		String pw = request.getParameter("PW");
		String name = request.getParameter("NAME");
		String email = request.getParameter("EMAIL");
		String tel = request.getParameter("TEL");
		String[] hobby = request.getParameterValues("HOBBY");
		String gender = request.getParameter("GENDER");
		String birthday = request.getParameter("BIRTHDAY");
		String color = request.getParameter("COLOR");
		String country = request.getParameter("COUNTRY");
		String talk = request.getParameter("TALK");
		
		out.print("<html>");
		out.print("<head><title>Confirm</title>");
		out.print("</head>");
		out.print("<body>");
		out.print("<h3>입력 정보 확인</h3>");
		out.printf("ID : %s<br/>",id);
		out.printf("PW : %s<br/>",pw);
		out.printf("NAME : %s<br/>",name);
		out.printf("EMAIL : %s<br/>",email);
		out.printf("TEL : %s<br/>",tel);
		out.printf("GENDER : %s<br/>",gender);
		out.print("HOBBY : ");
		for (int i  = 0; i < hobby.length; i ++) {
			out.println(hobby[i]);
		}
		out.print("<br/>");
		out.printf("BIRTHDAY : %s<br/>",birthday);
		out.printf("COLOR : %s<br/>",color);
		out.printf("COUNTRY : %s<br/>",country);
		out.printf("TALK : %s<br/>",talk);
		out.print("</body>");
		out.print("</html>");
	}

}
