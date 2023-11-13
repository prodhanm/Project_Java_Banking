package menu;

import decor.Decorator;
import java.util.Scanner;

import bank_trans.Balance;
import bank_trans.BankTransaction;

import java.io.FileWriter;

public class TransactionMenu {
        public static void main(String[] args) {
            try{
                Scanner transScanner = new Scanner(System.in);
                boolean exit = false;

                while(!exit) {
                    new Decorator();
                    System.out.println("Welcome to the Transaction Menu!");
                    System.out.println("1. Set Initial Balance");
                    System.out.println("2. Deposit");
                    System.out.println("3. Withdraw");
                    System.out.println("4. Previous Transaction");
                    System.out.println("5. Exit");

                    int choice = transScanner.nextInt();
                    transScanner.nextLine();
                    FileWriter transWriter = new FileWriter("customer_data.txt", true);
                    BankTransaction transaction = new BankTransaction(0);

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
                            new Balance();
                            break;
                        
                        case 3:
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawal = transScanner.nextDouble();
                            transaction.withdraw(withdrawal);
                            System.out.println("Withdrawal amount: " + withdrawal);
                            System.out.println("Current balance: " + transaction.checkBalance());
                            transWriter.write("Withdrawal amount: " + withdrawal + "\n");
                            transWriter.write("Current balance: " + transaction.checkBalance() + "\n");
                            new Balance();
                            break;

                        case 4:
                            transaction.getPreviousTransaction(transaction.prevTransaction);
                            break;

                        case 5:
                            exit = true;
                            break;
                        
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    transWriter.close();
                }
                transScanner.close();
            } catch (Exception e) {
                System.out.println("Done.");
            }
        }
    } 
