package com.gn.homework.field.homework02.model.vo;

public class Person {

	String name;
	String address;
	public String phoneNumber;
	public double height;
	public double weight;
	
	public Person(String phoneNumber, double height, double weight) {
		this.phoneNumber = phoneNumber;
		this.height = height;
		this.weight = weight;
		System.out.println("전화번호 : " + this.phoneNumber + " 키 : " + this.height + " 몸무게 : " + this.weight);
	}
}
