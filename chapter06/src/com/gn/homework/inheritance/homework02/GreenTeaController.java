package com.gn.homework.inheritance.homework02;



public class GreenTeaController {

	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		GreenTea gt = new GreenTea(flour, cream, powder, cheese);
		System.out.println(gt.toString());
		return "녹차 케이크가 완성되었습니다";
	}
}
