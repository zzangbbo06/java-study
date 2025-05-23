package sec01.exam04;

public class Audio implements RemoteControl{
	//필드
	
		private int volume;
		
		//turnOn() 추상 메소드의 실체 메소드
		
		@Override
		public void turnOn() {
			System.err.println("Audio를 켭니다");
			
		}

		@Override
		public void turnOff() {
			System.err.println("Audio를 끕니다");
		
		}

		@Override
		public void setVolume(int volume) {
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume < RemoteControl.MIN_VOLUME) {
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("현재 볼륨 : " + this.volume);
		}
}
