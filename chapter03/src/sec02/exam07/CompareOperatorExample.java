package sec02.exam07;

import java.util.Scanner;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A'; // 유니코드 65 저장
		char char2 = 'B'; // 유니코드 66 저장
		boolean result4 = (char1 < char2); // 65 < 66, 유니코드 값으로 비교
		System.out.println("result4=" + result4);
		
		// Quiz
//		두개의 숫자를 입력받아
//		앞의 수가 크거나 같은 경우 true를
//		뒤의 수가 큰 경우는 false를 출력하는 프로그램을 구현하시오.
//
//		[입력]   [출력]
//		 1 2 => false
//		10 5 => true
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		int num3 = scanner.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int num4 = scanner.nextInt();
		
		boolean bigSmall = num3 > num4;
		System.out.println(bigSmall);
		
//		if(num3 > num4) {
//			System.out.println("true");
//		}else {
//		
//			System.out.println("false");
//		}
	}

}
