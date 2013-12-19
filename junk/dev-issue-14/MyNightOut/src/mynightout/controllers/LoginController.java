/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;


import mynightout.dao.UserDao;
import mynightout.entity.User;

/**
 *
 * @author ioanna
 */
public class LoginController {

    public User login(String userName, String passWord) {

        UserDao currentUser = new UserDao();

        if (currentUser.isUserDataValid(userName, passWord)) {
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
