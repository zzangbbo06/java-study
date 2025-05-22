package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	
//	@Override // 접근자 맞춰줘야함
//	public void stop() { //final method는 재정의 할 수 없다.
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
}
