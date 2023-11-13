package menu;

import decor.AcctDecor;
import java.util.Scanner;
import auth_user.BankUser;
//import bank_trans.Balance;
import bank_trans.BankTransaction;
//import banker.BankAccountNumber;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TransMenu {

    public static void main(String[] args) throws IOException {

        BankTransaction transaction = new BankTransaction(0);
        BankUser transUser = new BankUser();
        Scanner transScanner = new Scanner(System.in);
        FileWriter transWriter = new FileWriter("customer_data.txt", true);
        BufferedReader transReader = new BufferedReader(new FileReader("customer_data.txt"));

        try {
            boolean exit = false;
            while (!exit) {
                new AcctDecor();
                System.out.println("Welcome " + transUser.getUserName());
                System.out.println("1. Initial Deposit");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Previous Transactions");
                System.out.println("5. Exit");

                int choice = transScanner.nextInt();
                transScanner.nextLine();

                switch(choice) {
                    case 1:
                        System.out.print("Enter initial balance: ");
                        double balance = transScanner.nextDouble();
                        transaction.deposit(balance);
                        System.out.println("Initial balance: " + transaction.checkBalance());
                        transWriter.write("Initial balance: " + transaction.checkBalance() + "\n");
                        transaction.getPreviousTransaction(transaction.checkBalance());
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double deposit = transScanner.nextDouble();
                        transaction.deposit(deposit);
                        System.out.println("Deposit amount: " + deposit);
                        System.out.println("Current balance: " + transaction.checkBalance());
                        transWriter.write("Deposit amount: " + deposit + "\n");
                        transWriter.write("Current balance: " + transaction.checkBalance() + "\n");
                        //new Balance();
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawal = transScanner.nextDouble();
                        transaction.withdraw(withdrawal);
                        System.out.println("Withdrawal amount: " + withdrawal);
                        System.out.println("Current balance: " + transaction.checkBalance());
                        transWriter.write("Withdrawal amount: " + withdrawal + "\n");
                        transWriter.write("Current balance: " + transaction.checkBalance() + "\n");
                        //new Balance();
                        break;

                    case 4:
                        System.out.println("Previous transaction: ");
                        transaction.getPreviousTransaction(transaction.prevTransaction);
                        break;

                    case 5:
                        exit = true;
                        break;
                }
            }
            transScanner.close();
            transWriter.close();
            transReader.close();
        }
            catch (Exception e) {
                System.out.println("Done.");
        }
    }

}