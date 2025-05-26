package sec02.exam04.quiz;

public class Eagle extends Animal implements Flyable{

	public Eagle(String kind, int leg) {
		super(kind, leg);
	}
	
	@Override
	public void eat() {
		System.out.println("동물을 잡아 먹는다.");
		
	}
	@Override
	public void sound() {
		System.out.println("모른다.");
		
	}
	@Override
	public void fly() {
		System.out.println("독수리는 날아다닌다.");
		
	}
}
