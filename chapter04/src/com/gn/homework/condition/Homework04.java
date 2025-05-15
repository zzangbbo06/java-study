package com.gn.homework.condition;

import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수집된 코드 : ");
		int codeNum = scanner.nextInt();
		
		switch(codeNum) {
		case 400:
			System.out.println("잘못된 요청입니다.");
			break;
		case 404:
			System.out.println("요청하신 서비스를 찾을 수 없습니다.");
			break;
		case 500:
			System.out.println("처리 방법을 알 수 없는 문제가 발생했습니다.");
			break;
		case 503:
			System.out.println("일시적인 서버 오류가 발생하였습니다.");
			break;
		default:
			System.out.println("알 수 없는 오류가 발생하였습니다.");
			break;
		}
	}
}
