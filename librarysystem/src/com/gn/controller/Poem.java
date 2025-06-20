package com.gn.controller;

public class Poem extends Book{
	
	public Poem(String isbn, int price) {
		super(isbn, price);
	}
	
	@Override
	public void printInfo() {
		System.out.println("[시] ISBN: " + getIsbn() + ", 가격: " + getPrice() + "원");
	}
}
