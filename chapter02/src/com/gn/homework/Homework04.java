package com.gn.homework;

import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		
		char unicode = scanner.nextLine().charAt(0);
		// 문자 하나만 받는것을 확실하게 명시해야함, char는 문자 1개만 받는 자료형
		//nextLine() -> 한개만 적더라도 문자열로 반환
		int intUnicode = unicode;
		//byte, short는 강제 변환은 되지만 자동변환은 안되면서 강제로 하면 손실이 일어남
		System.out.println(unicode+ "의 유니코드 : " + intUnicode);
		
		
	}
}
