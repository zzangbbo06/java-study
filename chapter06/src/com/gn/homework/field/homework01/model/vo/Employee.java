package com.gn.homework.field.homework01.model.vo;

public class Employee {
	public String name;
	public String team;
	String rank;
	int money;
	private int bonus;
	
	public Employee(String name, String team) {
		this.name = name;
		this.team = team;
		System.out.println("이룸 : " + this.name + " 팀 : " + this.team);
	}
}
