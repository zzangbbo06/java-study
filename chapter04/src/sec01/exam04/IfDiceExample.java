package sec01.exam04;

public class IfDiceExample {
	
	public static void main(String[] args) {
		int num = (int)((Math.random()*6)+1);
		// 0.0 <= Math.random() < 1.0 사이의 double형 실수
		// 0.0 <= Math.random()*6 < 6.0 사이의 double형 실수
		// 0.0 <= Math.random()*6 < 6.0 사이의 double형 실수
		// 1 <= (int)(Math.random()*6) + 1 < 7 사이의 int형 정수
		
		if(num ==1) {
			System.out.println("1번이 나왔습니다");
		}else if(num ==2) {
			
			System.out.println("2번이 나왔습니다");
		}else if(num ==3) {
			
			System.out.println("3번이 나왔습니다");
		}else if(num ==4) {
			
			System.out.println("4번이 나왔습니다");
		}else if(num ==5) {
			
			System.out.println("5번이 나왔습니다");
		}else  {
			System.out.println("6번이 나왔습니다");
		}
	}	
}
