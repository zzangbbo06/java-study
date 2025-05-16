package sec02.exam03;

import java.util.Scanner;

public class ForSumFrom1To100Example2 {
	
	public static void main(String[] args) {
		// 1부터 100까지 더해서 출력
		// 반복문 안에 sum 혹은 출력문을 넣으면 그 행위 또한 반복된다.
		int sum = 0;
		
		int i = 0;
////		출력문에 i를 쓰고 싶으면 바깥쪽으로 이렇게 빼서 초기화 해주면 된다.
		for(i = 1 ; i <= 100; i++) {
////			int sum = 0;
//			// 그렇다고 sum 초기화식을 안에 넣으면 지역변수로 되기 때문에 출력이 안된다.
//			// 안에 넣으면 반복문 넣을때마다 sum이 초기화 된다.
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합 : " + sum);
		
		//(참고) 무한 루프
		// 아래 3가지 조건이 다 필요한것은 아님 필요없으면 빼도됨
//		for(초기화식; 조건식; 증감식) {
//			
//		}
		
		int count = 0;
		for(;;) {
			System.out.println("무한 반복");
			count++;
			
			// 실제 사용 예 : 특정 조건을 만족하면 멈추도록
			if(count == 6) {
				break;
			}
		}
		
		// Quiz: 1부터 100까지 짝수의 합
		
		sum = 0;
		for(int j =1; j <= 100; j++ ) {
			if(j % 2 == 0) {
				sum += j;
			}
		}
		System.out.println(sum);
		// Quiz2: 
//		숫자를 입력받아 입력받은 수가 
//		짝수인 경우: 2부터 해당 숫자까지 짝수의 합
//		홀수인 경우: 1부터 해당 숫자까지 홀수의 합
//		을 구하는 프로그램을 구현하시오
//
//		[입력]  [출력]
//		 10  => 30
//		 11  => 36
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		sum = 0;
		i = 0;
		if(num % 2 == 1) {
			for(i = 1; i <= num; i++) {
				if(i % 2 ==1)
				sum += i;
			}
			System.out.println(sum);
		}else {
			for(i = 1; i <= num; i++) {
				if(i % 2 ==0)
					sum += i;
			}
			System.out.println(sum);
		}
		
	
	
	}
};