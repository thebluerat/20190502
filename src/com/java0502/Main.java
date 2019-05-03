package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main") // URL :  http://localhost:8080/201904/Main
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Main() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		System.out.println("doGet");
		
		response.setContentType("text/html; charset=UTF-8"); //브라우저 출력용 
		response.setCharacterEncoding("UTF-8"); //컴파일 한글 변경
		
		response.getWriter().print("안녕!"); //출력 내용
		
	}

	

}
