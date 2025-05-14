package sec03.exam01;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue; // 1byte -> 4byte, 자동 형변환
		System.out.println("intValue:" + intValue);
		
		char charValue = '가';
		intValue = charValue; //2byte -> 4byte, 자동 형변환
		System.out.println("intValue:" + intValue);
		
		intValue = 30;
		long longValue = intValue; // 4byte -> 8byte, 자동 형변환
		System.out.println("longValue:" + longValue);
		
		longValue = 100;
		float floatValue =longValue; // 8byte -> 4byte 이지만 실제로 저장할 수 있는 값의 범위는 float가 더 크기 때문에 자동 형변환이 일어난다
		System.out.println("floatValue:" + floatValue);
		
//		floatValue = 100.5; 에러가 남 float는 f 또는 F붙여줘야함
			floatValue = 100.5F;
			double doubleValue = floatValue;
			System.out.println("doubleValue:" + doubleValue);
			
			// 주의! byte -> char로 자동 형변환 불가 : char는 0부터의 값을 가지는데 byte는 음수부터 값을 가지기 때문에 자동 형변환은 일어나지 않는다
			byte byteVal = 65;
//			char charVal = byteVal; // char는 음수를 포함하지 않는데 byte타입은 음수를 포함
			
			
	}
}
