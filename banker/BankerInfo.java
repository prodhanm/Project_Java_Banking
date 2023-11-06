package banker;

public class BankerInfo {
    public static void main(String[] args) {
        // create an instance of the BankAccountNumber class
        BankAccountNumber accountNumber = new BankAccountNumber();
        BankUser user = new BankUser(1, "John", "123456");
        String email = "john.doe@gmail.com";
        BankCustomerInfo customer = new BankCustomerInfo(1, 
                                                         "John",
                                                         " John Doe",
                                                         "123 Main St", 
                                                         "Anytown", 
                                                         "Anystate", 
                                                         "12345", 
                                                         "123-456-7890", 
                                                         email, 
                                                         accountNumber.getBankAccountNumber());

        System.out.println("Account number: " + accountNumber.getBankAccountNumber());
        System.out.println("User ID: " + customer.getId());
        System.out.println("User name: " + user.getUserName()); 
        System.out.println("User password: " + user.getPassword()); 
        System.out.println("Customer name: " + customer.getName());
        System.out.println("Customer address: " + customer.getAddress());
        System.out.println("Customer city: " + customer.getCity());
        System.out.println("Customer state: " + customer.getState());
        System.out.println("Customer zip code: " + customer.getZipCode());
        System.out.println("Customer phone number: " + customer.getPhoneNumber());
        System.out.println("Customer email: " + customer.getEmail());
        System.out.println("Customer bank account number: " + customer.getBankAccountNumber());
    }
}
