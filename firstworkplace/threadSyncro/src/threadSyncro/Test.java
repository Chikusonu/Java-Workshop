class Account {
    private int balance;

    public Account() {
        balance = 10000;
    }

    public void deposit(int amount) {
        System.out.println("Balance Before Deposit: " + balance);
        balance = balance + amount;
        System.out.println("Balance After Deposit: " + balance);
    }

    public void withdraw(int amount) {
        System.out.println("Balance Before Withdraw: " + balance);
        balance = balance - amount;
        System.out.println("Balance After Withdraw: " + balance);
    }
}

class AccountUser extends Thread {
    String name, tot;
    Account account;
    int amount;

    public AccountUser(String name, Account account, String tot, int amt) {
        this.name = name;
        this.account = account;
        this.tot = tot;
        this.amount = amt;
    }

    public void run() {
        if (tot.equals("deposit")) {
            account.deposit(amount);
        } else if (tot.equals("withdraw")) {
            account.withdraw(amount);
        }
    }
}

public class Test {

    public static void main(String[] args) {
        Account account = new Account();

        AccountUser user1 = new AccountUser("User1", account, "deposit", 500);
        AccountUser user2 = new AccountUser("User2", account, "withdraw", 300);

        user1.start();
        user2.start();
    }
}
