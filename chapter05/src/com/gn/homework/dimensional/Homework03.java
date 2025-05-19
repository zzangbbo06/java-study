package com.gn.homework.dimensional;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수(홀수)를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 0; ; i++) {
			if(num < 3 || num % 2 == 0) {
				System.out.println("3이상의 홀수로 다시 입력하세요 : ");
				num = sc.nextInt();				
			}else {
				int value = 0;
				
				for(int j = 0; j < num; j++) {
					if(value < (num /2) + 1) {
						System.out.print(++value + ",");
						if(value == (num /2) + 1){
							for(int z =1; z < (num /2) + 1; z++){
								System.out.print(--value + ",");								
							}break;
						}
					}
				}break;
			}
			
		} 
	}
}
