package sec02.exam02;

public class FieldInitValueExample {
	public static void main(String[] args) {
		FieldInitValue value = new FieldInitValue();
		
		System.out.println("byteField : " + value.byteField);
		System.out.println("shortField : " + value.shortField);
		System.out.println("intField : " + value.intField);
		System.out.println("longField : " + value.longField);
		
		System.out.println("booleanField : " + value.booleanField);
		System.out.println("charField : " + value.charField); // 빈 공백
		
		System.out.println("floatField : " + value.floatField);
		System.out.println("doubleField : " + value.doubleField);
		
		// 참조타입
		System.out.println("int[] arrField : " + value.arrField);
		System.out.println("referenceField : " + value.referenceField);
	}
	
}
