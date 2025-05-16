package com.gn.homework.loop;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		
		Input : while(true) {
			if(num <= 0){
				System.out.println("양수가 아닙니다.");
				System.out.print("정수 : ");
				num = sc.nextInt();
			}else {
				for(int i = 1; i <= num; i++) {
					if(i % 2 == 1) {
						System.out.println("박");
					}else {
						System.out.println("수");						
					}
				}
				break Input;
			}
			
		} 
	}
}
