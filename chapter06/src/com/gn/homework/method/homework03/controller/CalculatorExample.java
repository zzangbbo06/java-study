package com.gn.homework.method.homework03.controller;

import com.gn.homework.method.homework03.model.vo.Calculator;

public class CalculatorExample {
	
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		 
		System.out.println(myCal.plus(10, 20));
		System.out.println(myCal.multiply(10, 20));
		System.out.println(myCal.equals("안녕", "안"));
		
	}
}
