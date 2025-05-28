package com.gn;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름: ");
		String name = sc.nextLine(); 
		System.out.println("생년월일: ");
		String birth = sc.nextLine(); 
		
		String namesub = name.substring(1);
		String birthsub = birth.substring(4);
		
		System.out.println("암호: " + name.charAt(0) + birthsub + namesub);
	}
}
