package com.gn.homework.dimensional;

import java.util.Arrays;

public class Homework08 {
	public static void main(String[] args) {
		String[]menu = {"Burger", "Pizza", "Pasta"};
		
		System.out.print("어제 메뉴판 : ");
		
		for(int i = 0; i < menu.length; i++) {
			System.out.print(menu[i]);
			if (i < menu.length - 1) {
                System.out.print(", ");
			}
		}
		
		System.out.println();
		
		String[] add = Arrays.copyOf(menu, menu.length + 2);
		
		add[3] = "Salad";
		add[4] = "Soup";
		System.out.print("오늘 메뉴판 : ");
		
		for(int j = 0; j < add.length; j++) {
			System.out.print(add[j]);
			if (j < add.length - 1) {
                System.out.print(", ");
			}
		}
	}
}
