package com.gn.homework;

import java.util.Scanner;

public class Homework05 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		int num1 = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int num2 = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int num3 = scanner.nextInt();
		
		int sum = num1 + num2 + num3;
		int avg = sum / 3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
