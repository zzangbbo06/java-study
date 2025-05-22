package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Vehicle vehicle = new Vehicle();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		driver.drive(bus); //bus를 넘기는데 Vehicle(부모) vehicle이기 때문에 자동 타입 변환
		driver.drive(taxi); // 자동 타입변환
		
	}
}
