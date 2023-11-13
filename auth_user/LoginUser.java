package auth_user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoginUser {

    public static boolean authenticateUser(String username, String password) {
        BankUser bankUser = new BankUser();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("customer_data.txt"));
            String line = reader.readLine();
            while (line != null) {
                    String[] pair = line.split(":");
                    if (pair[0].equals("User Name")) {
                        bankUser.setUserName(pair[1]);
                    }
                    if (pair[0].equals("User password")) {
                        bankUser.setPassword(pair[1]);
                    }
                    line = reader.readLine();
                }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        UserAuth userAuth = new UserAuth(bankUser);

        if (userAuth.authenticate(username, password)) {
            return true; 
        };
        return false;
    }
}


