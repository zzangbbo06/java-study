package com.gn.homework03;

public class Member {

	private String password;
	private String name;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Member() {
		
	}

	public Member(String password, String name) {
		
		this.password = password;
		this.name = name;
	}
	
	
	
}
