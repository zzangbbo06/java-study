package com.gn;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요: ");
		String checkWord = sc.nextLine();
		
		if(checkWord.indexOf(sentence)) {
			System.out.println();
		}
		
	}
}
