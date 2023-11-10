package transactions;

public interface Transaction {

    double checkBalance();
    void deposit(double amount);
    void withdraw(double amount);
    
}

