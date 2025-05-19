package sec03.exam01;

public class Car {
	// 생성자 -> return 값이 없고 클래스명이랑 똑같이 만들어야함
	// 개발자가 명시적으로 생성자를 넣어주면 기본생성자는 만들수 없음.
	Car(String color, int cc){
		System.out.println(color + "색의 " + cc + "cc 자동차가 생성됨");
	}
}
