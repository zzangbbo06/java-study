package sec05.exam04;

// 객체란 ?  클래스로부터 만들어진 실체
// 클래스 : 설계도, 객체 :  실제로 만들어진 물건
// 참조 :  객체가 있는 메모리 주소를 가리키는 변수
// 스택에 주소값, 힙에 객체 생성
// 참조형 : String(예외), 배열, 클래스 -> 반드시 객체 생성을 해야만 사용 가능(객체가 있어야 사용 가능)
// 참조형은 객체를 만들어서(힙에 객체가 생성되고 주소값이 스택에 들어가는것) 구체화해서 변수에 객체의 주소값을 저장

public class Singleton {
	// Step2
	private static final Singleton singeleton = new Singleton();
	// private으로 외부에서 변경 못하게 막기
	// => 단 하나의 객체만 만들어 사용하기 위해
	
	// Step 1
//	Singleton(){} // 외부에서 호출 가능 -> 여러 개의 객체 생성 가능
	private Singleton() {} // private: 비공개, 외부에서 new 연산자로 호출 불가
	
	// Step 3{
	
	public static Singleton getInstance() {
		// 자기 자신의 객체를 리턴
		return singeleton;
	}
}
