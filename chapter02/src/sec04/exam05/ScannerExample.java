package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// 자동완성 사용해야 import부분이 생김 + 반드시 필요함
		Scanner scanner = new Scanner(System.in);
//		String inputData;
//		
//		while(true) {
//			inputData = scanner.nextLine(); //스캐너에서 읽은 한 라인 전체 (엔터키 이전까지)
//			System.out.println("입력된 문자열: \"" + inputData + "\"");
//			
//			if(inputData.equals("q")){ //문자열 비교방법
//				break;
//			}
//		}
//		System.out.println("종료");
		
//		Quiz
		// 2개의 int 값을 입력받아 입력받은 값을 화면에 ,로  연결하여 출력하시오
//		Scanner scanner1 = new Scanner(System.in);
//		Scanner scanner2 = new Scanner(System.in);
		int inputNum1, inputNum2;
		
		inputNum1 = scanner.nextInt();
		inputNum2 = scanner.nextInt();
		
		System.out.println(inputNum1+ " , " + inputNum2);
	}
}
