/**
 * 
 */
package Day4Ass;

/**
 * 
 */
public class Account {
	
		Integer id;
		
		String name;
		Double balance;
		public Account(Integer id, String name, Double balance) {
			super();
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		

		public Double getBalance() {
			return balance;
		}

		public void setBalance(Double balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
		}
		

	}


