package transactions;

import java.util.Scanner;

public class Checking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankTransaction transaction = new BankTransaction(0);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();
        transaction.deposit(balance);
        new Balance().printBalance();

        System.out.print("Enter deposit amount: ");
        double deposit = scanner.nextDouble();
        transaction.deposit(deposit);
        new Balance().printBalance();

        System.out.print("Enter withdrawal amount: ");
        double withdrawal = scanner.nextDouble();
        transaction.withdraw(withdrawal);
        new Balance().printBalance();

        scanner.close();

    }

}