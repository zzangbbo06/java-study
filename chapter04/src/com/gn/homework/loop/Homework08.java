package com.gn.homework.loop;

import java.util.Scanner;

public class Homework08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String str = scanner.nextLine();
		System.out.println("문자 : ");
		String chr = scanner.nextLine();
		char strChar = chr.charAt(0);
		
		
		
		
		Input : while(true) {
			int sum = 0;
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == strChar) {
					sum += 1;
				}
				
			}
			System.out.println("포함된 개수 : " + sum);
			System.out.println("다시 입력하시겠습니까 ? ");
			chr = scanner.nextLine();
			
			if (chr.equals("Y") || chr.equals("y")) {
                System.out.println("문자열 : ");
                str = scanner.nextLine();
                System.out.println("문자 : ");
                chr = scanner.nextLine();
                strChar = chr.charAt(0);
            }else if(chr.equals("N") || chr.equals("n")) {
            	System.out.println("프로그램 종료");
            	break Input;
            }else{
                do {
            	System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
                System.out.println("다시 입력하시겠습니까 ? ");
                chr = scanner.nextLine();
                strChar = chr.charAt(0);
                } while (!(strChar == 'Y'||strChar == 'y'  ||strChar == 'N'||strChar == 'n'));
            }
			
//			if(chr.equals("Y")) {
//				System.out.println("문자열 : ");
//				str = scanner.nextLine();
//				System.out.println("문자 : ");
//				chr = scanner.nextLine();
//				strChar = chr.charAt(0);
//			}else if(chr.equals("y")) {
//				System.out.println("문자열 : ");
//				str = scanner.nextLine();
//				System.out.println("문자 : ");
//				chr = scanner.nextLine();
//				strChar = chr.charAt(0);
//			}else if(chr.equals("N")) {
//				System.out.println("프로그램 종료");
//				
//			}else if(chr.equals("n")) {
//				System.out.println("프로그램 종료");
//			}else {
//				System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
//				System.out.println("다시 입력하시겠습니까 ? ");
//				chr = scanner.nextLine();
//				strChar = chr.charAt(0);
//			}
		}
		
	}
}
