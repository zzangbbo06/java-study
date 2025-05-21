package com.gn.homework.method.homework04.controller;

public class ExMethodController {

	public String message(String x) {
		return x;
	}
	public int sum() {
		int sum = 0;
		for(int i=0; i<=100; i++) {
			sum += i;
		}
		return sum;
	}
	public void oddEven(int x) {
		if(x % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	public void english(char x) {
		if(x >= 'a' && x <= 'z' || x >= 'A' && x <= 'Z' ) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
	public int stringNum(String Num) {
		System.out.println(Num.length());
		return Num.length();
	}
}
