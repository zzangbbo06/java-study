package sec02.exam01;

public class HankookTire implements Tire { 
	// 인터페이스쪽에 있는 메소드를 구현하지 않으면 빨간줄 뜸

	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
		
	}
	
}
