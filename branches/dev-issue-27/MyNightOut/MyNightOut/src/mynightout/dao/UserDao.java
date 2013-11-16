/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
    public void insertNewUserData(String userName, String passWord, String customerName, String customerLastname, String telephoneNum, ConnectionToMysql conn) {
        PreparedStatement pst2 = null;
        try {
            String sqlInsertUser;
            sqlInsertUser = ("INSERT INTO user(Username, Password, Customer_name, Customer_lastname, Telephone_num) VALUES ('" + userName + "','" + passWord + "','" + customerName + "','" + customerLastname + "','" + telephoneNum + "');");
            pst2 = conn.connection().prepareStatement(sqlInsertUser);
            pst2.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    } 
    
    public boolean isUserDataValid(String userName, String passWord, ConnectionToMysql conn) {
        PreparedStatement stmt = null;

        try {
            String sql;
            sql = ("SELECT Username, Password FROM user WHERE Username = '" + userName + "' AND Password = '" + passWord + "'; ");
            stmt = conn.connection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                rs.close();
                stmt.close();
                System.out.println("ok");
                return true;
            } else {
                rs.close();
                stmt.close();
                System.out.println("fail");
                return false;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }  
}
