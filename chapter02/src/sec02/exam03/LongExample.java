package sec02.exam03;

public class LongExample {
	public static void main(String[] args) {
		// long(Byte)
		
		long var1 = 10;
		long var2 = 20L;  // L을 붙이거나 안붙이거나 문제 없음
//		long var3 = 20000000000; // 정수형 숫자로 쓰면 int로 인식 그래서 int 범위를 넘어가면 L을 붙여줘야함
//		자바 컴파일러는 정수 리터럴을 기본적으로 int 타입으로 간주
//		200억이 int타입의 범위를 넘기 때문에 컴파일 에러 => 해결방법 L(대문자) 또는 l (소문자)붙이기
		
		long var3 = 20000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
}
}
