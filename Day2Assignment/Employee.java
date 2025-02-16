package Day2Assignment;

public abstract class Employee {
	int empid;
	String empname;
	 public void input(int id, String name) {
	        this.empid = id;
	        this.empname = name;
	    }
	
	 public void output() {
	        System.out.println("Employee ID: " + empid);
	        System.out.println("Employee Name: " + empname);
	    }
	 public abstract void roles_Responsibilities();
}
