package sec04.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); // 객체생성
		
		// 현재 초기 gas 값은 ? 기본값 0
		myCar.setGas(5);
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			myCar.run();
		}
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
