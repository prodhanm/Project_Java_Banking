package auth_user;

public class UserAuth extends BankUserRegister{
    
    public UserAuth(int id,
                    String userName, 
                    String password, 
                    String firstName, 
                    String lastName, 
                    String address, 
                    String city, 
                    String state, 
                    String zipCode, 
                    String phoneNumber, 
                    String email) {
        super(id, userName, password, firstName, lastName, address, city, state, zipCode, phoneNumber, email);
    }

    public boolean authenticate(String userName, String password) {
        if (userName.equals(String.valueOf(getId())) && password.equals(getPassword())) {
            return true;
        }
        return false;
    }
}