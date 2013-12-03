package mynightout.entity;
// Generated 17 NOV 2013 4:36:29 PM by Hibernate Tools 3.6.0

import java.util.HashSet;
import java.util.Set;







/**
 * User generated by hbm2java
 */

public class User  implements java.io.Serializable {


     private int userId;
     private String username;
     private String password;
     private String customerName;
     private String customerLastname;
     private String telephoneNum;
     private String emailAddress;
     private Set<Reservation> reservation = 
				new HashSet<Reservation>(0);
     //βοηθητικές μεταβλητές για τα test αυτά θα σταματήσουν να χρησιμοποιούνται
    //όταν γίνει η κανονική συνδεση με τη βαση.

    public User() {
    }
    
    public User(String username, String password){
        this.username=username;
        this.password=password;
    }
    
    public User(String username, String password, String customerName, String customerLastname, String telephoneNum) {
       this.username = username;
       this.password = password;
       this.customerName = customerName;
       this.customerLastname = customerLastname;
       this.telephoneNum = telephoneNum;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
   
    
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerLastname() {
        return this.customerLastname;
    }
    
    public void setCustomerLastname(String customerLastname) {
        this.customerLastname = customerLastname;
    }
    public String getTelephoneNum() {
        return this.telephoneNum;
    }
    
    public void setTelephoneNum(String telephoneNum) {
        this.telephoneNum = telephoneNum;
    }




}


