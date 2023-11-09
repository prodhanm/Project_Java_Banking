package menu;

import auth_user.BankUserRegister;
import auth_user.LoginUser;
import java.util.Scanner;

public class BankUserMenu {
    //private static final String LoginUser = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Bank User Menu!");
            System.out.println("1. Register a new user");
            System.out.println("2. Login as an existing user");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    new BankUserRegister();
                    break;
                case 2:
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter Password: ");
                    String password = scanner.nextLine();
                    LoginUser.authenticateUser(username, password);
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
    }
}
            