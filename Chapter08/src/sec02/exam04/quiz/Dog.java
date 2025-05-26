package sec02.exam04.quiz;

public class Dog extends Animal{
	

	public Dog(String kind, int leg) {
		super(kind, leg);
		// 기본 생성자로 만들고 
		//super("강아지", 4); 이렇게 대입해도 된다.
	}

	@Override
	public void eat() {
		System.out.println("주인이 주는대로 먹는다.");
	}

	@Override
	public void sound() {
		System.out.println("멍멍 짖는다.");
		
	}
}
