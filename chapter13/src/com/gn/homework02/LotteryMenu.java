package com.gn.homework02;

import java.util.Scanner;



public class LotteryMenu {

	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMethod() {
		Exit: while(true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
			
			System.out.println("메뉴 번호: ");
			int num = sc.nextInt();
			sc.nextLine(); // 개행제거		
			
			switch(num) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				searchObject();
				break;
			case 4:
				winObject();
				break;
			case 5:
				sortedWinObject();
				break;
			case 6:
				searchWinner();
				break;
			case 9 :
				System.out.println("프로그램 종료");
				break Exit;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.println("추가할 추첨 대상 수 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		
		for(int i = 0; i < num; i++) {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("휴대폰 번호(-빼고) : ");
			String phoneNumber = sc.nextLine();
		
			lc.insertObject(new Lottery(name, phoneNumber)) ;
		}
		System.out.println(num + "명 추가 완료했습니다.");
		
	}
	
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.println("이름 : ");
		String deleteName = sc.nextLine();
		System.out.println("휴대폰 번호(-빼고) : ");
		String deleteNum = sc.nextLine();
		
		Lottery l = new Lottery(deleteName, deleteNum);
		lc.deleteObject(l);
		
		if(!lc.deleteObject(l)) {
			System.out.println("삭제 완료되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
			
		}
		
	}
	
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		System.out.println(lc.searchObject());
	}
	
	
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		if(lc.winObject() == null) {
			System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
		}else {
			System.out.println(lc.winObject());
		}
		
	
	}
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 ======");
		System.out.println(lc.sortedWinObject());
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("이름: ");
		String name = sc.nextLine();
		System.out.println("휴대폰 번호(-빼고) : ");
		String num = sc.nextLine();
		
		Lottery l = new Lottery(name,num);
		lc.searchWinner(l);
	}
	
	
	
	
	
	
	
	
	
}
