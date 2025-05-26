package sec02.exam03;

public class VehicleExample {
	
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 자동변환
		
		vehicle.run();
		

		System.out.println();
//		vehicle.checkFare(); // error // Vehicle 인터페이스 타입에 없는 멤버는 사용 불가
		
		Bus bus = (Bus)vehicle; // 강제 타입 변환
		bus.run();
		bus.checkFare();
		
	}
}
