package bank_trans;

import auth_user.BankUser;
import banker.BankAccountNumber;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Checking {

    public static void getCheckingAccount() {
        try {
            BankUser transUser = new BankUser();
            BankAccountNumber accUser = new BankAccountNumber();
            Scanner transScanner = new Scanner(System.in);

            System.out.print("Enter user name: ");
            transScanner.nextLine();

            BufferedReader transReader = new BufferedReader(new FileReader("customer_data.txt"));
            String transLine = transReader.readLine();
            while (transLine != null) {
                String[] tpair = transLine.split(":");
                    if (tpair[0].equals("User Name")) {
                        transUser.setUserName(tpair[1]);
                    }
                    if (tpair[0].equals("account number")) {
                        accUser.setBankAccountNumber(tpair[1]);
                    }
                    transLine = transReader.readLine(); 
                }
                transScanner.close();
                transReader.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
