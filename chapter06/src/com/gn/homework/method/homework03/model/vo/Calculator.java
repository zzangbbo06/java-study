package com.gn.homework.method.homework03.model.vo;

public class Calculator {
	
	
	public int plus(int x, int y) {
		return x + y;
		
	}
	
	public int multiply(int x, int y) {
		return x * y;
	}
	public String equals(String x, String y) {
		if(x.equals(y)) {
			return "true";
		}else {
			return "false";
		}
	}
}
