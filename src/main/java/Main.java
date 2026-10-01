import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println("      BANK MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Delete Account");
            System.out.println("8. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Create Account ---");

                    System.out.print("Enter Account Number: ");
                    int accountNumber = scanner.nextInt();

                    scanner.nextLine(); // clear buffer

                    System.out.print("Enter Account Holder Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Initial Deposit: ");
                    double initialDeposit = scanner.nextDouble();

                    bank.createAccount(
                            accountNumber,
                            name,
                            initialDeposit
                    );

                    break;

                case 2:
                    System.out.println("\n--- View Account ---");

                    System.out.print("Enter Account Number: ");
                    int viewAccountNumber = scanner.nextInt();

                    bank.viewAccount(viewAccountNumber);

                    break;

                case 3:
                    System.out.println("\n--- Deposit Money ---");

                    System.out.print("Enter Account Number: ");
                    int depositAccountNumber = scanner.nextInt();

                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();

                    bank.deposit(
                            depositAccountNumber,
                            depositAmount
                    );

                    break;

                case 4:
                    System.out.println("\n--- Withdraw Money ---");

                    System.out.print("Enter Account Number: ");
                    int withdrawAccountNumber = scanner.nextInt();

                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();

                    bank.withdraw(
                            withdrawAccountNumber,
                            withdrawAmount
                    );

                    break;

                case 5:
                    System.out.println("\n--- Check Balance ---");

                    System.out.print("Enter Account Number: ");
                    int balanceAccountNumber = scanner.nextInt();

                    bank.checkBalance(balanceAccountNumber);

                    break;

                case 6:
                    System.out.println("\n--- All Accounts ---");

                    bank.displayAllAccounts();

                    break;

                case 7:
                    System.out.println("\n--- Delete Account ---");

                    System.out.print("Enter Account Number: ");
                    int deleteAccountNumber = scanner.nextInt();

                    bank.deleteAccount(deleteAccountNumber);

                    break;

                case 8:
                    System.out.println("\nThank you for using Bank Management System.");
                    break;

                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }

        } while (choice != 8);

        scanner.close();
    }
}