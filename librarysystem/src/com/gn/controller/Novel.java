package com.gn.controller;

public class Novel extends Book{

	public Novel(String isbn, int price) {
		super(isbn, price);
	}
	
	@Override
	public void printInfo() {
		System.out.println("[소설] ISBN: " + getIsbn() + ", 가격: " + getPrice() + "원");
	}
}
