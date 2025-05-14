package sec03.exam02;

import java.util.Scanner;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue; // char 타입으로 강제 형변환
		System.out.println("charValue: " + charValue);
		
		long longValue = 500;
//	long	longValue = 20000000000L;
		intValue =(int) longValue; // 강제 형번환 시 4byte로 쪼개서 마지막 4byte만 넣음 // int값이 가질수 있는 값보다 더 큰 값을 넣게 되면 엉뚱한 값이 찍힌다
		System.out.println("intValue: " + intValue); 
		
		double doubleValue= 3.14;
		intValue = (int) doubleValue; // 실수 -> 정수로 저장하게 되면 정수부분만 저장하고 나머지는 날린다
		System.out.println("intValue: " + intValue); 
		
		//Quiz
//		long타입을 입력받아 변수 number에 저장 후 number 변수의 값을
//		int 형으로 변환한 결과를 출력하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.println("long타입 입력: ");
		long number = scanner.nextLong();
		System.out.println((int)number); 
	}
}
