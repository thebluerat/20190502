package com.java0503;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/복습")
public class 복습 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	아싸모임 땅파두 = new 아싸모임("땅파두", "화학과", "남성", 24);
	아싸모임 파란쥐 = new 아싸모임("파란쥐", "국어국문학과", "여성", 25);
	 
	if(파란쥐.get나이()>땅파두.get나이()) {
		System.out.println("파란쥐");
	}else {
		System.out.println("땅파두");
	}
	
	

	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
