package com.gn.homework.loop;

public class Homework06 {
	
	public static void main(String[] args) {
		
		for(int i = 4; i >= 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int z = 4; z >= i; z --) {
				System.out.print("*");
			}
			for(int z = 3; z >= i; z --) {
				System.out.print("*");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
