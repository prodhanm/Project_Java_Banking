package banker;

public class BankerInfo {
    public static void main(String[] args) {
        // create an instance of the BankAccountNumber class
        BankAccountNumber accountNumber = new BankAccountNumber();

        // call the methods of the BankAccountNumber class using the instance
        //accountNumber.setAccountNumber("1234567890");
        String number = accountNumber.getBankAccountNumber();
        System.out.println("Account number: " + number);
    }
}
