class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

class CreditAccount extends BankAccount {

    CreditAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
}

public class variant4 {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("SA123", 1000);
        CreditAccount c = new CreditAccount("CA456", 500);

        s.deposit(200);
        s.withdraw(100);

        c.deposit(300);
        c.withdraw(150);
    }
}
