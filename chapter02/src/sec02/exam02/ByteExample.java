package sec02.exam02;

public class ByteExample {
	public static void main(String[] args) {
		// byte(1byte)
		// -128 ~ 127(2의 7승(0~7))
		
		byte var1 = -128;
		byte var2 = 0;
		byte var3 = 127;
//		byte var4 = 128;  // error 남 => 범위를 벗어난 값을 저장하려고 하면 컴파일 에러 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		// 참고 : 실행 중에 값의 범위를 벗어난 경우(순환)
		System.out.println(); // 줄바꿈
		
		byte var5 = 126;
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		var5++; //  오버플로우 발생 127이 최대기 때문에 그 다음은 순환하여 -128로 넘어감
		System.out.println(var5);
		var5++;
		System.out.println(var5);
		
		System.out.println(); // 줄바꿈
		
		byte var6 = -127;
		System.out.println(var6); // 줄바꿈
		var6 --;
		System.out.println(var6); // 줄바꿈
		var6--; // 언더플로우 발생
		System.out.println(var6); // 줄바꿈
		var6--;
		System.out.println(var6); // 줄바꿈
		var6 --;
	}
}





