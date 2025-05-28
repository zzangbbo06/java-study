package com.gn;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		
		
			String sp_before_email = email.substring(0,email.indexOf("@"));
			String sp_after_email = email.substring(email.indexOf("@"));
			
			if(sp_after_email.equals("@goodee.co.kr")) {
				String SP_email = sp_before_email.toUpperCase();
				System.out.println(SP_email);
			}else {
				System.out.println("유효하지 않은 이메일입니다.");
			}
			
			
			
		
	}
}
