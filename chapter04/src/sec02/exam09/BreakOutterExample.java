package sec02.exam09;

public class BreakOutterExample {
	
	public static void main(String[] args) {
		// 중첩 for문에서 break 사용 시 가장 가까운 for문을 빠져나감
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 3) {
					break;
				}
				System.out.println("i = " + i + ", j = " + j);
			}
		}
		
		System.out.println();
		
		// 이름 붙은 반복문
		Outter: for(char upper = 'A'; upper <= 'Z'; upper++) { // 유니코드인 65로 저장, Z는 90
			for(char lower = 'a'; lower <= 'z'; lower++) { // break시 가장 가까운 이 부분만 빠져나옴
				System.out.println(upper + "-" + lower);
				
				if(lower == 'g') {
					break Outter; // Label(레이블)이 지정된 for문을 빠져나감
				}
			}
		}
	}
}
