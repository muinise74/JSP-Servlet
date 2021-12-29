package com.smhrd.servlet1229;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex01Request")
public class Ex01Request extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// request(요청객체) : 사용자가 요청을 했을 때 상용자의 정보를 저장하는 객체
		// 정보 : IP, 브라우저 정보(버전, 언어, 인코딩 방식 등등...), 사용자가 입력한 정보들 등..
		
		String ip = request.getRemoteAddr();
		System.out.println("접속한 IP : "+ip);
		
		// IP를 확인하여 다른 출력문이 나오도록 구현하기
		// 팀원 : 이름 환영합니다, 강사 : 강사님 환영합니다., 그 외 : 손님 환영합니다.
		
		String name;
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
		
		System.out.printf("%s님 환영합니다.\n",name);
	}

}
