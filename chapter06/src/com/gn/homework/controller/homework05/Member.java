package com.gn.homework.controller.homework05;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member() {
		
	}
	
	public void changeName(String memberName) {
		this.memberName = memberName;
	}
	
	public void printName() {
		System.out.println(memberName);
	}
}
