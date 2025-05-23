package sec03.exam03.quiz;

public class InformalEmployee extends Employee{
	private int primaryPay;

	
	public InformalEmployee(String name, String dept,  int primaryPay) {
		super(name,dept);
		setType("비정규직");
		this.primaryPay = primaryPay;
	}
	public void getPay(int primaryPay) {
		this.primaryPay = primaryPay;
	
	}


	@Override
	public int getPay() {
		return primaryPay;
	}
	
	
	@Override
	public String getInfo() {
		return super.getInfo() + primaryPay;
		
	}
	
}
