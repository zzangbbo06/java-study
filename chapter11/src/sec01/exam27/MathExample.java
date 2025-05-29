package sec01.exam27;

public class MathExample {
	public static void main(String[] args) {
		// 절대값
		// Math는 static이라는 이야기	
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		System.out.println("v1 = " + v1);
		System.out.println("v2 = " + v2);
		
		// 올림
		double v3 = Math.ceil(5.3);
		double v4 = Math.ceil(-5.3);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		// 버림(내림)
		double v5 = Math.floor(5.3);
		double v6 = Math.floor(-5.3);
		System.out.println("v5 = " + v5);
		System.out.println("v6 = " + v6);
		
		// 최대값
		int v7 = Math.max(5, 9);
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7 = " + v7);
		System.out.println("v8 = " + v8);
		
		// 최소값
		int v9 = Math.min(5, 9);
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9 = " + v9);
		System.out.println("v10 = " + v10);
		
		// 랜덤값
		double v11 = Math.random();
		System.out.println("v11 = " + v11);
		
		// 가까운 정수의 실수값 -> 실수값을 대입하면 가장 가까운 정수값을 반환
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		System.out.println("v12 = " + v12);
		System.out.println("v13 = " + v13);
		
		// 반올림(첫째자리에서 반올림)
		long v14 = Math.round(5.3); // double로 받아서 long으로 반환
		long v15 = Math.round(5.7); // double로 받아서 long으로 반환
		System.out.println("v14 = " + v14);
		System.out.println("v15 = " + v15);
		
		// 소수점 이하 특정 자리에서 반올림
		// 소수점 셋째 자리에서 반올림
		double value = 12.3456; // 1234.56
		long v16 = Math.round(value * 100);
		System.out.println("v16 = " + (v16 * 0.01));
		
		
	}
}
