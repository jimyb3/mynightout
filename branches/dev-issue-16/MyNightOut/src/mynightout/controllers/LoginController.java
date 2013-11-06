/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.IUserDao;
import mynightout.exceptions.DaoException;
import mynightout.model.User;

/**
 *
 * @author ioanna
 */
public class LoginController {
    private IUserDao userDao;
    
    public LoginController(IUserDao userDao) {
        this.userDao = userDao;
    }
    
    public User Login(String userName, String passWord)
            throws IllegalArgumentException, DaoException {
        //Check if customer name is at least three character's long
        if (userName.length() < 4) {
            throw new IllegalArgumentException("Customer name should be at least four characters long");
        }
        try {
            return userDao.makeLogin(userName, passWord);
        } catch (DaoException e) {
            throw e;
        }
    }
    }
    
}
