package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korean = scanner.nextDouble();
		System.out.print("수학 : ");
		double math = scanner.nextDouble();
		System.out.print("영어 : ");
		double english = scanner.nextDouble();
		
		int total = (int)(korean + math + english);
		int avg = total / 3;
		
		String result = (avg >= 90) ? ((korean >= 60) ? ((math >= 60) ? ((english >= 60) ? "휴대폰을 바꿀 수 있습니다" : "휴대폰을 바꿀 수 없습니다") : "휴대폰을 바꿀 수 없습니다.") : "휴대폰을 바꿀 수 없습니다") : "휴대폰을 바꿀 수 없습니다.";
		System.out.println(result);
		
		
		}

	
	
}
