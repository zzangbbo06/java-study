package com.gn.homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {

	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		lottery.add(l);
		return true;
	}
	public boolean deleteObject(Lottery l) {
		
		boolean deleted = lottery.remove(l); // boolean으로 반환
		
			if(deleted && win != null && win.contains(l)){
				win.remove(l);
			}
		
			return deleted;
			
	}
	public Set<Lottery> searchObject(){
		return lottery;
	}
	public Set<Lottery> winObject(){
		if(lottery.isEmpty()) {
			System.out.println("추첨 대상자가 없습니다.");
			return null;
		}else if(lottery.size() < 4) {
			
			return null;
		}else{
			
			List<Lottery> lotteryList = new ArrayList<>(lottery);
	      

	        while (win.size() < 4) {
	            int randomIndex = (int)(Math.random() * lotteryList.size());
	            win.add(lotteryList.get(randomIndex));
	        }

	        return win;
	    }
		
	}
	public Set<Lottery> sortedWinObject(){
		List<Lottery> lotteryList = new ArrayList<Lottery>(winObject());
		Collections.sort(lotteryList);
		Set<Lottery> setLotteryList = new LinkedHashSet<Lottery>(lotteryList);
		return setLotteryList;
		
	}
	public boolean searchWinner(Lottery l) {
		if(lottery.contains(l)) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
			return lottery.contains(l);
		}else {
			System.out.println("담에 또 사라 ㅋ");
			return lottery.contains(l);
		}
	}
}
