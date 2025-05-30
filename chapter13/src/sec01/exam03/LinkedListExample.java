package sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Person이라는 클래스가 있으면 new Person()으로 객체를 생성하고 
// 이 객체에 접근하기 위해 참조변수 p1을 만들어주는거고 
// p1.으로 이용해서 객체 안에 있는 속성과 메소드에 접근

//✅인스턴스 변수
//클래스 안에 선언된 필드 중에서
//객체가 생성될 때 각 객체마다 따로 만들어지는 변수
//즉, 객체에 속한 데이터

//✅ 인스턴스 메서드
//객체가 호출하는 메서드
//메서드 안에서 인스턴스 변수에 접근할 수 있음
//객체마다 다른 데이터를 다룰 수 있음





// LinkedList는 일부 특별한 경우를 제외하고는 거의 사용되지 않고,
// 대부분의 경우 ArrayList가 기본 선택
public class LinkedListExample {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		// 0 인덱스에 10000개의 데이터를 삽입하여 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간: " + (endTime - startTime) + "ns");
		
		
		
		 startTime = System.nanoTime();
			for(int i = 0; i < 10000; i++) {
				list2.add(0,String.valueOf(i));
			}
			endTime = System.nanoTime();
			System.out.println("LinkedList 걸린시간: " + (endTime - startTime) + "ns");
		
	}
}
