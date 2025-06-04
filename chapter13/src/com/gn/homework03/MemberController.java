package com.gn.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MemberController {

	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}else {
			return false;
		}
	}
	public String logIn(String id, String password) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(password)) {
				return map.get(id).getName();
			}else {
				return null;
			}
			
		}else {
				return null;
		}
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id)) {
			if(map.get(id).getPassword().equals(oldPw)) {
				map.put(id, new Member(newPw, map.get(id).getName()));
				return true;
			}else {
				return false;
			}
			
		}else {
			return false;
		}
	}
	
	public void changeName(String id, String newName) {
		map.get(id).setName(newName);		
	}
	
	public TreeMap<String,String> sameName(String name){
		
		TreeMap<String, String> result = new TreeMap<>();
		Set<String> keySet = map.keySet();
		
		Iterator<String> keySetIterator = keySet.iterator();
		while(keySetIterator.hasNext()) {
			String key = (String)keySetIterator.next();
			String value = map.get(key).getName();
			
			if(value.equals(name)) {
				result.put(key,value);
			}
		}
		return result;
	}
		
}
