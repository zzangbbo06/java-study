package sec01.exam01_2;

import java.util.Objects;

public class Student implements Comparable<Student>{

	
	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;  // this는 나 자신
		if(!(obj instanceof Student)) return false;
		
		Student other = (Student) obj;
		return age == other.age && name.equals(other.name);
	}
	private int hashcode() {
		return Objects.hash(age,name);

	}

	@Override
	public int compareTo(Student other) {
		// compareTo()의 리턴값 의미
		// 음수: this < other - this가 앞에 온다.
		// 양수: this > other - other가 앞에 온다.
		// 0: this == other - 순서 유지
//		
////		참조란? 그 데이터가 저장된 위치를 가리키고 있는 것
////		Person p1 = new Person();  // 새로운 객체 생성, p1은 객체 주소를 참조
////		p1은 ‘참조 변수(reference variable)’
////		Person p2 = p1;            // p2도 같은 객체 주소를 참조
////
////		p1.name = "철수";
////		System.out.println(p2.name);  // "철수", 같은 객체를 참조하니까\
//		
////		객체는 집이고, 참조 변수는 그 집의 주소가 적힌 편지함 같은 것
//			클래스를 가지고 실제로 만든 "객체" = 인스턴스
		
//		//		객체란? 프로그램에서 **데이터(속성)**와 **기능(동작)**
//		
////				클래스’는 객체를 만들기 위한 설계도
////				‘객체’는 그 설계도로 찍어낸 실제 제품
////				예를 들어, 클래스 ‘사람’이 있다면,
////				실제 한 명 한 명이 ‘객체’인 거죠.
//		
////		속성(필드, 변수): 객체가 가진 정보(예: 사람의 이름, 나이)
////		행동(메서드): 객체가 할 수 있는 일(예: 자동차가 달리다, 사람 걷다)
//		
////		두 개의 주소가 같다는 건 두 변수가 같은 객체를 가리키고 있다
//		// 해시코드가 같은 객체들을 담아놓은게 버킷이고
//		// 해시코드를 이용해서 객체를 찾고 그안에 객체 자체의 주소와 내용들은 equals로 비교, 해시코드만 있으면 중복 발생
//		// hashCode()는 객체 내용을 숫자로 요약한 값
//		
////		equals()는 책 내용 비교
////
////		hashCode()는 책의 ‘분류 번호’(예: 도서관에서 사용하는 번호)
////
////		내용이 다르면 당연히 분류 번호도 달라지게 설계되어 있어요.
////
////		분류 번호도 다르고 내용도 다르면 완전히 다른 책인 거죠.
//		
//		// 나이 오름차순
//		// 25 - 30 = -5 -> 음수 -> 25세가 앞에 감
////		return age - other.age;
//		
//		// 나이 내림차순
//		// 30 - 25 = 5 -> 양수 -> 30세가 앞에 감
		return other.age - age;
//		
//		//풀어서 쓰면 
////		if(age < other.age) return -1;
////		else if(age > other.age)return 1;
////		else return 0;
//		
//		// 문자열은 연산자로 비교 불가능
//		// String의 재정의된 compareTo() 메소드 사용
//		// 기준 문자열이 사전상 뒤면 자리 바꿈
//		// 기준 문자열이 사전상 앞이면 그대로 유지
//		
////		"김재현".compareTo("박민수");: -> 음수 -> "김재현"이 앞에 감
////		return name.compareTo(other.name); // 오름차순
////		return other.name.compareTo(name); // 내림차순
//		
//		// 복합 비교 가능
//		// 기본 정렬은 나이 오름차순
//		// 나이가 같으면 이름순
//		if(age != other.age) {
//			// 나이 오름차순
//		}else {
//			// 이름순
//		}
	}
}
	

