
package Day4Ass;

import java.util.Objects;

public class Student {
	String fname;
	String lname;
	private Address address;
	int age;
	
	public Student(String fname, String lname, Address address, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.age = age;
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



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + ", address=" + address + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, fname, lname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(fname, other.fname)
				&& Objects.equals(lname, other.lname);
	}
	
	

}
