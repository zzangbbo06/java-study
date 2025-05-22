package com.gn.homework.controller.homework08.close;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}
	public void getPerson() {
		name = "김철수";
		age = 20;
	}
	public void setPerson() {
		System.out.println(name + "는 " + age + "살 입니다.");
	}
}
