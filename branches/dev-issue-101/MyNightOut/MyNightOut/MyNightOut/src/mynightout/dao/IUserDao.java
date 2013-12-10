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
public interface IUserDao {
    User makeLogin(String userName, String passWord) throws DaoException ;
}
