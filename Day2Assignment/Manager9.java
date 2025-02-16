package Day2Assignment;

public class Manager9 extends Employee9 {
	
	
	String dept;

	public Manager9(String name, float salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Manager9 [dept=" + dept + "]";
	}
	

}
