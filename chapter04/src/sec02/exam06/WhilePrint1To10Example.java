package sec02.exam06;

import java.util.Scanner;

public class WhilePrint1To10Example {

	public static void main(String[] args) {
		
		//1부터 100까지의 합
		int i = 1; // 초기화식
		int sum = 0;
		
		while(i <= 100) { // 조건식
			sum += i;
			i++; // 증감식 => 써주지 않으면 무한루프에 빠짐
		}
		System.out.println("1~" + (i-1) +"까지의 합 : " + sum);
		
		
		// (참고) 무한 루프
		while(true) {
			System.out.println("무한 반복");
			
			// 실제 사용 예 :  특정 조건을 만족하면 멈추도록
			if(true) {
				break;
			}
		}
		
		boolean flag = true;
		while (flag) {
			System.out.println("무한 반복");
			
			// 실제 사용 예 :  특정 조건을 만족하면 멈추도록
			if(true) {
				flag = false;
			}
		}
		
		// 1부터 100까지 합
		// do-while문으로 작성
		sum = 0;
		i = 1;
		
		do { // 처음 한번은 무조건 실행
			sum += i;
			i++;
			
		}while(i<=100); //do-while문은 조건식
//		뒤에 ; 붙여줘야함, 세미클론 필수!
		
		System.out.println("1~" + (i-1) +"까지의 합 : " + sum);
		
		// Quiz: 1부터 100까지 홀수의 합
		int x = 1;
		sum = 0;
		while(x <= 100) {
			if(x % 2 == 1) {
				sum +=x;
			}
			x++;
		} 
		System.out.println("1부터 100까지 홀수의 합 : " + sum);
		
		
		
		
		// Quiz2
//		화면에서 자연수를 입력받아서 각 자리수의 합을 출력하는 프로그램을 구현하시오.
//
//		[입력]    [출력]
//		 123   =>  6
//		 12345 =>  15
		
		Scanner sc = new Scanner(System.in);
//		
		System.out.println("숫자를 입력하세요 : ");
//		String num = sc.nextLine();
//		
//		int z = 0;
//		int sum1 = 0;
//		while(z < num.length()) {
////			String stNum = String.valueOf(num.charAt(z));
//			
//			int intNum = Integer.parseInt(num.charAt(z)+"");
//			sum1 += intNum;
//			z++;
//		}
//		System.out.println(sum1);
		
		int num = sc.nextInt();
		
		sum = 0;
		
		while(num > 0) {
			sum += num % 10; // 정수 / 정수 = 정수 123/10 => 12, 마지막 자리 수 더하기
			num /= 10; // 마지막 자리 제거
		} 
		System.out.println(sum);
		
		
	}

}
