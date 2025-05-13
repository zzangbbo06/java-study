package sec01.exam03;

public class VarableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
//	y = x;  // x에 저장된 값을 변수 y에 저장(복사)
//	 System.out.println("x:" + x + ", y:" + y);
		
		// x와 y의 값을 서로 교환 즉, 바꾸고 싶다면
		// 바로 서로 바꿔주면 한쪽은 없어지기 때문에 임시로 변수 하나를 만든다
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
