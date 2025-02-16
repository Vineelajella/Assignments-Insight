package Day2Assignment;

public class StudentTest {

	public static void main(String[] args) {

		Student s1=new Student(1,"Hasarth",20,30,50);
		Student s2=new Student(2,"Vineela",80,40,90);
		Student s3=new Student(3,"Poojitha",40,70,80);
		Student[] sd= {s1,s2,s3};
		for(Student sd1:sd) {
			sd1.getMark1();
			sd1.getMark2();
			sd1.getMark3();
			sd1.dispStudDetails();
		}
		
	}

}
