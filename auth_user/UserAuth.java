package auth_user;

public class UserAuth {
    
    private BankUser bankUser;

    public UserAuth(BankUser bankUser) {
        super();
        this.bankUser = bankUser;
    }

    public boolean authenticate(String userName, String password) {
        if (userName.equals(String.valueOf(bankUser.getId())) && password.equals(bankUser.getPassword())) {
            return true;
        }
        return false;
    }
}