package Exceptionsdemo;

public class AvgCalculator {
	public double calAverage(int n) {
		int sum=0;
		try {
		if(n<=0) {
			throw new IllegalArgumentException("n is not a natural num");
		}
		else {
			
		
		 sum=n*(n+1)/2;
		}
		return sum/2;
		}
		catch( IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		
		return sum;		
	}
}


