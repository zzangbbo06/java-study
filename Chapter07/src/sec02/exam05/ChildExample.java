package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 자동 타입 변환
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// Parent 타입에는 없으므로 쓸 수 없다.
//		parent.field2 = "data2"; // error
//		parent.method3();
		
		// 강제 타입 변환 //ClassCastException(예외가 생김)
		Child child = (Child)parent; // parent타입을 child타입으로 바꾸는 방법
		child.field2 = "yyy";
		child.method3();
	}
}
