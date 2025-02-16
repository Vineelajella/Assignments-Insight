package Day4Ass;

import java.util.Objects;

public  class Employee  implements Comparable <Employee>{
	
	private int empid;
	private String fname;
	private String lname;
	
	public Employee(int empid, String fname, String lname) {
		
		this.empid = empid;
		this.fname = fname;
		this.lname = lname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", fname=" + fname + ", lname=" + lname + "]";
	}
	
	public int comapreTo(Employee o) {
		return Integer.compare(this.empid, o.empid);
		
	}
	
	 public int compare(Employee e1, Employee e2) {
	        return e1.getFname().compareTo(e2.getFname()); 
	    }
	 
	@Override
	public int hashCode() {
		return Objects.hash(empid, fname, lname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empid == other.empid && Objects.equals(fname, other.fname) && Objects.equals(lname, other.lname);
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
}
