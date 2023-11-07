package auth_user;

public class UserAuth {
    private BankUser bankUser;

    public UserAuth(BankUser bankUser) {
        this.bankUser = bankUser;
    }

    public boolean authenticate(int id, String userName, String password) {
        if (bankUser.getId() == id) {
            if (bankUser.getUserName().equals(userName) && bankUser.getPassword().equals(password)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
   

    

/*  
 *  BankUser bankUser = new BankUser(1, "jdoe", "password");
            System.out.println("User Name: " + bankUser.getUserName());
            System.out.println("Password: " + bankUser.getPassword());

            String userName = bankUser.getUserName();
            String password = bankUser.getPassword();
*/