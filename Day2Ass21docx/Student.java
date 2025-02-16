package Day2Ass21docx;

public class Student {
	int rno;
	String fname;
	
	public Student(int rno, String fname) {
		super();
		this.rno = rno;
		this.fname = fname;
	}
	

	public int getRno() {
		return rno;
	}


	public void setRno(int rno) {
		this.rno = rno;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public void modify(int num) {
        num = num + 1;
        System.out.println("Modified primitive num: " + num);
    }
	 public void modify(String fname) {
	        fname = "Vineela";
	        System.out.println("Modified String fname: " + fname);
	    }
	 public void modify(Student student) {
	        student.setRno(student.getRno() + 1);
	        System.out.println("Modified Student rollNo: " + student.getRno());
	        
	    }


	@Override
	public String toString() {
		return "Student [rno=" + rno + ", fname=" + fname + "]";
	}


	
	 
}
