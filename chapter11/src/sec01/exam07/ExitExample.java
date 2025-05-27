package sec01.exam07;

public class ExitExample {

	public static void main(String[] args) {
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
			
			if(i == 5) {
				// System의 모든 멤버는 static
//				System.exit(0); // 정상 종료일 경우 0
				// exit(0)일 경우에는 뒤에 코드는 작동 안함
				break; // 가장 가까운 반복문을 빠져나감
			}
		}
		System.out.println("마무리 코드");
	}
}
