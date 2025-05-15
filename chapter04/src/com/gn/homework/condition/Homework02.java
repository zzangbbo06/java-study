package com.gn.homework.condition;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월 : ");
		int month = scanner.nextInt();
		System.out.print("기온 : ");
		int temp = scanner.nextInt();
		
//		Early Return 패턴
//		에러나 예외 조건을 먼저 검사하고 처리한 다음, 성공케이스는 마지막에 처리하는 구조
//		장점 : 1) 코드 가독성이 좋아짐 2) 코드의 중첩을 줄일 수 있음
//		if(month<1 || month > 12) {
//			System.out.println("해당하는 계절이 없습니다.");
//			return;
//		}
		
		
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
		}else if(month >= 6 && month <= 8) {
			if(temp >=35) {
				System.out.println("폭염경보");
			}else if(temp >= 33) {
				System.out.println("폭염주의보");
			}else {
				System.out.println("여름");
			}
		}else if(month >= 9 && month <= 11) {
			System.out.println("가을");
		}else if(month == 12 || month >= 1 && month <=2) {
			if(temp <= -15) {
				System.out.println("한파경보");
			}else if(temp <= -12) {
				System.out.println("한파 주의보");
			}else {
				System.out.println("겨울");
			}
		}else {
			System.out.println("해당하는 계절이 없습니다");
		}
	}
}
