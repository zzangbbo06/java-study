package sec01.exam04.quiz;

import java.util.Objects;

public class Equipment {

	private String name;
	private int pricePerDay;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(int pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	
	public Equipment() {
		
	}
	public Equipment(String name, int pricePerDay) {
		this.name = name;
		this.pricePerDay = pricePerDay;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(name, pricePerDay);
		// 이건 name과 pricePerDay 값을 기준으로 적절한 해시값을 만들어줍니다.
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true; 
			//자기 자신과 비교하는 경우
//			→ 주소값이 같으면 무조건 같은 객체니까 true.
		}
		if(obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
	        return false; // 클래스 다르면 false
			// 객체의 정확한 클래스가 다르면 비교 자체를 하지 않겠다
			// 클래스 타입이 같은지만 비교해서 바로 true 리턴함
		}
		Equipment other = (Equipment) obj;
		return Objects.equals(name, other.name) && Objects.equals(pricePerDay, other.pricePerDay);
	}
	
	@Override
	public String toString() {
		return "- " + name + ": " + pricePerDay;
	}
}
