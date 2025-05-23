package sec03.exam03.quiz;

public class FormalEmployee extends Employee{
	
	private int salary;
	private int empNo;
	
	public FormalEmployee(String name, String dept, int empNo, int salary) {
		super(name,dept);
		setType("정규직");
		this.empNo = empNo;
		this.salary = salary;
	}
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	@Override
	public int getPay() {
		return salary/12;		
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + empNo + ", " + salary;
	}
	
	
	
	
	
}
