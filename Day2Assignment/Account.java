package Day2Assignment;

public class Account {
    public int accno;
    public int accBal;
    public String accType;

    public Account(int accno, int accBal, String accType) {
        super();
        this.accno = accno;
        this.accBal = accBal;
        this.accType = accType;
    }

    public void withdraw() {
        if (accBal >= 1000) {
            accBal -= 1000;
            System.out.println("Withdraw success");
            System.out.println(accBal);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void deposit() {
        accBal += 1000;
        System.out.println("Deposit success");
        System.out.println(accBal);
    }
    

    @Override
    public String toString() {
        return "Account Details:\n" +
                "Account No: " + accno + "\n" +
                "Account Type: " + accType + "\n" +
                "Account Balance: " + accBal;
    }
}
