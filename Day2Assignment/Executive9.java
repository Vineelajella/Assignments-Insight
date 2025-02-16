package Day2Assignment;

public class Executive9  extends Manager9{

	public Executive9(String name, float salary, String dept) {
		super(name, salary, dept);
		
	}
	 @Override
	    public String toString() {
	        return "Executive " + super.toString(); // Calling Manager's toString
	    }

	
	
	

}
