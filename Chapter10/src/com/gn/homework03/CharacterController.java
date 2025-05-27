package com.gn.homework03;

public class CharacterController {

	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException{		
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");			
		}
		
		int count = 0;
		for(char ch : s.toCharArray()) {
			if((ch >= 'A' && ch <= 'Z')|| (ch >= 'a' && ch <= 'z')) {
				count++;
			}
		}
		return count;
	}
}
