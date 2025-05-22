package com.gn.homework.controller.homework07;

public class Run {

	public static void main(String[] args) {
		Employee employee = new Employee(100, "홍길동","영업부", "과장", 25,'남', 3000000, 0.05,"010-123-4567", "서울시 강남구");
		
		employee.getEmployee();
		employee.setEmployee();
	}
}
