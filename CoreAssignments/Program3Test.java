package CoreAssignments;

public class Program3Test {
	public static void main(String[] args) {
	Program3 p=new Program3();
	System.out.println(p.validatepan("ALD3245E"));
	
	if(p.validatepan("ALD3245E")) {
		System.out.println("Valid");
	}
	else {
		System.out.println("Invalid");
	}
	}
	
}
