package Day2Assignment;

public class EmployeeTestMain {

	public static void main(String[] args) {
		Employee9 e=new Employee9("Vin",5000);
		System.out.println(e.toString());
		
		Manager9 m=new Manager9("Vinny",6000,"IT");
		System.out.println(m.toString());
		
		Executive9 ex=new Executive9("Vinnu",10000,"Finace");
		System.out.println(ex.toString());

	}

}
