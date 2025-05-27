package com.gn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = (int)((Math.random()*50)+1);
		int count = 0;
		
		for(int i = 0; ; i++) {
			try {			
				System.out.println("1~50사이의 숫자: ");
				int n = sc.nextInt();
				if(num > n) {
					System.out.println("Up!");
					count++;
				}else if(num < n) {
					System.out.println("Down!");
					count++;
				}else {
					count++;
					System.out.println("축하한다ㅋ 집이나가라ㅋ\n총 시도 횟수 : " + count);
					break;
				}
			}catch(InputMismatchException e) {
				System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
				sc.nextLine(); //개행 제거
				}
			}
		}
}
