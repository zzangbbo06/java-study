package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.print("구슬의 개수 : ");
		int num = scanner.nextInt();
		
		String evenOdd = (num % 2 ==0) ? "짝수" : "홀수";
		
		System.out.println("구슬의 개수는 " + evenOdd + "입니다");
	}	
}
