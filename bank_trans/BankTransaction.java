package bank_trans;

public class BankTransaction implements Transaction {

    private double balance;
    public double prevTransaction;

    public BankTransaction(double balance) {
        this.balance = balance;
    }

    @Override
    public double checkBalance() {
        balance = balance + prevTransaction;
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount != 0) {
            balance += amount;
            prevTransaction = amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
            prevTransaction = -amount;
        }
    }

    @Override
    public double getPreviousTransaction(double prevTransaction) {
        if (prevTransaction > 0) {
            System.out.println("Deposit Amount: " + prevTransaction);
        } else if (prevTransaction < 0) {
            System.out.println("Withdrawal Amount: " + Math.abs(prevTransaction));
        } else {
            System.out.println("No transaction occurred.");
        }
        return prevTransaction;
    }



}