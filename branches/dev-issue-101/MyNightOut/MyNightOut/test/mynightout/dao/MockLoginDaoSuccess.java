/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.entity.User;

/**
 *
 * @author ioanna
 */
public class MockLoginDaoSuccess implements IUserDao {

    @Override
    public User makeLogin(String userName, String passWord) throws DaoException {
        User user = new User();
        user.setUsername(userName);
        user.setPassword(passWord);
        //user.setloginSuccessful(true);
        return user;
    }
}