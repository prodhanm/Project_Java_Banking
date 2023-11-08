package auth_user;

public class UserAuth extends BankUserRegister{
    
    public UserAuth(int id,
                    String userName, 
                    String password 
                    ) {
        super();
    }

    public boolean authenticate(String userName, String password) {
        if (userName.equals(String.valueOf(getId())) && password.equals(getPassword())) {
            return true;
        }
        return false;
    }
}