package sec01.exam04.quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Quiz3 {
	// Quiz
//	스포츠 장비 대여점에서 대여 가능한 장비 목록을 관리하려고 합니다.
//	두 개의 창고에 있는 장비들 간의 합집합, 교집합, 차집합을 연산해서 결과를 출력하세요.
//	결과를 출력할 때는 Iterator를 사용하여 장비 정보를 출력하세요.
	
//	참고: 집합 연산의 결과를 담을 HashSet을 각각 따로 만들어야 
//	기존 데이터를 건드리지 않고 원활하게 작업할 수 있어요.
	
//	Equipment 클래스
//	1. 필드
//		- name: String
//		- pricePerDay: int
//	2. 생성자
//		+ Equipment()
//		+ Equipment(name: String, pricePerDay: int)
//	3. 메소드
//	동등 객체를 판단할 수 있도록 hashCode()와 equals() 재정의
//	출력 예시에 맞춰 toString() 재정의
	
//	[사용 데이터]
//	창고 1(storage1)
//	장비 이름  |  하루 대여 요금
//	-----------------------
//	  라켓    |	  15000	  
//	  배트    |	  6000
//	  축구공   |    3000
//	​
//	창고 2(storage2)
//	장비 이름  |  하루 대여 요금
//	-----------------------
//	  배트    |	   6000	  
//	 야구공   |	   5000
//	 글로브   |      9000
	
//	[출력]
//	*** 합집합 ***
//	- 야구공: 5000원
//	- 배트: 6000원
//	- 라켓: 15000원
//	- 축구공: 3000원
//	- 글로브: 9000원
//	*** 교집합 ***
//	- 배트: 6000원
//	*** 차집합 ***
//	- 라켓: 15000원
//	- 축구공: 3000원
	
	public static void main(String[] args) {
		
		Set<Equipment> storage1 = new HashSet<Equipment>();
		Equipment equipment = new Equipment("라켓", 15000);
		storage1.add(equipment);
		storage1.add(new Equipment("배트", 6000)); // 요렇게 하는게 맞음(toString 재정의 안하면 주소값이 나옴)
		equipment = new Equipment("축구공", 3000);
		storage1.add(equipment);
		
		Set<Equipment> storage2 = new HashSet<Equipment>();
		storage2.add(new Equipment("배트", 6000));
		equipment = new Equipment("야구공", 5000);
		storage2.add(equipment);
		storage2.add(new Equipment("글로브", 9000));
				
		Set<Equipment> storageSum = new HashSet<Equipment>(storage1);
		storageSum.addAll(storage2);
		System.out.println("*** 합집합 ***");
		
		Iterator<Equipment> iterator1 = storageSum.iterator();
		while(iterator1.hasNext()) {
			Equipment element = iterator1.next();
			
			System.out.println(element);
		}
		
		System.out.println();
		
		Set<Equipment> storageMulti = new HashSet<Equipment>(storage1);
		// storage1을 유지시키기 위해 뒤쪽에 stroage1을 복사해서 사용
		storageMulti.retainAll(storage2);
		System.out.println("*** 교집합 ***\n" + storageMulti);
		
		System.out.println();
		
		Set<Equipment> storageMinus = new HashSet<Equipment>(storage1);
		storageMinus.removeAll(storage2);
		System.out.println("*** 차집합 ***");
		
		Iterator<Equipment> iterator2 = storageMinus.iterator();
		while(iterator2.hasNext()) {
			Equipment element = iterator2.next();
			
			System.out.println(element);
		}
	}

}
