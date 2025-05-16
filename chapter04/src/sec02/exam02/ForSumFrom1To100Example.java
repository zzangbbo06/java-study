package sec02.exam02;

public class ForSumFrom1To100Example {
	
	public static void main(String[] args) {
		// 1부터 100까지 더해서 출력
		// 반복문 안에 sum 혹은 출력문을 넣으면 그 행위 또한 반복된다.
		int sum = 0;
		
		for(int i = 1 ; i <= 100; i++) {
//			int sum = 0;
			// 그렇다고 sum 초기화식을 안에 넣으면 지역변수로 되기 때문에 출력이 안된다.
			// 안에 넣으면 반복문 넣을때마다 sum이 초기화 된다.
			sum += i;
		}
		System.out.println(sum);
	}
}
