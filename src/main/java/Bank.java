import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    // Constructor
    public Bank() {
        accounts = new ArrayList<>();
    }

    // Create a new account
    public void createAccount(int accountNumber, String accountHolderName, double initialDeposit) {

        // Check whether account number already exists
        if (findAccount(accountNumber) != null) {
            System.out.println("Account number already exists.");
            return;
        }

        if (initialDeposit < 0) {
            System.out.println("Initial deposit cannot be negative.");
            return;
        }

        Account account = new Account(
                accountNumber,
                accountHolderName,
                initialDeposit
        );

        accounts.add(account);

        System.out.println("Account created successfully.");
    }

    // Find account using account number
    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {

            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }

        return null;
    }

    // View a particular account
    public void viewAccount(int accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.displayAccount();
        } else {
            System.out.println("Account not found.");
        }
    }

    // Deposit money
    public void deposit(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Withdraw money
    public void withdraw(int accountNumber, double amount) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Check balance
    public void checkBalance(int accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            System.out.println("Account Number : " + account.getAccountNumber());
            System.out.println("Balance        : " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        System.out.println("\n========== ALL ACCOUNTS ==========");

        for (Account account : accounts) {
            account.displayAccount();
        }
    }

    // Delete account
    public void deleteAccount(int accountNumber) {

        Account account = findAccount(accountNumber);

        if (account != null) {
            accounts.remove(account);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }
}