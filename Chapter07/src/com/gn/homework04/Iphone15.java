package com.gn.homework04;

public class Iphone15 extends SmartPhone{

	@Override
	public void makeCall() {

		System.out.println("번호를 누르고 통화버튼을 누름");
		
	}

	@Override
	public void takeCall() {
		System.out.println("수신 버튼을 누름");
		
	}

	@Override
	public void picture() {
		System.out.println("1200, 1600만 트리플 카메라");
		
	}

	@Override
	public void charge() {
		System.out.println("고속 충전");
		
	}
	
	@Override
	public void touch() {
		System.out.println("정전식");
		
	}

	@Override
	void printMaker() {
		System.out.println("아이폰15는 애플에서 만들어 졌다.");
		
	}
}
