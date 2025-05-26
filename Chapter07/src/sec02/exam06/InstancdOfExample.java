package sec02.exam06;

public class InstancdOfExample {
	
	public static void main(String[] args) {
		// 테스트 먼저
		Parent parent = new Parent(); // 부모 객체가 들어가 있기 때문에 자식객체로 바꿀수 없음
//		Child child = parent; // 부모 타입을 자식타입으로 바꾸는것은 불가능(타입이 안맞음)
//		Child child = (Child)parent; // 예외발생 = ClassCastException
		
		// 강제 타입 변환을 하기 전에 검사(안전한 코딩)
		// 검사할 객체(좌측) instanceOf 클래스타입(우측)
		
		if(parent instanceof Child) { // parent 변수가 참조하는 객체가 Child 타입인지 검사
			// Child로부터 태어났느냐, 타입변환 가능하냐 이런것 //  현재는 false
			Child child = (Child)parent; // 강제 타입 변환
			System.out.println("강제 타입 변환 성공");
		}
		
		// 자바 12부터 추가된 문법
		// instanceOf의 결과가 true일 경우 자동 타입 변환되어 변수에 대입
		if(parent instanceof Child child) { 
			
			System.out.println("강제 타입 변환 성공");
		}
		Parent parentA = new Child();
		method1(parentA);
		Parent parentB = new Parent();
		method1(parentB);
	}
	public static void method1(Parent parent) {
		// 안전하게 타입 검사 후 변환하기
		if(parent instanceof Child child) {
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환되지 않음");
			
		}
	}
}
