package com.java0502;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Main3")
public class Main3 extends HttpServlet {
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String age = request.getParameter("age");
	
	response.setContentType("text/html; charset=UTF-8"); //브라우저 출력용 
	response.setCharacterEncoding("UTF-8"); 
	
	String html = "";
	html = html + "이름 : " + name + "<br>";
	html = html + "나이 : " + age + "<br>";
	html = html + "<a href='http://localhost:8080/20190502/'>처음으로</a>";
	
	response.getWriter().print(html);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
