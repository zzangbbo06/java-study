package com.gn.homework03;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;





public class MemberMenu {

	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	public void mainMenu() {
		Exit : while(true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
			
			System.out.println("메뉴 번호 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				joinMember();
				break;
			case 2:
				logIn();
				memberMenu();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				break Exit;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			}
		}
	}
	
	public void memberMenu() {
		while(true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			
			System.out.println("메뉴 번호 입력: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return; // 메소드 자체가 종료
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
				break;
			
			}
		}
	}
	
	public void joinMember() {
		System.out.println("=== 1. 회원가입 ===");
		System.out.println("아이디: ");
		String id = sc.nextLine();
		System.out.println("비밀번호: ");
		String pw = sc.nextLine();
		System.out.println("이름: : ");
		String name = sc.nextLine();
		
		mc.joinMember(id, new Member(pw,name));
		
		System.out.println("성공정으로 회원가입 완료되었습니다.");
		memberMenu();
	}
	
	public void logIn() {
		while(true) {
		System.out.println("=== 2. 로그인 ===");
		System.out.println("아이디: ");
		String id = sc.nextLine();
		System.out.println("비밀번호: ");
		String pw = sc.nextLine();
		
		if(mc.logIn(id, pw) == null) {
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요");
			continue;
		}else {			
			System.out.println(mc.logIn(id,pw) + "님, 환영합니다!");
			break;
		}			
		}
	}
	
	public void changePassword() {
		while(true){
			
			System.out.println("=== 1. 비밀번호 바꾸기 ===");
			System.out.println("아이디: ");
			String id = sc.nextLine();
			System.out.println("현재 비밀번호: ");
			String oldPw = sc.nextLine();
			System.out.println("새로운 비밀번호: ");
			String newPw = sc.nextLine();
		
		
			if(mc.changePassword(id, oldPw, newPw) == true) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;

			}else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void changeName() {
		while(true) {
			
		System.out.println("=== 2. 이름 바꾸기 ===");
		System.out.println("아이디: ");
		String id = sc.nextLine();
		System.out.println("비밀번호: ");
		String pw = sc.nextLine();
		
		
		
		if(mc.logIn(id, pw) != null) {
			System.out.println("현재 설정된 이름: " + mc.logIn(id, pw));
			System.out.print("변경할 이름: ");
			String newName = sc.nextLine();
			mc.changeName(id, newName);
			System.out.println("이름 변경에 성공했습니다.");
			break;				
		}else {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			continue;			}
		
		}
	}
	
	public void sameName() {
		System.out.println("=== 3. 같은 이름 회원 찾기 ===");
		System.out.println("검색할 이름: ");
		String researchName = sc.nextLine();
		
		Set<Map.Entry<String, String>> entrySet = mc.sameName(researchName).entrySet(); 
		for(Map.Entry<String, String> entry : entrySet) {
			System.out.println(entry.getValue() + "-" + entry.getKey());
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
