package com.gn.homework.inheritance.homework02;

public class GreenTea extends Cake{
	
	private double powder;
	private int cheese;
	
	public GreenTea() {
		
	}
	
	public GreenTea(double flour, double cream, double powder, int cheese) {
		super(flour, cream);
		this.powder = powder;
		this.cheese = cheese;
	}
	
	public double getPowder() {
		return powder;
	}
	public void setPowder(double powder) {
		this.powder = powder;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	@Override
	public String toString() {
		return super.toString() + "\n녹차파우더: " + getPowder() + "(g)\n치즈큐브: " + getCheese() + "(개)" ;
	}
}
