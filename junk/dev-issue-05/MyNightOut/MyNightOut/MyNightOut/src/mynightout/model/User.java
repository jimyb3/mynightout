/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.model;

/**
 *
 * @author ioanna
 */
public class User {
    private String userName;
    private String passWord;
    private boolean loginSuccessful;

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public boolean isloginSuccessful() {
        return loginSuccessful;
    }

    public void setloginSuccessful(boolean isloginSuccessful) {
        this.loginSuccessful = isloginSuccessful;
    }

    
    
    
}
