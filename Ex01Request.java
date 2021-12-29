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
		// request(��û��ü) : ����ڰ� ��û�� ���� �� ������� ������ �����ϴ� ��ü
		// ���� : IP, ������ ����(����, ���, ���ڵ� ��� ���...), ����ڰ� �Է��� ������ ��..
		
		String ip = request.getRemoteAddr();
		System.out.println("������ IP : "+ip);
		
		// IP�� Ȯ���Ͽ� �ٸ� ��¹��� �������� �����ϱ�
		// ���� : �̸� ȯ���մϴ�, ���� : ����� ȯ���մϴ�., �� �� : �մ� ȯ���մϴ�.
		
		String name;
		if (ip.equals("220.93.229.187")) {
			name = "�ڻ��";
		} else if (ip.equals("211.223.37.175")) {
			name = "���϶�";
		} else if (ip.equals("220.80.88.62")) {
			name = "���°�";
		} else if (ip.equals("211.63.240.99")) {
			name = "�ڳ���";
		} else if (ip.equals("59.0.236.207")) {
			name = "����";
		} else if (ip.equals("222.102.104.24"))	{
			name ="��";
		} else {
			name = "��";
		}
		
		System.out.printf("%s�� ȯ���մϴ�.\n",name);
	}

}
