package sec01.exam13;

public class StringCharAtExample {

	public static void main(String[] args) {
		// 주민등록번호에서 남자와 여자를 구분하는 방법
		String ssn = "010624-1230123";
		
		char gender = ssn.charAt(7); //문자열에서 특정 인덱스의 문자 추출
		// 저장해두고 사용하는게 더 좋음
		// switch문이 여기서는 더 좋음
		
		if(ssn.charAt(7) == '1' || ssn.charAt(7) == '3') { // 문자 비교는 == 맞지만 '1' 이렇게 써야함
			gender = '남';
		}else if(ssn.charAt(7) == '2' || ssn.charAt(7) == '4'){
			gender = '여';
		}else {
			gender = 'x';
		}
		
		System.out.println(gender);
	}
}
