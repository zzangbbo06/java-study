package sec01.exam04.quiz;

import java.util.Objects;

public class Song {

	private String name;
	private String singer;
	
	public Song() {
		
	}
	
	public Song(String name, String singer) {
		this.name = name;
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, singer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 비교 대상(obj)이 나(this) 자신인가?”
			return true;
		if (obj == null) // null이면 절대 같을 수 없으므로 false.
			return false;
		if (getClass() != obj.getClass()) // 같은 객체에서 만들어졌는가, 클래스 타입이 같은가
			return false;
		Song other = (Song) obj; // obj가 Song 클래스라고 확신했으니, 타입 캐스팅.
		// 이제 other.name, other.singer에 접근할 수 있게 됨.
		return (Objects.equals(name, other.name) && Objects.equals(singer, other.singer));
	}
	
	@Override
	public String toString() {
		
		return "{제목 = " + name + ", 가수 = " + singer + "}";
	}
	
	
}
