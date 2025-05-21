package com.gn.homework.dimensional;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {
		
		int[] numArr = new int[6];
		int count = 0;
		
		while (count < 6) {
			int lottoNum = (int)((Math.random() * 45) + 1);
			
			// 중복 체크
			boolean isDuplicate = false;
			
			for (int i = 0; i < count; i++) {
				if (numArr[i] == lottoNum) {
					isDuplicate = true;
					break;
				}
			}		
			
			if (!isDuplicate) {
				numArr[count] = lottoNum;
				System.out.println(numArr[count] + ",");  // 위치 수정
				count++;
			}
		}

		Arrays.sort(numArr);  // 루프 끝나고 정렬

		System.out.print("정렬된 결과: ");
		for (int n : numArr) {
			System.out.print(n + " ");
		}
	}
}
