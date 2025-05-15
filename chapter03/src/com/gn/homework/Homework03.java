package com.gn.homework;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("친구 수 : ");
		int friendNum = scanner.nextInt();
		System.out.print("사탕의 수 : ");
		int candyNum = scanner.nextInt();
		
		int oneByCandy = candyNum / friendNum;
		int subCandy = candyNum % friendNum;
		
		System.out.println("1인당 사탕 개수 : " + oneByCandy + "개");
		System.out.print("남는 사탕 개수 : " + subCandy + "개");
		}
}
