package com.gn.homework.inheritance.homework02;

import java.util.Scanner;

public class CakeMenu {

		Scanner sc = new Scanner(System.in);
		int menuNum;
		double flour;
		double cream;
		int cherry;
		int chip;
		double powder;
		int cheeseCube;
		
	public void mainMenu() {
		makeCake:while(true) {
			System.out.println("===== 어떤 케이크를 만드시겠습니까? =====");
			System.out.println("1. 초콜릿 케이크(밀가루 : 200g, 크림 : 300g, 체리 : 10개, 초콜릿 칩 : 100개)");
			System.out.println("2. 녹차 케이크(밀가루 : 250g, 크림 : 400g, 녹차 파우더 : 10g, 치즈 큐브 : 50개)");
			System.out.println("9. 취소");
			System.out.println("메뉴 번호: ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
				case 1:
					System.out.println("밀가루(g): ");
					flour = sc.nextDouble();
					System.out.println("크림(g): ");
					cream = sc.nextDouble();
					System.out.println("체리(개): ");
					cherry = sc.nextInt();					
					System.out.println("초콜릿 칩(개): ");
					chip = sc.nextInt();	
					chocolateMenu();
					break;
				case 2:
					System.out.println("밀가루(g): ");
					flour = sc.nextDouble();
					System.out.println("크림(g): ");
					cream = sc.nextDouble();
					System.out.println("녹차 파우더(g): ");
					powder = sc.nextDouble();					
					System.out.println("치즈 큐브(개): ");
					cheeseCube = sc.nextInt();
					greenTeaMenu();
					break;
				case 9:
					System.out.println("종료합니다.");
					break makeCake;
				default:
					System.out.println("잘못된 번호입니다.");
					break;
				}
			}
	}
	public void chocolateMenu() {
		ChocolateController cc = new ChocolateController();
		String result = cc.bakeChocolateCake(flour, cream, cherry, chip);
		System.out.println(result); // return으로 출력하고자 하는 문자열을 출력할려면 변수에 담에서 sysout출력을 반드시해야함
	}
	
	public void greenTeaMenu() {
		GreenTeaController gtc = new GreenTeaController();
		String result = gtc.bakeGreenTeaCake(flour, cream, powder, cheeseCube);
		System.out.println(result);
	}
	
}

	
