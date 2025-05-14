package com.gn.homework;

import java.util.Scanner;

public class Homework03 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String stringAnys = scanner.nextLine();
		
	
		for(int i = 0; i < stringAnys.length()  ; i++) {
			System.out.println(i+1 + "번째 문자 : " + stringAnys.charAt(i));
		}
	}
}
