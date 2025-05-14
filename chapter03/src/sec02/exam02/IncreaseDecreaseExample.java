package sec02.exam02;

public class IncreaseDecreaseExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("----------------------------");
		x++;	//	x = x + 1; -> 11
		++x;	// 	x = x + 1; -> 12
		System.out.println("x=" + x);
		
		
		System.out.println("----------------------------");
		y--; // y = y - 1; -> 9 
		--y; // y = y - 1; -> 8 
		System.out.println("y=" + y);
		
		// 다른 연산자와 같이 쓸 때
		System.out.println("----------------------------");
		z = x++; // z = x; x = x + 1;//z에 x를 대입후에 x를 증감해라
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------------------");
		z = ++x; // z = x; x = x + 1;//x를 1 증감하고 z에 대입
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("----------------------------");
//		z = ++x + y ++; //예상 z = 15 + 8, x = 15, y = 9
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		
		// 가독성을 고려하여 명확하게 작성하는 것도 좋은 방법
		System.out.println("----------------------------");
		++x;
		z = x + y;
		y ++;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
}
