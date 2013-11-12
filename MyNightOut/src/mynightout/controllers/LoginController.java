/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.ConnectionToMysql;
import mynightout.dao.SelectFromDB;
import mynightout.model.User;

/**
 *
 * @author ioanna
 */
public class LoginController {

    public User Login(String userName, String passWord) {

        SelectFromDB currentUser = new SelectFromDB();
        ConnectionToMysql conn = new ConnectionToMysql();
        
        if(currentUser.isUserDataValid(userName, passWord, conn)) {
            try {
                User newUser = new User(userName, passWord);
                return newUser;
                
            } catch (Exception e) {
                throw e;
            }
        } else {           
            throw new IllegalArgumentException("Λάθος στοιχεία εισόδου");
        }

    }
}
