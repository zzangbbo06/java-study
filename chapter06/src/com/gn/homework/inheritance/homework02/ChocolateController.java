package com.gn.homework.inheritance.homework02;

public class ChocolateController{
	
	
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		Chocolate c = new Chocolate(flour, cream, cherry,chip);
		System.out.println(c.toString());
		return "초콜릿 케이크가 완성되었습니다";
	}
	
}
