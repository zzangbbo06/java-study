package sec01.exam11;

public class ByteToStringExample {
	
	public static void main(String[] args) {	
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes); // 각각의 keycode 값을 문자로 바꾸고 문자열로 리턴
		System.out.println(str1);
		
		
		String str2 = new String(bytes, 6, 4);
		// index 6번부터 4개만
		System.out.println(str2);
	}	
	
}
