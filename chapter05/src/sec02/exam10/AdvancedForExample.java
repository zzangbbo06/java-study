package sec02.exam10;

public class AdvancedForExample {
	
		public static void main(String[] args) {
			int[] scores = {95, 71, 84, 93, 87};
			
			int sum = 0;
			
			for(int score: scores) {
				sum += score;
			}
			System.out.println(sum);
			System.out.println((double)sum/scores.length);
			
			// 정리:
			// 기본 for문 보다 코드가 간결하여 자주 쓰임
			// 배열 index 값의 사용이 필요할 때는 기본 for문 사용
			
		}
}
