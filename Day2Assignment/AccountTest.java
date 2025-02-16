package Day2Assignment;

public class AccountTest {

    public static void main(String[] args) {
        Account a3 = new Account(1, 1900, "Savings");
        Account a1 = new Account(2, 1500, "Savings");
        Account a2 = new Account(3, 2000, "Savings");
        Account[] a= {a1,a2,a3};
        for(Account ac:a) {
        System.out.println("Before any operation:");
        System.out.println(ac);

        ac.deposit();
        ac.withdraw();

        System.out.println("\nAfter operations:");
        System.out.println(ac);
    }
    }
}
