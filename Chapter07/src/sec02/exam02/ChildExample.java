package sec02.exam02;

public class ChildExample {
	
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //Parent 타입으로 자동 타입 변환
// 타입(type)은 데이터의 종류와 그 데이터에 대해 할 0수 있는 연산(동작)을 정의한 것
		
		parent.method1();
		parent.method2(); // 자식 쪽에 재정의 된 메소드가 호출됨.
//		parent.method3(); // error -> 상속된 메소드가 아니기 때문
		// Parent 타입에 없는 필드나 메소드는 접근 불가능
		System.out.println(); // 한줄띄기
		
		child.method2();
		child.method3();
		
	}
}
