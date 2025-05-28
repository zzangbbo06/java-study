package sec01.quiz_string;

import java.util.Scanner;

public class Quiz3 {
	// Quiz
//	원본 문자열과 찾는 문자열을 입력 받아 개수를 출력하는 프로그램을 구현하기 위해 
//	실행 클래스의 count 메서드를 작성하시오.
//	count(원본문자열, 찾는문자열) 메서드는 원본 문자열에서 찾는 문자열의 개수를 리턴하는 메소드입니다.
//	※ 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
	
//	[입력]
//	1) 123AB123 AB
//	2) 123AB123 13
	
//	[출력]
//	1) 1
//	2) 0

//  [힌트]
//	indexOf(String str, int fromIndex)를 이용해 반복해서 찾기
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(count(str1, str2));
	}

	private static int count(String str1, String str2) {
		int cnt = 0;
		int index = 0;
		
	
		
		
		// indexOf(str2, index): str1에서 str2를 index 위치부터 찾아 첫 등장 위치를 반환
		// 찾은 위치를 index에 저장, 찾지 못하면 -1 반환되어 while 종료
		// 찾았다면 cnt 증가 (횟수 세기)
		// index += str2.length(): 중복되지 않게 다음 위치부터 다시 찾음

		while((index = str1.indexOf(str2, index)) != -1){
			// (str2, index)에서 index는 검색을 시작할 위치, str2가 없다면 자동 종료
				cnt++;
				index += str2.length();
		// 현재 index = 0, indexOf는 내가 원하는 문자열을 찾으면 그 문자열의 첫번째 인덱스를 반환
		// 예) ABAB123 AB 라면 첫번째 인덱스 0을 반환하고 0에 str2의 length는 2 이기 때문에
		//	   index = 0 + 2가 되어서 인덱스 2번부터 다시 찾기 시작
				// index += str2.length(); 여기 값이 str1.indexOf(str2, index) 의 index에 들어가서 
				// str2를 찾으면 앞에 있는 index에 값을 저장
			}
			return cnt;
	}
		
}


