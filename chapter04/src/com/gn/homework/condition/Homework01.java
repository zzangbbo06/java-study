package com.gn.homework.condition;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = scanner.nextInt();
		
		if(age < 3) {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		}else if(age >= 3 && age <= 12) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다.");			
		}else if(age >12 && age < 19) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		}else if(age >= 19 && age < 65) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		}else {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		}
	}
}
