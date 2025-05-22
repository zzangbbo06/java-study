package com.gn.homework.controller.homework09;

public class Run {
	
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		
		student1.getStudent("김철수", "A");
		student1.setStudent();
		student2.getStudent("홍길동", "F");
		student2.setStudent();
		student3.getStudent("이영희", "B");
		student3.setStudent();
		
	}
}
