package banker;

import decor.Decorator;

public class BankerInfo {
    public static void main(String[] args) {
        BankAccountNumber accountNumber = new BankAccountNumber();
        //BankUser user = new BankUser(1, "John", "123456")
        BankCustomerInfo customer = new BankCustomerInfo(1, 
                                                         "John",
                                                         " John Doe",
                                                         "32-79 30th St.", 
                                                         "Astoria", 
                                                         "NY", 
                                                         "11106", 
                                                         "718-567-8309", 
                                                         email, 
                                                         accountNumber.getBankAccountNumber());
        // Similar to the use of a decorator in python. It works the same way in Java if used
        // correctly. The decorator class is in the decor package.  The decorator class is
        // instantiated below.
        new Decorator();
        System.out.println("Account number: " + accountNumber.getBankAccountNumber());
        System.out.println("User ID: " + customer.getId());
        System.out.println("User name: " + customer.getUserName()); 
        System.out.println("User password: " + customer.getPassword()); 
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer address: " + customer.getAddress());
        System.out.println("Customer city: " + customer.getCity());
        System.out.println("Customer state: " + customer.getState());
        System.out.println("Customer zip code: " + customer.getZipCode());
        System.out.println("Customer phone number: " + customer.getPhoneNumber());
        System.out.println("Customer email: " + customer.getEmail());

    }
}
    
