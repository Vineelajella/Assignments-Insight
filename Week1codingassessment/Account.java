package Assessment1coding;

public class Account {
	private int accno;
	private String custname;
	 private AccountType type;
	private float bal;
	public enum AccountType{
		Savings,Current
	}
	
	public Account(int accno, String custname, AccountType type, float bal) {
		super();
		this.accno = accno;
		this.custname = custname;
		this.type = type;
		this.bal = bal;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public AccountType getType() {
		return type;
	}
	public void setType(AccountType type) {
		this.type = type;
	}
	public float getBal() {
		return bal;
	}
	 public void setBalance(Float bal) throws LowBalanceException, InvalidAmountException {
	        if (bal < 0) {
	            throw new InvalidAmountException("Balance cannot be negative");
	        }
	        if (this.type == AccountType.Savings && bal < 1000) {
	            throw new LowBalanceException("Savings account must have a minimum balance of Rs. 1000");
	        }
	        if (this.type == AccountType.Current && bal < 5000) {
	            throw new LowBalanceException("Current account must have a minimum balance of Rs. 5000");
	        }
	        this.bal = bal;
	    }
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", custname=" + custname + ", type=" + type + ", bal=" + bal + "]";
	}
	
	
	
	

}
