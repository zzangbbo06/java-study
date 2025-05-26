package sec02.exam04;

public class Driver {

	public void drive(Vehicle vehicle) {
		// 버스일 때는 승차요금 확인(checkFare() 기능)이 필요
		
//		if(vehicle instanceof Bus) { // 의 인스턴스가 맞는지?
//			// 안전한게 검사 후 강제 타입 변환
//			Bus bus = (Bus)vehicle;
//			bus.checkFare();			
//		}
	
		// instanceof 자동 타입 변환
		if(vehicle instanceof Bus bus) {
			bus.checkFare();
		}
		
		vehicle.run();
	}
}
