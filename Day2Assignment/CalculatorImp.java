package Day2Assignment;

public class CalculatorImp implements Calculator {
	 
	public int add(int a,int b) {
		return a+b;
		
	}
	 @Override
	    public int sub(int a, int b) {
	        return a - b;
	 }
	 @Override
	 public int mul(int a,int b) {
		 return a*b;
	 }
	 public int div(int a,int b) {
		 return a/b;
	 }
	
	
	 

}
