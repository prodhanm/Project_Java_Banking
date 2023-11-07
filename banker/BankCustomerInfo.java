package banker;

import auth_user.BankUser;

public class BankCustomerInfo extends BankUser{
    
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;
    private String bankAccountNumber;
    
    public BankCustomerInfo(int id, 
                            String userName,  
                            String name, 
                            String address, 
                            String city, 
                            String state, 
                            String zipCode,
                            String phoneNumber, 
                            String email, 
                            String bankAccountNumber){
        super(id, userName, bankAccountNumber);
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }   

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){ 
        this.city = city;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
   }

    public String getZipCode(){
        return zipCode;
    }   

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }   
    

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getBankAccountNumber(){
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber){
        this.bankAccountNumber = bankAccountNumber;
    }

}
    