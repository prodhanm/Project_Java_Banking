package banker;

public class BankUser extends BankAccountNumber{
    private int id;
    private String userName;
    private String password;

    public BankUser(int id, String userName, String password){
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        int passwordLength = password.length();
        String hiddenPassword = "";
        for(int i = 0; i < passwordLength; i++){
            hiddenPassword += "*";
        }
        return hiddenPassword;
    }

    public void setPassword(String password){
        this.password = password;
    }
    
}