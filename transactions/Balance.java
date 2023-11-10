package transactions;

public class Balance {

    public Balance() {

    }

    BankTransaction transaction = new BankTransaction(0);

    void printBalance() {
        System.out.println("Your current balance is: " + transaction.checkBalance());
    }

}