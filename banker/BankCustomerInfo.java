package banker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import decor.Decorator;

public class BankCustomerInfo {
    public static void main(String[] args) {
        new Decorator();
        String filePath = "customer_data.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}

    