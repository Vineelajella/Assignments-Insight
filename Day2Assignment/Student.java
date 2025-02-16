package Day2Assignment;

public class Student {
	int rno;
	String name;
	int mark1;
	int mark2;
	int mark3;
	int total;
	public Student(int rno, String name, int mark1, int mark2, int mark3) {
		super();
		this.rno = rno;
		this.name = name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int findTotal() {
		total=mark1+mark2+mark3;
		return total;
		
	}
	  public void dispStudDetails() {
		  
	        System.out.println("Student Details:");
	        System.out.println("Roll No: " + rno);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
	        System.out.println("Total Marks: " + findTotal());
	    }
	
	
	
}
