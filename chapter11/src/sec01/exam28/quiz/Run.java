package sec01.exam28.quiz;

import java.util.Scanner;

//Quiz
//	반 전체 학생이 몇 명인지 입력을 받아 배열을 만들고,
//	우리반 학생들 이름을 입력받아서 모두의 이름을 배열에 추가합니다.
//	전체 학생 중에서 오늘 커피 쏠 사람을 랜덤으로 뽑으려고 해요.
//	Math.random()을 활용해서 학생 한 명을 추출하여 출력하세요.
	
public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반 학생 수: ");
		int num = sc.nextInt(); 
		sc.nextLine(); // Enter(개행)가 다음 입력에 그대로 입력이 되기 때문에 제거 필요 
		// 안해주면 학생 이름: 2번뜬 상태로 시작하게 된다.
		
		String[] name = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("학생 이름: ");
			String studentName = sc.nextLine();
			
			name[i] = studentName;
		}
		
		int randomStudentNameNum = (int)(Math.random()*(num)); 
		// 0~3이 나오게 하고자 하는데 num은 학생의 수 자체를 받는데 학생의 수는 4이기 때문에 그대로 들어와야함
		
		System.out.println("커피 쏠 사람: " + name[randomStudentNameNum]);
		
	}
}
