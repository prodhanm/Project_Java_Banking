package auth_user;

import banker.BankUser;
import decor.Decorator;

public class UserAuth extends BankUser {
    
    public UserAuth(int id, String userName, String password) {
        super(id, userName, password);
    }
    public static void main(String[] args) {
            //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            Decorator decorator = new Decorator();
            BankUser bankUser = new BankUser(1, "John", "123456");
            System.out.println("User Name: " + bankUser.getUserName());
            System.out.println("Password: " + bankUser.getPassword());

            String userName = bankUser.getUserName();
            String password = bankUser.getPassword();
            
            if (bankUser.getUserName().equals(userName) && bankUser.getPassword().equals(password)) {
                System.out.println("User authenticated successfully.");
            } else {
                System.out.println("Invalid username or password.");
            }    
        }
    }

