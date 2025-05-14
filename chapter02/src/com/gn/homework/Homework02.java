package com.gn.homework;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = scanner.nextDouble();
		System.out.print("세로 : ");
		double height = scanner.nextDouble();
		
		double area = width * height;
		double perimeter = (width + height) * 2;
		
		System.out.print("면적 : " + area + "\n");
		System.out.print("둘레 : " + perimeter);
	}
}
