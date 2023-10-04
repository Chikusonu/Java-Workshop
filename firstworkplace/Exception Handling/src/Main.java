class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class OverLimitException extends Exception {
    public OverLimitException(String message) {
        super(message);
    }
}

class Account {
    private double balance;

    public Account(double b) {
        balance = b;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    public void withdraw(double amount) throws OverLimitException, InsufficientBalanceException {
        if (amount > 15000) {
            throw new OverLimitException("Over limit withdrawal");
        } else if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: Rs. " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new Account(20000);
        try {
            account.deposit(5000);
            account.withdraw(10000);
            account.withdraw(17000); // Throws OverLimitException
            account.withdraw(1000);  // Throws InsufficientBalanceException
        } catch (OverLimitException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Current balance: Rs. " + account.getBalance());
    }
}
