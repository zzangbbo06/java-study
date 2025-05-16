package com.gn.homework.loop;

import java.util.Scanner;

public class Homework04 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String yesOrNo = "";
	
		do {
			System.out.println("게임을 실행합니다!");
			System.out.print("게임을 다시 플레이 하시겠습니니까 ? (yes/no) ");
			yesOrNo = sc.nextLine();
		}while(yesOrNo.equals("yes"));
		
		System.out.println("구디 아카데미 폭파");
	}
}
