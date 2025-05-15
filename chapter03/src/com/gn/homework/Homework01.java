package com.gn.homework;

import java.util.Scanner;

public class Homework01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("말해보세요 : ");
		String speaking = scanner.nextLine();
		
//		String reverseSpeaking = (speaking.equals("간다")) ? "온다" : "간다";
		String reverseSpeaking = ("간다".equals(speaking)) ? "온다" : "간다";
		// 이렇게 적으면 risk를 줄일 수 있음
		// 이게 더 좋은 코드이다.
		System.out.print("앵무새 : " + reverseSpeaking);
	}
}
