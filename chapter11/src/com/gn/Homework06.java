package com.gn;

import java.util.Scanner;

public class Homework06 {
	public static void main(String[] args) {
		String sentence = "the quick brown fox jumps over the lazy dog";
		String[] sentenceSplit = sentence.split(" ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력하세요: ");
		String checkWord = sc.nextLine();

		boolean checked = false;
		
		for(int i = 0; i < sentenceSplit.length; i++) {
			if(!sentenceSplit[i].equals(checkWord)) {
				continue;
			}else {
				checked = true;
				if(i + 1 < sentenceSplit.length) {
					System.out.println(checkWord + " 다음 단어 : " + sentenceSplit[i + 1]);
					continue;
				}else {
					System.out.println("마지막 단어입니다.");
				}
			}
			
		}		
		if(checked == false) {
			System.out.println("존재하지 않는 단어입니다.");	
		}
		
		
		
		
	
		
//		for(int i = 0; i < sentenceSplit.length; i++) {	
//			if(sentenceSplit[i].equals(checkWord)) {
//				
//				if(i + 1 < sentenceSplit.length) {
//					System.out.println(checkWord + " 다음 단어: " + sentenceSplit[i + 1]);
//                } else {
//                	System.out.println("입력한 단어가 마지막 단어입니다.");
//                }
//			}else {
//				System.out.println("존재하지 않는 단어입니다.");
//				break;
//			}
//		
//		}
//
//		sc.close();
	}
	
}