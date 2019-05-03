package com.java0503;

public class 아싸모임 {
	
	String 닉네임;
	String 전공;
	String 성별;
	int 나이;
	
	public 아싸모임(String 닉네임, String 전공, String 성별, int 나이) {
		set닉네임(닉네임);
		set전공(전공);
		set성별(성별);
		set나이(나이);
	}
	
	
	
	public String get닉네임() {
		return 닉네임;
	}
	public void set닉네임(String 닉네임) {
		this.닉네임 = 닉네임;
	}
	public String get전공() {
		return 전공;
	}
	public void set전공(String 전공) {
		this.전공 = 전공;
	}
	public String get성별() {
		return 성별;
	}
	public void set성별(String 성별) {
		this.성별 = 성별;
	}
	public int get나이() {
		return 나이;
	}
	public void set나이(int 나이) {
		this.나이 = 나이;
	}
	
	
	
	

}
