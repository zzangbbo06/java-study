package com.gn.homework.dimensional;

import java.util.Arrays;
import java.util.Scanner;



public class Homework02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 길이를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println("정수 : " + num);
		
		int [] oldArray = new int[num];
		
		int sum = 0;
		
		
		
		for(int i = 0; i < num; i++) {
			System.out.println("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int value = sc.nextInt();
			oldArray[i] = value;
			sum += oldArray[i];
		}
		System.out.println("총 합 : " + sum);
	}
}
