package com.gn.homework.controller.homework09;

public class Student {
	private static int count = 0;
	// 클래스가 프로그램 시작 시 한 번만 count를 만듦
	private int studentNo;
	private String studentName;
	private String className;
	
	public Student() {
		this.studentNo = ++count; 
	}
	public void getStudent(String studentName, String className) {
		this.studentName = studentName;
		this.className = className;
	}
	public void setStudent() {
		System.out.println(studentNo + " " + studentName + " " + className);
	}
}
