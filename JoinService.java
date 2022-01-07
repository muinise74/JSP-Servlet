package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.smhrd.model.S_MemberDAO;
import com.smhrd.model.S_MemberDTO;

@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	S_MemberDAO dao = new S_MemberDAO();

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");

		S_MemberDTO member = new S_MemberDTO(id, pw, nick);
		int check = dao.memberJoin(member);
		if (check > 0) {
			response.sendRedirect("joinTrue.jsp");
		} else {
			response.sendRedirect("joinFalse.jsp");
		}
	}

}
