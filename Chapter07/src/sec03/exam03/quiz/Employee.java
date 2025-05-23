package sec03.exam03.quiz;

public abstract class Employee {
	private String type;
	private String name;
	private String dept;
	
	
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	public abstract int getPay();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getInfo() {
		return type + ", " +  name + ", " + dept + ", ";
	}
}
