package Day2Assignment;

public class Bank {
	Double Bal;
	Double amt;
	Double sum=0.0;
	Double withmoney=0.0;
	public Bank(Double bal) {
		super();
		Bal = bal;
		
	}
	 public double deposit(Double amt) {
	        Bal += amt;
	        return Bal;
	    }
	 public double withdraw(Double amt) {
	        if (Bal >= amt) {
	            Bal -= amt;
	            return Bal;
	        } else {
	            System.out.println("Insufficient funds.");
	            return 0.0;
	        }
	}

}
