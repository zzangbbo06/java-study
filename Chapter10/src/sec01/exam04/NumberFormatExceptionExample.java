package sec01.exam04;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
//		String data2 = "200";
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);// 예외 발생
		// 숫자로만 이루어진 문자열이 아닌 문자가 같이 있을때
		
		
		int result = value1 + value2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}
	
}
