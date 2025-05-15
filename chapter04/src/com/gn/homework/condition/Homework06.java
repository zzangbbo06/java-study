package com.gn.homework.condition;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

public class Homework06 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수 : ");
		int dataTest1 = scanner.nextInt();
		System.out.print("소프트웨어개발 점수 : ");
		int dataTest2 = scanner.nextInt();
		System.out.print("데이터베이스구축 점수 : ");
		int dataTest3 = scanner.nextInt();
		System.out.print("프로그래밍언어활용 점수 : ");
		int dataTest4 = scanner.nextInt();
		System.out.print("정보시스템구축관리 점수 : ");
		int dataTest5 = scanner.nextInt();
		
		int avg = (dataTest1 + dataTest2 + dataTest3 + dataTest4 + dataTest5)/5;
		
		//일일히 if로 적으면 모든 검사를 실시하기 때문에 if로 적기
		if(dataTest1 < 40) System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		if(dataTest2 < 40) System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
		if(dataTest3 < 40) System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
		if(dataTest4 < 40) System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		if(dataTest5 < 40) System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
		if(avg >= 60) {
			System.out.println("평균 점수 : " + avg);
			System.out.println("합격을 축하드립니다 !!");
		}else {
			System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		}
		
		
		// 이렇게 적으면 조건을 만족하면 빠져나가게 된다.
//		if(dataTest1 >= 40) {
//			if(dataTest2 >= 40) {
//				if(dataTest3 >= 40) {
//					if(dataTest4 >=40) {
//						if(dataTest5 >= 40) {
//							if(avg >= 60) {
//								System.out.println("합격을 축하합니다");
//							}else {								
//								System.out.println("평균 점수 60점 미만으로 불합격입니다.");
//							}
//						}else {
//							System.out.println("정보시스템구축관리 과목 과락으로 불합격입니다.");
//						}
//					}else {
//						System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
//					}
//				}else {
//					System.out.println("데이터베이스구축 과목 과락으로 불합격입니다.");
//				}
//			}else {
//				System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
//			}
//		}else {
//			System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
//		}

		
		
//		// 여러개가 과락했을때 -> chat gpt
//        String[] subjects = {
//            "소프트웨어설계", "소프트웨어개발", "데이터베이스구축",
//            "프로그래밍언어활용", "정보시스템구축관리"
//        };
//        
//        int[] scores = new int[5];
//        List<String> failedSubjects = new ArrayList<>();
//        int total = 0;
//
//        System.out.println("각 과목의 점수를 입력하세요.");
//
//        for (int i = 0; i < subjects.length; i++) {
//            System.out.print(subjects[i] + " 점수 : ");
//            scores[i] = scanner.nextInt();
//            total += scores[i];
//
//            if (scores[i] < 40) {
//                failedSubjects.add(subjects[i]);
//            }
//        }
//
//        int avg = total / subjects.length;
//
//        if (failedSubjects.isEmpty()) {
//            if (avg >= 60) {
//                System.out.println("합격을 축하합니다!");
//            } else {
//                System.out.println("평균 점수 60점 미만으로 불합격입니다.");
//            }
//        } else {
//            System.out.print("다음 과목 과락으로 불합격입니다: ");
//            System.out.println(String.join(", ", failedSubjects));
//        }
	
	}
}
