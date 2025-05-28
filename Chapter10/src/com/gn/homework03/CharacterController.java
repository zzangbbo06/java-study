package com.gn.homework03;

public class CharacterController {

	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException{		
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");			
		}
		
		int count = 0;
		for(char ch : s.toCharArray()) { //문자열 -> 문자 배열(char[])
			if((ch >= 'A' && ch <= 'Z')|| (ch >= 'a' && ch <= 'z')) {
				// 문자로 조건문도 사용가능, 문자는 정수값(유니코드)로 저장되기 때문
				count++;
			}
		}
		return count;
	}
}
