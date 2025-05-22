package sec01.exam04;

import java.util.Scanner;

public class SupersonicAirplaneExample {
	
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		
//		sa.flyMode = 2;
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
//		sa.flyMode = 1;
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
