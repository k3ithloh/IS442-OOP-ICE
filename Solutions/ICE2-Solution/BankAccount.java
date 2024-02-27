// This class is for Q9
public class BankAccount {
    private double balance;
    //c
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //b
    public BankAccount() {
        this(500);
    }

    //d
    public double getBalance() {
        return this.balance;
    }

    //e
    public void deposit(double amount) {
        this.balance += amount;
    }

    //f
    public boolean withdraw(double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    //g
    public boolean transfer(double amount, BankAccount otherAccount) {
        if (this.withdraw(amount)) {
            otherAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
