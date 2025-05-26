package com.gn.homework02;

public abstract class Menu {

	private String name;
	private int price;
	
	protected Menu() {
		
	}
	protected Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "원 입니다.";
	}
	
	public abstract void cook();
}
