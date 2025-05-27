package com.gn.homework04;

public class Run {
	
	public static void main(String[] args) {
		SmartPhone[] sp = new SmartPhone[2];
		
		sp[0] = new GalaxyS24();
		sp[1] = new Iphone15();
		
		for(int i = 0; i < sp.length; i++) {
			sp[i].printMaker();
			sp[i].makeCall();
			sp[i].takeCall();
			sp[i].touch();
			sp[i].charge();
			sp[i].picture();
			System.out.println();
		}
	}
}
