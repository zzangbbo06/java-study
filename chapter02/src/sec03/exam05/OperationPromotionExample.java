package sec03.exam05;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2; // int타입 아래로는 전부 int로 바뀜 int로 바꿔줘야함 -> int + int
		int intValue1 = byteValue1 + byteValue2; 
		System.out.println(intValue1);
		
		// char도 마찬가지(연산 시 int로 형변환)
		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2; // int + int
		int intValue2 = charValue1 + charValue2; 
		System.out.println("유니코드= " + intValue2);
		// 문자로 출력하고 싶다면 char타입으로 강제 형변환
		System.out.println("출력문자= " +(char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4; // 정수 연산의 결과는 정수, 10 / 4 = 2...2
		System.out.println(intValue4);
		
		double doubleValue1 = intValue3 / 4;
		System.out.println(doubleValue1);
		
		//실수 결과를 얻으려면
		double doubleValue2 = intValue3 / 4.0; // 실수 literal를 사용하면 연산하기 전에 type을 맞추기 위해 double(4.0)로 바뀜
		System.out.println(doubleValue2);
		
		int x = 1;
		int y = 2;
//		double result = (double)x /y;
//		double result = x /(double)y;
		double result = (double)x /(double)y;
		System.out.println(result);
		
	}
}
