package com.gn.homework.inheritance.homework01;

import java.util.Scanner;

// 생성자 = "객체 만들 때 값 설정"
// ✔ setter/getter = "객체 만든 후 외부에서 값 읽기/쓰기"
// 외부에서 설정해줄때 필요
public class Run {


	public static void main(String[] args) {
		Student[] student = new Student[3];
		
		student[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		student[1] = new Student("이영희", 23, 167.0, 54.0, 1, "물리학과");
		student[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		
		
		for(Student s : student) {
			System.out.println(s.toString());
		}
		
		System.out.println();
		System.out.println("=== 사원 입력받기 ===");
		
		Employee[] employee = new Employee[10];
		
		employee[0] = new Employee("주인성", 28, 180.3, 72.0, 2000000, "영업부");
		
		for(Employee e: employee) {
            if(e != null) {
                System.out.println(e.toString());
            }
        } //Exception 잡아주기
		
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		
		while(true) {
			System.out.println("계속 추가하시겠습니까 ? ");
			String yesorNo = sc.nextLine();
			
			if(yesorNo.equalsIgnoreCase("Y")) {
				System.out.println("정보를 입력해주세요 !");
				System.out.println("이름 : ");
				String name = sc.nextLine();
				System.out.println("나이 : ");
				int age = sc.nextInt();
				System.out.println("키 : ");
				double height = sc.nextDouble();
				System.out.println("몸무게 : ");
				double weight = sc.nextDouble();
				System.out.println("급여 : ");
				int salary = sc.nextInt();
				System.out.println("부서 : ");
				sc.nextLine(); // 버퍼 비우기
				String dept = sc.nextLine();
				
				
				employee[count++] = new Employee(name,age,height,weight,salary,dept);
				
			}else if(yesorNo.equalsIgnoreCase("N")) {
				System.out.println("종료하겠습니다.");
				for(int i = 0; i < count; i++) {
					System.out.println(employee[i].toString());
					}
				break;
			}else {
				System.out.println("명령어를 잘못입력하셨습니다. Y/N 으로만 입력해주세요. ");
			}
			
			
			for(int i = 0; i < count; i++) {
				System.out.println(employee[i].toString());
			}
		};
	}
}
