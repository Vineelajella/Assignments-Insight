package Day4Ass;

public class AccountTest {

    public static void main(String[] args) {
        Account a1 = new Account(1, "Vin", 200.00);
        Account a2 = new Account(2, "Sow", 400.00);
        Account a3 = new Account(3, "Poori", 600.00);

        AccountService as = new AccountService();

        as.addaccount(a1);
        as.addaccount(a2);
        as.addaccount(a3);

        System.out.println("Before name and balance update:");
        as.listAccounts();

        a1.setName("Vinny");

        System.out.println("\nAfter name update:");
        as.listAccounts();

        a1.setBalance(500.00);

        System.out.println("\nAfter balance update:");
        as.listAccounts();

        System.out.println("\nDeleting account with ID 2:");
        as.delAcc(2);

        System.out.println("\nAfter deletion:");
        as.listAccounts();
    }
}

