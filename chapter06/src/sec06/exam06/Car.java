package sec06.exam06;

public class Car {
	//필드
	// 특별한 이유가 없다면 모든 필드는 기본적으로 private으로 선언
	private int speed;
	private boolean stop;
	
	//메소드
	public int getSpeed() { //만약 getter만 존재하면 읽기 전용 필드
		return speed;
	}
	public void setSpeed(int speed) { // setting만 하는 것이기 때문에 void(return 값이 없으면)
		if(speed < 0) {
			this.speed = 0;
			return; // 리턴을 빼던가
		}else {	// else를 빼던가
			this.speed = speed;
		}
	}
	
	
	// Quiz : Getter/Setter 만들기
	
	public boolean isStop() { // 자동완성 가능
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop) {
			speed = 0;
		}
	}
}
