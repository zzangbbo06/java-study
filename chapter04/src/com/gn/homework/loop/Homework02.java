package com.gn.homework.loop;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요(1~9) : ");
		int num = scanner.nextInt();
		
	
			if(num < 0) {
				System.out.print("양수만 입력하세요 : ");
				num = scanner.nextInt();
			}else if(num > 9) {
				System.out.print("9이하의 숫자만 입력하세요 : ");
				num = scanner.nextInt();
			}else if(num == 0) {
				System.out.println("프로그램 종료");
//				System.exit(0); // 강제로 종료
			}else {
				for(int i = num; i <= 9; i++) {
					System.out.println("=== " + i + "단 ===" );
					for(int j = 1; j<= 9; j++) {
						System.out.println(i + " * " + j + " =  " + (i*j));
					}
					System.out.println();
				}
				
			
		
		}
	}
}
