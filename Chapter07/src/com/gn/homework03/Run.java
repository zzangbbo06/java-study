package com.gn.homework03;

public class Run {

	public static void main(String[] args) {
		Car car1 = new Car(new GasolineEngine());
		Car car2 = new Car(new ElectricEngine());

		
			car1.startEngine();
			car2.startEngine();
	}
}

	
	
	
	
	

