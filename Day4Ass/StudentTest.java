package Day4Ass;

import java.util.HashSet;

public class StudentTest {

	public static void main(String[] args) {
		 HashSet<Student> sset = new HashSet<>();
		 
		 Address a1=new Address("123 Main St", "Cityville", "State", "12345");
		 Address a2 = new Address("456 Oak St", "Townsville", "State", "67890");
		 
		 Student s1 = new Student("Vinny", "Jela", a1, 20);
	        Student s2 = new Student("Hasrath", "Gundu", a2, 21);
		 sset.add(s1);
		 sset.add(s2);
		 for(Student ss:sset) {
			 System.out.println(ss);
		 }
		 

	}

}
