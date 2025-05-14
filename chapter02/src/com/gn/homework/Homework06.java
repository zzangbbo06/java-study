package com.gn.homework;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("한 자리 숫자를 입력하세요 : ");
//		String num = scanner.nextLine();
//		
//		int intNum = Integer.parseInt(num);
//		
		char num = scanner.nextLine().charAt(0);
		String sNum = String.valueOf(num);
		// 문자 -> 문자열
		int intNum = Integer.parseInt(sNum);
		// sNum 대신에 num + "" 넣으면 문자열
		// 문자열 -> 정수형태로
		// Integer.parseInt(문자열만 가능)
		
		int squareNum = intNum * intNum;
		System.out.println("입력한 숫자의 제곱은 : " + squareNum);
		
	}
}
