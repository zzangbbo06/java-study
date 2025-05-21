package com.gn.homework.method.homework04.run;

import java.util.Scanner;

import com.gn.homework.method.homework04.controller.ExMethodController;

public class Run {
	
	public static void main(String[] args) {
		ExMethodController ExMethod = new ExMethodController();
		
		System.out.println(ExMethod.message("구디폭파"));
		System.out.println("1~100까지의 합은 : " + ExMethod.sum());
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		ExMethod.oddEven(sc.nextInt());
		sc.nextLine();
		
		
		System.out.println("문자를 입력하세요 : ");
		ExMethod.english(sc.nextLine().charAt(0));
		System.out.println("문자열을 입력하세요 : ");
		System.out.println(ExMethod.stringNum(sc.nextLine()));

		
	}
}
