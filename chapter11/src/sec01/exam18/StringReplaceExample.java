package sec01.exam18;

public class StringReplaceExample {

	public static void main(String[] args) {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr); // 원본 객체는 변경 안됨 // Java에서 객체는 불변임
		System.out.println(newStr); // 새로운 객체를 만들어냄

//		Stringbuiler는 가변객체

	}
}
