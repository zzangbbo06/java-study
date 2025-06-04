package sec01.exam06.quiz;

public class Planet {

	private String name;
	private int diameter;
	private double period;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public double getPeriod() {
		return period;
	}
	public void setPeriod(double period) {
		this.period = period;
	}
	public Planet() {
		
	}
	public Planet(String name, int diameter, double period) {
		super();
		this.name = name;
		this.diameter = diameter;
		this.period = period;
	}
	@Override
	public String toString() {	
		return "지름: " + diameter + "km, 공전주기: " + period + "년";
	}
	
	
}
