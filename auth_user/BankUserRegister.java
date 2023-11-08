package auth_user;

import decor.Decorator;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class BankUserRegister extends BankUser {
    
    public BankUserRegister(int id,
                            String userName, 
                            String password, 
                            String firstName, 
                            String lastName, 
                            String address, 
                            String city, 
                            String state, 
                            String zipCode, 
                            String phoneNumber, 
                            String email) {
        super();
    }

    public static void main(String[] args) throws IOException{
        new Decorator();
        BankUser bankUser = new BankUser();
        Scanner input = new Scanner(System.in);
        FileWriter writer = new FileWriter("customer_data.txt");

        System.out.println("Id Number: " + bankUser.getId());
        writer.write("Customer ID: " + bankUser.getId() + "\n");

        System.out.print("Enter user name: ");
        String userName = input.nextLine();
        writer.write("User Name: " + userName + "\n");

        //Tech debt:  Need to enable password masking.
        System.out.print("Enter password: ");
        String password = input.nextLine();
        writer.write("User password: " + password + "\n");
        
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        writer.write("Customer first name: " + firstName + "\n");

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();
        writer.write("Customer last name: " + lastName + "\n");

        System.out.print("Enter address: ");
        String address = input.nextLine();
        writer.write("Customer address: " + address + "\n");

        System.out.print("Enter city: ");
        String city = input.nextLine();
        writer.write("Customer city: " + city + "\n");

        System.out.print("Enter state: ");
        String state = input.nextLine();
        writer.write("Customer state: " + state + "\n");

        System.out.print("Enter zip code: ");
        String zipCode = input.nextLine();
        writer.write("Customer zip code: " + zipCode + "\n");

        System.out.print("Enter phone number: ");
        String phoneNumber = input.nextLine();
        writer.write("Customer phone number: " + phoneNumber + "\n");

        System.out.print("Enter email: ");
        String email = input.nextLine();
        writer.write("Customer email: " + email + "\n");

        System.out.println("Customer data saved to file.");

        input.close();
        writer.close();
    }
}
