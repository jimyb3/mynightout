package mynightout.entity;
// Generated 4 DEC 2013 5:28:19 AM by Hibernate Tools 3.6.0

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

    private Integer userId;
    private String username;
    private String password;
    private String customerName;
    private String customerLastname;
    private String telephoneNum;
    private String emailAddress;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username, String password, String customerName, String customerLastname, String telephoneNum, String emailAddress) {
        this.username = username;
        this.password = password;
        this.customerName = customerName;
        this.customerLastname = customerLastname;
        this.telephoneNum = telephoneNum;
        this.emailAddress = emailAddress;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
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

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}