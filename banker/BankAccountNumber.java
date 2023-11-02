package banker;
import java.security.SecureRandom;

public class BankAccountNumber {
    private String bankAccountNumber;

    public BankAccountNumber() {
        this.bankAccountNumber = generateBankAccountNumber();
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    private String generateBankAccountNumber() {
        StringBuilder bankAccountNumber = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();

        for (int i = 0; i < 26; i++) {
            int digit = secureRandom.nextInt(10);
            bankAccountNumber.append(digit);
        }
        return bankAccountNumber.toString();
    }
}