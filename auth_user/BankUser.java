package auth_user;

import java.security.SecureRandom;

public class BankUser {
    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;

    public BankUser(){
       /*  this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;*/
    }

    public String getId(){
        StringBuilder idNumber = new StringBuilder();
        SecureRandom secureRandomId = new SecureRandom();
        for (int i = 0; i < 26; i++) {
            int id = secureRandomId.nextInt(10);
            idNumber.append(id);
        }
        return idNumber.toString();
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

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
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

    public String getPhoneNumber(){
        return phoneNumber;
    }   

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }   

    public String getEmail(){
        return email;
    }   

    public void setEmail(String email){
        this.email = email;
    }   
}