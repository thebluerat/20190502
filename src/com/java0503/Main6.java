package com.java0503;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
		
//		사용자 파란쥐 = new 사용자("파란쥐", 1, 2, 1000);
//		사용자 빨간고양이 = new 사용자("빨간고양이", 28, 181, 75);
//		
//		if(파란쥐.get나이() > 빨간고양이.get나이()) {
//			System.out.println("파란쥐");
//		}else {
//			System.out.println("빨간고양이");
//		}
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("이름", "파란쥐"); //map에는 key가  있고 자바빈에는 set get이라는 메소드가 있다. 고정적인 자바 빈에 비해 유동적으로 쓰인다. 키를 순서 있게 만들면 list와 비슷해짐. value값으로 해시맵을 넣어서 트리 구조의 데이터베이스를 만들 수 있다.
		resultMap.put("나이", 1);
		resultMap.put("몸무게", 1000);
		resultMap.put("키", 2);
		resultMap.put("학교", "시골쥐학교");
		
		String 이름 = resultMap.get("이름").toString();
		System.out.println(이름);
		
	
		
		
		List<사용자> 사용자목록 = new ArrayList<사용자>(); //객체를 배열 형식으로 다룰 때 쓴다. 순서가 있다.
		사용자목록.add(new 사용자("파란쥐", 1, 2, 1000));  //0번 인덱스 위치에 사용자 객체 담기
		사용자목록.add(new 사용자("빨간고양이", 28, 181, 75));//1번 인덱스 위치에 사용자 객체 담기
		

		
		
//		if(사용자목록.get(0).get나이() > 사용자목록.get(1).get나이()) {
//			System.out.println(사용자목록.get(0).get이름());
//		}else {
//		System.out.println(사용자목록.get(1).get이름());
//	}
		
		사용자 파란쥐 = 사용자목록.get(0);
		사용자 빨간고양이 = 사용자목록.get(1);
		
	if(파란쥐.get나이() > 빨간고양이.get나이()) {
		System.out.println("파란쥐");
	}else {
		System.out.println("빨간고양이");
	}
	
		List 정수형리스트 = new ArrayList(); //Object 형식으로 매번 다른 게 들어가요. 배열은 배열임 -> 반복문으로 출력
		정수형리스트.add(1); //정수
		정수형리스트.add("2"); //문자열
		정수형리스트.add(3.5); //실수
		정수형리스트.add(true); //논리형
		
		for(int i = 0; i < 정수형리스트.size(); i++) {
			System.out.println(정수형리스트.get(i));
		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
