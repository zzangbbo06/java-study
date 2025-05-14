package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키(m)를 입력하세요 : ");
		double height = scanner.nextDouble();
		System.out.println("몸무게(kg)를 입력하세요 : ");
		double weight = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);
		
	}
}
