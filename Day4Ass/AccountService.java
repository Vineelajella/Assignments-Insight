package Day4Ass;

import java.util.ArrayList;

public class AccountService {
    ArrayList<Account> acc = new ArrayList<>();

    
    public void addaccount(Account accd) {
        acc.add(accd);
    }

    
    public void listAccounts() {
        acc.forEach(x -> System.out.println(x));
    }

   
    public void updateName(int id, String newName) {
        for (Account account : acc) {
            if (account.id.equals(id)) {
                account.setName(newName);
                System.out.println("Account updated (name): " + account);
                return;
            }
        }
        System.out.println("Account with ID " + id + " not found.");
    }

    // Update balance by id
    public void updateBalance(int id, Double newBalance) {
        for (Account account : acc) {
            if (account.id.equals(id)) {
                account.setBalance(newBalance);
                System.out.println("Account updated (balance): " + account);
                return;
            }
        }
        System.out.println("Account with ID " + id + " not found.");
    }

    
    public void delAcc(int id) {
        Account accountToRemove = null;
        for (Account account : acc) {
            if (account.id.equals(id)) {
                accountToRemove = account;
                break;
            }
        }
        if (accountToRemove != null) {
            acc.remove(accountToRemove);
            System.out.println("Account with ID " + id + " has been deleted.");
        } else {
            System.out.println("Account with ID " + id + " not found.");
        }
    }
}
