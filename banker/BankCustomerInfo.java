package banker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import decor.Decorator;

public class BankCustomerInfo {
    public static void main(String[] args) {
        new Decorator();
        try (BufferedReader br = new BufferedReader(new FileReader("customer_data.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}

    