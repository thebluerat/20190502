package com.java0503;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Main6")
public class Main6 extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	사용자 유저 = new 사용자();
//	유저.나이 = 1;
//	유저.키 = 2;
//	유저.몸무게 = 1000;
//	유저.이름 = "파란쥐";
	
//	유저.set이름("파란쥐");
//	String 이름 = 유저.get이름();
//	System.out.println(이름);
		
		사용자 파란쥐 = new 사용자("파란쥐", 1, 2, 1000);
		사용자 빨간고양이 = new 사용자("빨간고양이", 28, 181, 75);
		
		if(파란쥐.get나이() > 빨간고양이.get나이()) {
			System.out.println("파란쥐");
		}else {
			System.out.println("빨간고양이");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
