package sec01.exam03;

public class Computer extends Calculator{

	
	// 오버라이딩(메소드 재정의)
	@Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;// 자바에서 제공하는 정확한 PI값, 사용하도록 변경
	}
	
//	// 메소드 선언부가 틀렸을 때 예시
//	@Override // 오버라이딩이 제대로 되었는지 컴파일 단계에서 검사 
//	// 이 부분이 들어가지 않으면 새로운 메소드 추가 한 것
//	double areaCircle(double r) { 
//	//areaCircle -> areaCircle2 => error 발생, double -> int :  error 발생
//	// default -> private => error 발생
//	System.out.println("Computer 객체의 areaCircle() 실행");
//	return Math.PI * r * r;// 자바에서 제공하는 정확한 PI값, 사용하도록 변경
//	}
	
}
