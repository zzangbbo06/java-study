package com.gn.homework01;

public class Product {
	private String name;
	private int price;
	
	public Product() {
		
	}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int calculatePrice() {
		return (int)(price * 0.9);
	}
	

}
