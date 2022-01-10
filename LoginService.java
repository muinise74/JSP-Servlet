package com.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if (id.equals("smhrd") && pw.equals("1234")) {
			HttpSession session = request.getSession();
			session.setAttribute("login_nick","Ω∫¿Œ¿Á");
			response.sendRedirect("main.jsp");
		} else {
			response.sendRedirect("loginF.jsp");
		}
	}

}
