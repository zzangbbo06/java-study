package com.gn.homework.dimensional;

public class Homework01 {
	
	public static void main(String[] args) {
		int [] height = {152, 180, 165, 158, 171};
		for(int i=0; i < height.length; i++) {
			for(int j = 0; j < height.length-1-i; j++) {
				if(height[j] > height[j+1]) {
					int change = height[j];
					height[j]= height[j+1];
					height[j+1] = change;
				}	
			}
		}
		for(int heights : height)
			System.out.println(heights);
		
	}
}
