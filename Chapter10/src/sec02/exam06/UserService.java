package sec02.exam06;

public class UserService {
	public void registerUser(int age) throws InvalidAgeException{
		if(age < 0) {
			// 예외 발생시키기
			throw new InvalidAgeException("나이는 0보다 작을 수 없습니다."); // 예외 메세지 작성
			// 메세지를 통해 무슨 오류인지 명확하게 표현할 수 있음
		}
		System.out.println("사용자 등록 완료 (나이 : " + age + ")");
	}
}
// throw는 예외 객체를 직접 던짐.
// throws는 예외를 직접 처리하지 않고, 호출한 쪽에 책임을 넘김.
// -> 실제로 try-catch는 이 메소드를 호출하는 곳에서 처리해야 함.