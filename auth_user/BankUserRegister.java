package auth_user;

import java.util.Scanner;

public class BankUserRegister extends BankUser {

    public BankUserRegister(String userName, 
                            String password, 
                            String firstName, 
                            String lastName, 
                            String address, 
                            String city, 
                            String state, 
                            String zipCode, 
                            String phoneNumber, 
                            String email, int id) {
        super(id, userName, password, firstName, lastName, address, city, state, zipCode, phoneNumber, email);
        setId();
    }

    private void setId() {
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        super.setId(id);
        System.out.print("ID number: " + id);
    }

    Scanner input = new Scanner(System.in);

    public String getUserName() {
        System.out.print("Enter username: ");
        String userName = input.nextLine();
        return userName;
    }

    public String getPassword() {
        System.out.print("Enter password: ");
        String password = input.nextLine();
        return password;
    }
}
