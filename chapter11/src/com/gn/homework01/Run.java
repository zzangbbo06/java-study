package com.gn.homework01;

public class Run {
	
	public static void main(String[] args) {
	
		String str = "김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] str1 = str.split("\n");
		
		
		
		for(int i = 0; i <str1.length; i++) {
			String[] str2 = str1[i].split(",");
			String name = str2[0];
			int age = Integer.parseInt(str2[1]);
			String address = str2[2];
			char gender = str2[3].charAt(0);
			
			Person person = new Person(name, age, address, gender);
			System.out.println(person.toString());
			
		}
		
		
		
	}
}
