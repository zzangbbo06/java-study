package sec01.quiz_string;

import java.util.Scanner;

public class Quiz1 {
	// Quiz
//	입력된 문자열 중 숫자들의 합계를 출력하시오.

//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45

//	[출력]
//	1) 15
//	2) 15
//	3) 15
	
	// 숫자인지 직접 체크: '0'~'9'사이인지 확인
	// 참고: Character.isDigit(ch)
	
	// 문자를 정수로 변환
	// 참고: Caracter.getNumericValue(ch)
	// String.valueOf(ch) -> 문자를 문자열로 변환
	// Integer.parseInt(String.valudOf(ch))
	
	public static void main(String[] args) {
		String first = "1,2,3,4,5";
		String [] firstArray = first.split(",");
		int sum = 0;
		for(int i = 0; i < firstArray.length; i++) {
			int num = Integer.parseInt(firstArray[i]);
			sum += num;
		}
		System.out.println("1) " + sum);
		
//	------------------------------------------------------
		
		String second = "1-2-3-4-5";
		String [] secondArray = second.split("-");
		int sum1 = 0;
		for(int i = 0; i < secondArray.length; i++) {
			int num = Integer.parseInt(secondArray[i]);
			sum1 += num;
		}
		System.out.println("2) " +sum1);
		
//	------------------------------------------------------
		
		
		String third = "a1b2c3de45";
		String thirdNum = third.replaceAll("[a-z]", "");
		String [] thirdArray = thirdNum.split("");
		
		int sum2 = 0;
		for(int i = 0; i < thirdArray.length; i++) {
			int num = Integer.parseInt(thirdArray[i]);
			sum2 += num;
		}
		System.out.println("3"+ ") " +sum2);
				
		
	}

}
