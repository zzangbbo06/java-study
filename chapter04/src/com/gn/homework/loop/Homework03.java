package com.gn.homework.loop;

import java.util.Scanner;

public class Homework03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String gdEscape = sc.nextLine();
		
		for(int i =0; ;i++) {
			if(!(gdEscape.equals("구디 탈출 !!"))) {
				System.out.println(gdEscape);
				System.out.print("입력 : ");
				gdEscape = sc.nextLine();
			}else {
				System.out.print("프로그램 종료");
				break;
			}
		}
		
	}
}
