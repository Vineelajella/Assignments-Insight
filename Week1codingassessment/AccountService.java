package Assessment1coding;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

public class AccountService {
    List<Account> alist = new ArrayList<>();

    public boolean isValidAccount(int accNumber) throws AccountNotFoundException {
        for (Account acc : alist) {
            if (acc.getAccno() == accNumber) {
                return true;
            }
        }
        throw new AccountNotFoundException("Account with number " + accNumber + " not found.");
    }

    public void deposit(int accno, float amt) throws InvalidAmountException, AccountNotFoundException {
        if (amt < 0) {
            throw new InvalidAmountException("Deposit cannot be negative");
        }
        
        Account acc = getAccount(accno);
        try {
            acc.setBalance(acc.getBal() + amt);
        } catch (LowBalanceException | InvalidAmountException e) {
            System.out.println("Error in deposit: " + e.getMessage());
        }
    }

    public void withdraw(int accno, float amt) throws InsufficientFundsException, InvalidAmountException, AccountNotFoundException, LowBalanceException {
        if (amt < 500) {
            throw new InvalidAmountException("Minimum withdrawal amount is Rs. 500.");
        }
        
        Account acc = getAccount(accno);
        if (acc.getType() == Account.AccountType.Savings && acc.getBal() - amt < 1000) {
            throw new InsufficientFundsException("Insufficient funds for Savings account.");
        }
        if (acc.getType() == Account.AccountType.Current && acc.getBal() - amt < 5000) {
            throw new InsufficientFundsException("Insufficient funds for Current account.");
        }
        acc.setBalance(acc.getBal() - amt);
    }

    private Account getAccount(int accno) throws AccountNotFoundException {
        for (Account acc : alist) {
            if (acc.getAccno() == accno) {
                return acc;
            }
        }
        throw new AccountNotFoundException("Account with number " + accno + " not found.");
    }

    public void addAccount(Account account) {
        alist.add(account);
    }

    public float getBalance(int accno) throws AccountNotFoundException {
        Account acc = getAccount(accno);
        return acc.getBal();
    }
}
