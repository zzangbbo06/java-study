package sec01.exam01.quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Run {
	// Quiz
//	영화관 좌석의 목록 정보를 가지고 있는 ArrayList를 생성합니다.
//	좌석의 정보는 문자열 형태로 작성합니다.
//	아래 실행 순서를 참고하여 seats에 값을 추가, 제거, 검색, 정렬해보세요.
	
//	[실행 순서]
//	1. ArrayList에 초기 좌석 A2, A1, B1, B2를 추가합니다.
//	2. ArrayList의 초기 좌석 정보를 추가한 후 출력하세요. 
//	3. 영화관 좌석중에서 3번째 좌석에 A3 좌석을 추가합니다. 
//	4. 그 다음, 영화관 좌석 목록을 출력하세요. 
//	5. 예약하고 싶은 좌석의 정보를 키보드로 입력받습니다. 
//	6. 만일 사용자가 입력한 좌석이 존재하는 좌석이라면 해당 좌석의 정보뒤에 (예약)이라는 문자열을 추가해주세요. 
//	7. 삭제하고 싶은 좌석의 정보를 키보드로 입력받습니다. 
//	8. 만일 사용자가 입력하는 좌석이 존재하는 좌석이라면 해당 좌석을 제거한 후 목록을 출력해주세요. 
//	9. 마지막으로 오름차순 정렬한 후에 출력합니다.
	
//	[출력]
//	초기 좌석 목록: [A2, A1, B1, B2]
//	A3 좌석 추가 후: [A2, A1, A3, B1, B2]
//	예약 좌석 : A3
//	좌석 예약 후 : [A2, A1, A3(예약), B1, B2]
//	삭제 좌석 : B1
//	좌석 삭제 후 : [A2, A1, A3(예약), B2]
//	좌석 정렬 후: [A1, A2, A3(예약), B2]
		
//	초기 좌석 목록: [A2, A1, B1, B2]
//	A3 좌석 추가 후: [A2, A1, A3, B1, B2]
//	예약 좌석 : C1
//	C1은(는) 존재하지 않는 좌석입니다.
//	좌석 예약 후 : [A2, A1, A3, B1, B2]
//	삭제 좌석 : A5
//	A5 좌석은 목록에 없습니다.
//	좌석 삭제 후 : [A2, A1, A3, B1, B2]
//	좌석 정렬 후: [A1, A2, A3, B1, B2]
	
	public static void main(String[] args) {
		List<String> seats = new ArrayList<>();
		
		seats.add("A2");
		seats.add("A1");
		seats.add("B1");
		seats.add("B2");
		System.out.println("초기 좌석 목록: " + seats);
		
		seats.add(2, "A3");
		System.out.println("A3 추가 좌석 목록: " + seats);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("예약 좌석: ");
		String reservationSeat = sc.nextLine();
		
		
		if(seats.contains(reservationSeat)) {
			seats.set(seats.indexOf(reservationSeat), reservationSeat + "(예약)");
			System.out.println("좌석 예약 후: " + seats);
		}else {
			System.out.println(reservationSeat + "는 존재하지 않는 좌석입니다.");
		}
		
		System.out.print("삭제 좌석: ");
		String deleteSeat = sc.nextLine();
		
		boolean removeSeats = seats.remove(deleteSeat);
		if(removeSeats == true) {
			
			System.out.println("좌석 삭제 후: " + seats);
		}else {
			System.out.println(deleteSeat + "좌석은 목록에 없습니다.");
		}
		
		Collections.sort(seats);
		System.out.println("좌석 정렬 후: " + seats);
	}

}
