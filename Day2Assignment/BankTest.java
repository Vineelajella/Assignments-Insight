package Day2Assignment;

public class BankTest {

	public static void main(String[] args) {
		Bank b=new Bank(1000.00);
		
		
		System.out.println(b.deposit(1500.6));
		System.out.println(b.withdraw(1200.3));

	}

}
