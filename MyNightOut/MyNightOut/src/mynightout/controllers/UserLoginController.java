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
public class UserLoginController {

    public User login(String userName, String passWord) {

        UserDao currentUser = new UserDao();
        User user = new User(userName, passWord);

        if (user.equalsForLogin(currentUser.isUserDataValid(userName, passWord))) {
            try {
                return user;

            } catch (Exception e) {
                throw new IllegalArgumentException("Πρόβλημα στην βάση");
            }
        } else {
            throw new IllegalArgumentException("Λάθος στοιχεία εισόδου");
        }

    }
}
