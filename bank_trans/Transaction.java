package bank_trans;

public interface Transaction {

    double checkBalance();
    void deposit(double amount);
    void withdraw(double amount);
    double getPreviousTransaction(double prevTransaction);

}
