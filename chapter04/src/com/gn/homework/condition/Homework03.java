package com.gn.homework.condition;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = scanner.nextInt();
		System.out.print("세 번째 정수 : ");
		int num3 = scanner.nextInt();
		
		if(num1 >= num2) {
			if(num2 >= num3) {
				System.out.println("세 수 중에서 가장 작은 수는 " + num3 + "입니다." );
			}else {
				System.out.println("세 수 중에서 가장 작은 수는 " + num2 + "입니다.");
			}
		}else if(num1 >= num3) {
			if(num3 >= num2) {
				System.out.println("세 수 중에서 가장 작은 수는 " + num2 + "입니다.");
			}else {
				System.out.println("세 수 중에서 가장 작은 수는 " + num3 + "입니다." );
			}
		}else if(num2 >= num3) {
			if(num3 >= num1) {
				System.out.println("세 수 중에서 가장 작은 수는 " + num1 + "입니다." );
			}else {
				System.out.println("세 수 중에서 가장 작은 수는 " + num3 + "입니다." );
			}
		}else {
			if(num1 >= num3) {
				System.out.println("세 수 중에서 가장 작은 수는 " + num3 + "입니다." );
			}else {
				System.out.println("세 수 중에서 가장 작은 수는 " + num1 + "입니다." );
			}
		}
;	}
}
