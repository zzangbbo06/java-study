package com.gn.homework01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu{ // 점선화살표, 화살이 채워져있어야함 has-a(가질수있다,객체 생성해서 쓰기), is-a(상속) -> 실선에 화살표가 비어잇는것
	// 점선에 비어있는건 구현
	
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
			System.out.println("원하시는 업무의 번호를 선택하세요.");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택: ");
			sc.nextInt();
			sc.nextLine();
			
		}


		
		
	}
	public void insertBook() {
		
		System.out.println("=== 도서 등록 ===");
		System.out.println("도서명: ");
		String title = sc.nextLine();
		System.out.println("저자명: ");
		String author = sc.nextLine();
		System.out.println("장르: ");
		String category = sc.nextLine();
		System.out.println("가격: ");
		int price = sc.nextInt();
		sc.nextLine();
			
		Book book = new Book(title, author, category, price);
		bc.insertBook(book);
	
		
	}
	public void selectList() {
		bc.selectList();
		List<Book> selectList = new ArrayList<Book>();
		
		System.out.println("=== 전체 조회 ===");
		if(selectList.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다.");
		}else {
			for(int i = 0; i < selectList.size(); i++) {
				System.out.println(selectList.get(i));
			}
		}
		
	}
	public void searchBook() {
		System.out.println("=== 도서 검색 ===");
		System.out.print("검색어: ");
		String keyword = sc.nextLine();
		List<Book> searchList = new ArrayList<Book>();
		searchList = bc.searchBook(keyword);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i = 0; i < searchList.size(); i++) {
				System.out.println(searchList.get(i));
			}
		}
		}
	public void deleteBook() {
		System.out.println("삭제할 도서명: ");
		String title = sc.nextLine();
		System.out.println("삭제할 저자명: ");
		String author = sc.nextLine();
		
		Book remove = new Book();
		remove = bc.deleteBook(title, author);
		
		if(remove != null) {
			System.out.println("성공적으로 삭제 되었습니다.");
		}else {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
		}
		
		
		
	}
	public void ascBook() {
		int result = bc.ascBook();
		if(result == 1) {
			System.out.println("정렬에 성공하였습니다.");	
			
		}else {
			System.out.println("정렬에 실패하였습니다.");
		}
	}
}
