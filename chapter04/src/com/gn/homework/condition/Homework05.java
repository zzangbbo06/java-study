package com.gn.homework.condition;

import java.util.Scanner;

public class Homework05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("=== 핼스 마니아 철수 ===");
		System.out.println("1. 스쿼트\n2. 데드리프트\n3. 벤치프레스\n4. 풀업\n5. 종료");
		
		
		
		System.out.print("오늘의 루틴 : ");
		int routineNum = scanner.nextInt();
		
		if(routineNum > 0 && routineNum <= 1) {
			System.out.println("스쿼트 운동시간입니다");
		}else if(routineNum == 2) {
			System.out.println("데드리프트 운동시간입니다");
		}else if(routineNum == 3) {
			System.out.println("벤치프레스 운동시간입니다");
		}else if(routineNum == 4) {
			System.out.println("풀업 운동시간입니다");	
		}else if(routineNum ==5) {
			System.out.println("종료");
		}else if(routineNum > 5) {
			System.out.println("목록에 있는 숫자만 입력해주세요.");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
}
