package com.gn.homework.inheritance.homework02;

public class ChocolateController{
	
	
	
	public String bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		Chocolate c = new Chocolate(flour, cream, cherry,chip); 
		// 여기서도 값을 받아줘야 Chocolate 객체에 값을 대입 가능
		// 여기서 매개변수에 값을 넣어주지 않아서 값이 기본값인 0으로 계속 출력 되었음
		System.out.println(c.toString());
		return "초콜릿 케이크가 완성되었습니다"; 
		// 이렇게 선언하면 호출하고자 하는 파일에서 변수에 넣어서 sysout 호출해주어야함.
	}
	
}
