package com.gn.model.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.gn.controller.Book;
import com.gn.controller.Novel;
import com.gn.controller.Poem;
import com.gn.dao.BoardDAO;

public class BookStoreApplication {

	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();
		Scanner sc = new Scanner(System.in);
		List<Book> list = new ArrayList<Book>();
		List<Book> list2 = new ArrayList<Book>();
		
		while(true) {
			System.out.println("책 종류를 입력하세요(소설/시): ");
			String kind = sc.nextLine();
			
			if(!(kind.equals("소설") ||kind.equals("시"))) {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}
			
			System.out.println("ISBN을 입력하세요(13자리, * 포함가능): ");
			String isbn = sc.nextLine();
			int count = 0;
			
			try {
				String[] splitIsbn = isbn.split("");
				if(splitIsbn.length > 13 || splitIsbn.length < 13) {
					System.out.println("ISBN 잘못된 입력입니다. 13자리를 입력해주세요.");
					continue;
				}else {
					for(int i = 0; i < isbn.length(); i++) {
						if(isbn.charAt(i) == '*') {
							count ++;
						}
					}
					if(count > 1) {
						System.out.println("ISBN 잘못된 입력입니다. *는 2개이상 입력하면 안됩니다.");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("가격을 입력하세요: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			
			System.out.println("입력을 종료하시겠습니다까? (y|Y 입력시 종료): ");
			String exit = sc.nextLine();
			
			if(kind.equals("소설")) {
				book = new Novel(isbn, price);
				book1 = new Book(isbn, price, kind);
			}else if(kind.equals("시")) {
				book = new Poem(isbn, price);
				book1 = new Book(isbn, price, kind);
			}
			
			
			if(isbn.contains("*")) {
					book.recoverMissingDigit(book);
					list.add(book);
					list2.add(book1);
			}else {
					list.add(book);
					list2.add(book1);
			}
				
			
			if(exit.equalsIgnoreCase("Y")) {
				System.out.println("입력을 종료하겠습니다.");
				int sum = 0;
				for(int i = 0; i < list.size(); i++) {
					sum += list.get(i).getPrice();
					list.get(i).printInfo();
				}
				System.out.println("총 평균 가격: " + ((double)sum / list.size()));
				
				BoardDAO bd = new BoardDAO();
				int result = bd.insert(book1);
				if(result > 0) {
					System.out.println("★ 정보가 등록되었습니다.");
				}else {
					System.out.println("★ 정보 등록에 실패하였습니다.");
				}	
				return;
			}else {
				continue;
			}
			
		}
		
	}
	
}
























//		Book book = new Novel("97*8937460449", 14000);
//		Book book1 = new Poem("9791193937655", 9000);
//		Book book2 = new Novel("97889*7461798", 15000);
//		
//		List<Book> list = new ArrayList<Book>();
//		
//		
//		
//		list.add(book);
//		list.add(book1);
//		list.add(book2);
//		
//		int sum = 0;
//		
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			sum += list.get(i).getPrice();
//		}
//		
//		book.recoverMissingDigit(book);
//		book1.recoverMissingDigit(book1);
//		book2.recoverMissingDigit(book2);
//		
//		book.printInfo();
//		book1.printInfo();
//		book2.printInfo();
//		
//		System.out.println("총 평균 가격: " + ((double)sum / list.size()));