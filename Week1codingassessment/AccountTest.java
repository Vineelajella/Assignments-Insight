package Assessment1coding;

public class AccountTest {

    public static void main(String[] args) {
        AccountService service = new AccountService();
        
        try {
            Account acc1 = new Account(1, "Vineela", Account.AccountType.Savings, 1500);
            Account acc2 = new Account(2, "Sowji", Account.AccountType.Current, 6000);
            Account acc3 = new Account(3, "poornima", Account.AccountType.Savings, 2000);
            Account acc4 = new Account(4, "Roopa", Account.AccountType.Current, 7000);
            Account acc5 = new Account(5, "Hasrath", Account.AccountType.Savings, 1200);
            
            service.addAccount(acc1);
            service.addAccount(acc2);
            service.addAccount(acc3);
            service.addAccount(acc4);
            service.addAccount(acc5);
            System.out.println("initial Bal is:"+ service.getBalance(1));
            System.out.println("Deposit 500 to account 1");
            service.deposit(1, 500);
            System.out.println("New Balance for account 1: " + service.getBalance(1));
            System.out.println("Initial bal in current account : "+service.getBalance(2));
            System.out.println("Withdraw 1000 from account 2");
            service.withdraw(2, 1000);
            System.out.println("New Balance for account 2: " + service.getBalance(2));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
