package sec04.exam01;

public class Calculator {
	// 메소드
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = x / y;
		return result;
	}
	
}
