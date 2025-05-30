package com.gn.homework01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController extends Book{

	List<Book> bookList = new ArrayList<Book>();
	
	
	public BookController() {
		Book book1 = new Book("느리게 나이드는 습관","정희원","인문",16200);
		Book book2 = new Book("코스모스","칼 세이건","자연과학",17910);
		Book book3 = new Book("나에게 들려주는 예쁜 말","김종원","어린이",15610);
		Book book4 = new Book("혼자 공부하는 자바","신용권","기타",25240);
	}
	
	public void insertBook(Book bk) {
		bookList.add(bk);
	}
	
	public List<Book> selectList(){
		return bookList;
	}

	public List<Book> searchBook(String keyword){
		List<Book> result = new ArrayList<Book>();
		
		for(Book book : bookList) {
			if(book.getTitle().contains(keyword)
				|| book.getAuthor().contains(keyword)
				|| book.getCategory().contains(keyword)) {
				result.add(book);
			}
		}
		return result;
		
	}
	
	
	public Book deleteBook(String title, String author) {
		
		Book removeBook = new Book();
		
		boolean found = false;
		
		for(int i = 0; i < bookList.size(); i++) {
			
			if(bookList.contains(title) && bookList.contains(author)) {
				found = true;
				bookList.remove(i);
				if(found) {
					removeBook = bookList.remove(i);
				}
				break;
			}
		} 
		return removeBook;
			
	}
	
		
	
	
	public int ascBook(){
		Collections.sort(bookList);
		return 1;
	}

}
