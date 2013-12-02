/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.User;

/**
 *
 * @author ioanna
 */
public class UserDao implements IUserDao{
    @Override
    public User makeLogin(String userName, String passWord) throws DaoException {
        return new User();
    }
    
}
