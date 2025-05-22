package com.gn.homework.controller.homework06;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle() {
		
	}
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int calculateRound() {
		return (width * 2) + (height *2);
	}
	public int calculateArea() {
		return width * height;
	}
	public void printlnfo() {
		System.out.println("둘레 : " + calculateRound());
		System.out.println("넓이 : " + calculateArea());
	}
	
}
