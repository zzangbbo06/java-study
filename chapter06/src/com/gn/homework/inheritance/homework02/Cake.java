package com.gn.homework.inheritance.homework02;

public class Cake {
	private double flour;
	private double cream;
	
	public Cake() {
		
	}
	public Cake(double flour, double cream) {
		this.flour = flour;
		this.cream = cream;
	}
	public double getFlour() {
		return flour;
	}
	public void setFlour(double Flour) {
		this.flour = flour;
	}
	public double getCream() {
		return cream;
	}
	public void setCream(double cream) {
		this.cream = cream;
	}
	
	public String toString() {
		return "밀가루(g): " + getFlour() + "(g)"
		+ " \n크림: " + getCream() + "(g)";
	}
}
