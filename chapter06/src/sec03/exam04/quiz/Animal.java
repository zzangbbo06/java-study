package sec03.exam04.quiz;

public class Animal {
	String kind;
	int age;
	
	Animal(int age){
		this("사람", age); // 항상 첫줄에 와야한다.
//		this.age = age;
//		kind = "사람";
		
	}
	Animal(String kind){
		this(kind, 1);
//		this.kind = kind;
//		age = 1;
	}
	Animal(String kind, int age){
		this.kind = kind;
		this.age = age;
	}
	
	
	// 출력 메소드
	void info() {
		System.out.println(kind + " : " + age + "살");
	}
}
