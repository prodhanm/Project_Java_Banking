package transactions;

public class BankTransaction implements Transaction {

    private double balance;

    public BankTransaction(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}