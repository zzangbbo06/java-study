package sec02.exam07;

public class WhileSum1To100Example {
	public static void main(String[] args) {
		int i = 1; // 초기화식
		while(i <= 10) { // 조건식
			System.out.println(i);
			i++; // 증감식 => 써주지 않으면 무한루프에 빠짐
		}
	}
}
