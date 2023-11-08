package banker;

import java.io.FileWriter;
import java.io.IOException;
//import auth_user.BankUser;
import decor.Decorator;

public class BankerInfo {
    public static void main(String[] args) {
        BankAccountNumber accountNumber = new BankAccountNumber();  
        /* Similar to the use of a decorator in python. It works the same way in Java if used
           correctly. The decorator class is in the decor package.  The decorator class is
           instantiated below.
        */
        new Decorator();
        try {
            FileWriter accWriter = new FileWriter("customer_data.txt", true);
            //writer.write("user name: mufassa\n");
            accWriter.write("account number: " + accountNumber.getBankAccountNumber() + "\n");
            accWriter.close();
            System.out.println("Account number saved to file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

}


    
