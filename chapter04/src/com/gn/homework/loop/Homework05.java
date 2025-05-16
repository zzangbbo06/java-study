package com.gn.homework.loop;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for(int i = 0; ; i++) {
			System.out.print("숫자(0)을 입력하면 종료 : ");
			num = sc.nextInt();
			if(num < 0) {
				continue;
			}else if(num == 0) {
				break;
			}else if(num > 0)
			sum += num;
		}
		System.out.println("양수의 합계 : " + sum);
	}
}
