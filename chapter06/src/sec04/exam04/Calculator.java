package sec04.exam04;

public class Calculator {
	// 메소드
	int plus(int x, int y) { // int와 같은 변수는 필수, 자바스크립트랑 다른점
		return x+y; // return을 써줘야함
		
	}
	double avg(int x, int y) {
		double sum = plus(x, y); // 소수점 결과를 내기 위해 미리 double형으로 받음
		return sum / 2;	
	}
	
	void excute() {
		double result = avg (7,10); //void 이기 때문에 return은 필요없음
		println("실행 결과 : " + result);
	}
	// 내부 호출 연습용
	void println(String message) {
		System.out.println(message);
	}
}
