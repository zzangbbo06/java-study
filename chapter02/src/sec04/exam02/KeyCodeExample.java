package sec04.exam02;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception { // throws Exception :  발생한 예외를 모니터(콘솔)에 출력하고 끝내라
			int keyCode;
			
			// 키보드로부터 키코드를 읽는데 에러가 날 수 있음 -> 예외처리
			keyCode = System.in.read(); //예외처리가 되어있지 않아서 오류뜸
			// 콘솔에서 키보드로부터 입력을 받을 때까지 기다림(입력이 없으면 멈춰있음)
			System.out.println("keyCode: " + keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			
			keyCode = System.in.read(); // A, enter 까지 해서 3가지를 읽어옴 enter는 13, 10
			System.out.println("keyCode: " + keyCode);
	}
}
