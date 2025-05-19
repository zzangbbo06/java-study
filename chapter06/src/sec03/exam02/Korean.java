package sec03.exam02;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name; // 이름
	String ssn; // 주민번호
	
	// 생성자
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
	public Korean(String name, String ssn) {
		// 실무에서는 매개변수와 필드이름을 똑같이 넣는다.
		
//		name = name; // 양쪽 다 매개변수 name으로 인식됨
//		ssn = ssn;
		
		this.name = name;
		this.ssn = ssn;
		// 여기서 this는 객체 자기 자신을 참조(가리킴)
		// 객체 내부에서 자기 자신을 가리킬 때 사용
	}
	
	
	
	//메소드(아직안배워서 사용x)
}
