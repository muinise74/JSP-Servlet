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

@WebServlet("/MsgSendCon")
public class MsgSendCon extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String sendName = request.getParameter("sendName");
		String receiveEmail = request.getParameter("receiveEmail");
		String content = request.getParameter("content");
		
		MessageDAO mdao = new MessageDAO();
		MessageDTO msg = new MessageDTO(sendName,receiveEmail,content);
		int sendMSGCheck = mdao.sendMSG(msg);
		
		if (sendMSGCheck > 0) {
			HttpSession session = request.getSession();
			session.setAttribute("message", msg);
			response.sendRedirect("main.jsp");
		} else {
			response.setContentType("text/html; charset = UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<script>");
			out.print("alert('전송 실패...!');");
			out.print("location.href = 'main.jsp';");
			out.print("</script>");
		}
	}

}
