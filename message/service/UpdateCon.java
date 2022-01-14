package com.message.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.message.model.*;

@WebServlet("/UpdateCon")
public class UpdateCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		MemberDAO dao = new MemberDAO();
		
		MemberDTO member = (MemberDTO)session.getAttribute("member");
		String email = member.getM_email();	
		String pw = request.getParameter("pw");
		String tel = request.getParameter("tel");
		String addr = request.getParameter("addr");
		
		MemberDTO updateMember = new MemberDTO(email,pw,tel,addr);
		int updateCheck = dao.memberUpdate(updateMember);
		
		if (updateCheck > 0) {
			session.setAttribute("member", updateMember);
			response.sendRedirect("main.jsp");
		} else {
			response.setContentType("text/html; charset = UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('수정 실패...!');");
			out.print("location.href = 'main.jsp';");
			out.print("</script>");
		}
	}

}
