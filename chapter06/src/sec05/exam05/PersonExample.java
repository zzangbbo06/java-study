package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "USA"; // final 필드는 변경 불가
//		p1.ssn = "654321-7654321"; // final 필드 변경 불가
		p1.name = "홍삼원"; // final이 아니기 때문
		

	}

}
