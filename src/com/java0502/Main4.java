package com.java0502;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main4")
public class Main4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int a = Integer.parseInt(request.getParameter("a"));
		String c = request.getParameter("cal");
		int b = Integer.parseInt(request.getParameter("b"));
		
		float result=0;
		계산기 calc = new 계산기();
		
		
		switch(c) {
		case "+":
			  result=  calc.덧셈(a, b);
			  
			break;
		case "-":
			result =  calc.뺄셈(a, b);
			break;
		case "*":
			result = calc.곱셈(a, b);
			break;
		case "/":
			result = calc.나눗셈(a, b);
			break;
		default:
			break;
		}
		
		System.out.println(result);
		
		response.setContentType("text/html); charset=UTF-8");
		response.getWriter().println(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	}

}
