package com.gn.controller;

public class Book {
	private String isbn;
	private int price;
	private String type;
	
	
	
	public Book() {
		
	}
	public Book(String isbn, int price) {
		this.isbn = isbn;
		this.price = price;
	}
	
	
	public Book(String isbn, int price, String type) {
		
		this.isbn = isbn;
		this.price = price;
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("ISBN: " + getIsbn() + ", 가격: " + getPrice() + "원");
	}
	
	public void recoverMissingDigit(Book book){
		try {
			String [] splitIsbn = book.getIsbn().split("");
			int sum = 0;
			
			
			for(int i = 0; i < splitIsbn.length; i++) {
				
			
					if(splitIsbn[i].equals("*")) {
						continue;
					}else if(i % 2 == 0) {
							sum += Integer.parseInt(splitIsbn[i]);
					}else{
							sum += Integer.parseInt(splitIsbn[i]) * 3;
						}
					}
					
					
					int location = isbn.indexOf("*");
					
					if(location % 2 == 0) {
						String newIsbn = isbn.replace("*", String.valueOf(10 - (sum % 10))); 
						setIsbn(newIsbn);
					}else {
						for (int i = 0; i <= 9; i++) {
							int recoverSum = (sum + i * 3) % 10;
							
							if(recoverSum == 0) {
								String newIsbn = isbn.replace("*", String.valueOf(i));
								setIsbn(newIsbn);
								break;
							}
							
						}
						
					}
		} catch (Exception e) {
			e.printStackTrace();		
			
		}
		
		
		
		
		

		}
}

