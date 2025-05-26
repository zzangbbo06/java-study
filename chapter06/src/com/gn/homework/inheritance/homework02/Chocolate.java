package com.gn.homework.inheritance.homework02;

public class Chocolate extends Cake{

	private int cherry;
	private int chip;
	
	public Chocolate(){
		
	}
	public Chocolate(double flour, double cream, int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}
	
	public int getCherry() {
		return cherry;
	}
	public void setCherry(int cherry) {
		this.cherry = cherry;
	}
	public int getChip() {
		return chip;
	}
	public void setChip(int chip) {
		this.chip = chip;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n체리: " + getCherry() + "(개)\n초콜릿 칩: "  + getChip() + "(개)";
	}

}
