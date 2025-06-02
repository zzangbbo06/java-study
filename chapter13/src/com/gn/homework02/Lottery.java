package com.gn.homework02;

import java.util.Objects;

public class Lottery implements Comparable<Lottery>{

	private String name;
	private String phone;
	
	public Lottery() {
		
	}

	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	@Override
	public int compareTo(Lottery l) {
		int nameCompare = name.compareTo(l.name);  // 이름 먼저 비교
	    if (nameCompare != 0) {
	        return nameCompare;  // 이름이 다르면 그 결과 반환
	    }
	    return phone.compareTo(l.phone);  // 이름이 같으면 전화번호로 비교 (오름차순)
	}
	
	
	
}
