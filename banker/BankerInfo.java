package banker;

public class BankerInfo {
    public static void main(String[] args) {
        // create an instance of the BankAccountNumber class
        BankAccountNumber accountNumber = new BankAccountNumber();
        BankUser user = new BankUser(1, "John", "123456");
        String number = accountNumber.getBankAccountNumber();
        System.out.println("Account number: " + number);
        System.out.println("User ID: " + user.getId());
        System.out.println("User name: " + user.getUserName()); 
        System.out.println("User password: " + user.getPassword()); 
    }
}
