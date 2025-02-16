package Day4Ass;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeTestSort {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Vin","Jella");
		Employee e2=new Employee(2,"Vinny","Vem");
		Employee e3=new Employee(3,"Vinnuu","Jel");;
		
		  Set<Employee> eset = new TreeSet<>();
		  eset.add(e1);
		  eset.add(e2);
		  eset.add(e3);
		  
		  for(Employee emp:eset) {
			  System.out.println(emp);
			  
		  }
		  
	}

}
