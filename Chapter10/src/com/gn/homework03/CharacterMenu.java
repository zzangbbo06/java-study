package com.gn.homework03;

import java.util.Scanner;

public class CharacterMenu {
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 : ");
		String s = sc.nextLine();
		
		CharacterController cct = new CharacterController();
		
		try {
			System.out.println("'" + s + "'에 포함된 영문자 개수: " + cct.countAlpha(s));
		} catch (CharCheckException e) {
			System.out.println(e.getMessage());
		}
	}

	
}
