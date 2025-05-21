package com.gn.homework.dimensional;

public class Homework07 {
	
	public static void main(String[] args) {
		String[] report = {"Introduction", "Research", "Conclusion"};
		System.out.print("원본 보고서 : ");
		
		for(int i = 0; i < report.length; i++) {
			System.out.print(report[i] + ", ");
		}
		
		System.out.println();
		report[0] = "Team Feedback";
		
		System.out.print("복사된 보고서 : ");
		
		for(int i = 0; i < report.length; i++) {
			System.out.print(report[i]+ ", ");
		}
	}
}
