package Day2Ass21docx;

public class ParamPassing {

	public static void main(String[] args) {
		
		 Student s = new Student(101, "Vinny");
		 s.modify(4);
		 s.modify("Vineela");
		 System.out.println(s);
		 s.modify(s);
		 System.out.println(s);
	}

}

