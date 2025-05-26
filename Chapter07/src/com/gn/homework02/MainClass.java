package com.gn.homework02;

import java.util.Random;

public class MainClass {
	public static void main(String[] args) {
		
		Menu[] menu = new Menu[5];
		
		Random r = new Random();
		
		String[] drinkNames = {"Latte", "Espresso", "Smoothie", "Green Tea", "Orange Juice"};
        String[] dishNames = {"Pasta", "Burger", "Sushi", "Pizza", "Ramen"};
		int [] prices = {7000, 12000, 17000, 22000, 27000};
		String[] ingredients = {"양파", "당근", "토마토", "배추", "오일"};
		String[] receipes = {"가", "나", "다", "라", "마"};
		
		int price = prices[r.nextInt(prices.length)];
		String ingredient = ingredients[r.nextInt(ingredients.length)];
		String receipe = receipes[r.nextInt(receipes.length)];
		
		
		for (int i = 0; i < menu.length; i++) {
			if(r.nextBoolean()) {
				String dishName = dishNames[r.nextInt(dishNames.length)];
				menu[i] = new Dish(dishName, price, ingredient);
			}else {
				String drinkName = drinkNames[r.nextInt(drinkNames.length)];
				menu[i] = new Drink(drinkName,price, receipe);
			}
			menu[i].cook();
		}
		
	}
}
