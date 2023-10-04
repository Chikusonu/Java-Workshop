import java.util.Scanner;

class AccountHolder1 {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public AccountHolder1(int accountNumber, String accountHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }

    // Getter and setter methods (optional, but useful)
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Amount deposited. New balance: " + accountBalance);
    }

    public void withdraw(double amount) {
        if (amount > accountBalance) {
            System.out.println("Insufficient balance. Withdrawal failed.");
        } else {
            accountBalance -= amount;
            System.out.println("Amount withdrawn. New balance: " + accountBalance);
        }
    }
}

public class  AccountHolder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountHolder1[] accountHolders = new AccountHolder1[5];

        int choice;
        int count = 0;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add record for account holder");
            System.out.println("2. Display details of all account holders");
            System.out.println("3. Deposit an amount into a particular account");
            System.out.println("4. Withdraw an amount from a particular account");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (count < accountHolders.length) {
                        System.out.print("Enter account number: ");
                        int accNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        System.out.print("Enter account holder name: ");
                        String accHolderName = scanner.nextLine();
                        System.out.print("Enter account balance: ");
                        double accBalance = scanner.nextDouble();
                        accountHolders[count] = new AccountHolder1(accNumber, accHolderName, accBalance);
                        count++;
                        System.out.println("Account holder record added successfully.");
                    } else {
                        System.out.println("Maximum limit of account holders reached.");
                    }
                    break;
                case 2:
                    System.out.println("\nAccount holders details:");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Account Number: " + accountHolders[i].getAccountNumber());
                        System.out.println("Account Holder Name: " + accountHolders[i].getAccountHolderName());
                        System.out.println("Account Balance: " + accountHolders[i].getAccountBalance());
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter account number for deposit: ");
                    int depositAccNumber = scanner.nextInt();
                    int indexDeposit = -1;
                    for (int i = 0; i < count; i++) {
                        if (accountHolders[i].getAccountNumber() == depositAccNumber) {
                            indexDeposit = i;
                            break;
                        }
                    }
                    if (indexDeposit != -1) {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        accountHolders[indexDeposit].deposit(depositAmount);
                    } else {
                        System.out.println("Account number not found. Deposit failed.");
                    }
                    break;
                case 4:
                    System.out.print("Enter account number for withdrawal: ");
                    int withdrawAccNumber = scanner.nextInt();
                    int indexWithdraw = -1;
                    for (int i = 0; i < count; i++) {
                        if (accountHolders[i].getAccountNumber() == withdrawAccNumber) {
                            indexWithdraw = i;
                            break;
                        }
                    }
                    if (indexWithdraw != -1) {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        accountHolders[indexWithdraw].withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account number not found. Withdrawal failed.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 5);

        scanner.close();
    }
}
