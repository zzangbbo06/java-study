package sec04.exam05;

public class Car {
	// 필드 
	int speed;
	
	// 메소드
	int getSpeed() {
		return speed; //필드 값을 그대로 대입
	}
	
	void keyTurnOn() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
	
}
