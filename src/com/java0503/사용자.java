package com.java0503;

public class 사용자 {

	String 이름;
	int 나이;
	int 키;
	int 몸무게;
	
	public 사용자(String 이름, int 나이, int 키, int 몸무게) {
		set이름(이름);
		set나이(나이);
		set키(키);
		set몸무게(몸무게);
	}
	
	
	public String get이름() {
		return 이름;
	}
	public void set이름(String 이름) {
		this.이름 = 이름;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	public int get키() {
		return 키;
	}
	public void set키(int 키) {
		this.키 = 키;
	}
	public int get몸무게() {
		return 몸무게;
	}
	public void set몸무게(int 몸무게) {
		this.몸무게 = 몸무게;
	}
	
	
	
}
