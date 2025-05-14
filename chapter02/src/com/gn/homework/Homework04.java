package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		
		char unicode = scanner.nextLine().charAt(0);
		// 문자 하나만 받는것을 확실하게 명시해야함
		int intUnicode = unicode;
				
		System.out.println(unicode+ "의 유니코드 : " + intUnicode);
		
		
	}
}
