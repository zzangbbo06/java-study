package com.gn;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String joined = "";
		
		while(true) {
			System.out.print("문자열: ");
			String stringSentence = sc.nextLine();
			
			if(stringSentence.equalsIgnoreCase("N")){
				System.out.println("프로그램을 종료합니다.");
				System.out.println("최종 문자열 : " + joined);
				break;
			}else {
				joined += stringSentence;
				}
				
			}
		}
	}

	

