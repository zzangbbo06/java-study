package sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
//		int result = arr[0] + arr[3]; // 길이가 3인데 인덱스 3에 접근해서 error 발생
		// 예외 발생
		int result = arr[0] + arr[2];
		System.out.println(result);
		
		String data1 = args[0]; //예외 발생 // length가 0인데 0번 인덱스에 접근했기 때문
		String data2 = args[1];
		
		System.out.println("args[0]" + data1);
		System.out.println("args[1]" + data2);
	}
}
