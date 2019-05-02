package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Main2")
public class Main2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//url : http://localhost:8080/201905/Main2?a=1&b=2 파라미터 두 개. 물음표는 변수를 보내려고. 그 뒤에 오는 게 파라미터. 파라미터로 웹 주소에 붙여 보낼 때는 정수가 아니라 문자열이다. 커리스트링이라고 함.
		String a = request.getParameter("a"); //a라는 변수. a의 값은 1이다. 클라이언트가 변수를 만들어 주소에 보냄. 
		String b = request.getParameter("b"); // b라는 변수 = 2
		
		int c =  Integer.parseInt(a) + Integer.parseInt(b); //3
		System.out.println(c);
		
		String d = a+b;
		System.out.println(d);
		
		response.getWriter().print(c + ", " + d);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
