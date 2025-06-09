package sec01.exam05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		// 인스턴스는 다르지만 내부 데이터가 동일한 경우
		// 객체의 hashCode()와 equals()를 기준으로 판단
		set.add(new Member("김재현",30));
		set.add(new Member("김재현",30));
		set.add(new Member("김재현",20));
		set.add(new Member("김재현",10));
		set.add(new Member("김재현",19));
		set.add(new Member("김재현",10));
		
		//  hashCode()와 equals()를 재정의 하지 않으면 삭제 안됨
		set.remove(new Member("김재현",30));
		
		// 이 외에도 동등 객체로 판단하는 많은 메소드들이 제대로 동작하려면 재정의 필수임
		System.out.println("총 객체수: " + set.size());
		
		for(Member member : set) {
			System.out.println("\t" + member);
		}
		
		// 요소 정렬
		// Integer, String과 같은 경우 Collections.sort() 바로 사용 가능
		// Member처럼 사용자 정의 객체끼리 비교할 경우 비교 불가능
		// 정렬 기준으로 어떤 값을 사용할지 별도로 구현해야 함
		// Member 클래스가 Comparable을 구현
		
		Set<Member> members = new HashSet<Member>();
		members.add(new Member("김재현",30));
		members.add(new Member("이수진",25));
		members.add(new Member("박민수",40));
		
		List<Member> setList = new ArrayList<Member>(members);
		Collections.sort(setList);
		for(Member m : setList) {
			System.out.println(m.getName() + " - " + m.getAge());
		}

		System.out.println();
		
		// 다시 Set으로 (순서 유지하려면 LinkedHashSet)
		Set<Member> sortedSet = new LinkedHashSet<Member>(setList);
		for(Member m: sortedSet) {
			System.out.println(m.getName() + " - " + m.getAge());
			
		}
		
		
		// ArrayList의 요소에서 중복 제거하기
		List<Member> memList = new ArrayList<Member>();
		memList.add(new Member("김재현", 30));
		memList.add(new Member("이수진",25));
		memList.add(new Member("박민수",40));
		memList.add(new Member("김재현", 30)); // 중복
		memList.add(new Member("이수진",25)); // 중복
		
		Set<Member> memListSet = new HashSet<Member>();
		for(Member m:memListSet) {
			System.out.println(m.getName() + " - " + m.getAge());
		}
	}
}
