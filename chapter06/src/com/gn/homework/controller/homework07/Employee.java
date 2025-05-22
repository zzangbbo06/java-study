package com.gn.homework.controller.homework07;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonus;
	private String phone;
	private String address;
	
	public Employee() {
		
	}
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonus,
			String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
		this.phone = phone;
		this.address = address;
	}
	public void getEmployee() {
		
	}
	public void setEmployee() {
		System.out.println("---- " + empName + "의 정보 ----");
		System.out.println("사번 : " + empNo);
		System.out.println("부서 : " + dept);
		System.out.println("직급 : " + job);
		System.out.println("나이 : " + age);
//		System.out.println("성별 : " + gender);
		System.out.println("월급 : " + salary);
//		System.out.println("보너스 : " + bonus);
		System.out.println("전화번호 : " + phone);
		System.out.println("주소 : " + address);
	}
	
}
