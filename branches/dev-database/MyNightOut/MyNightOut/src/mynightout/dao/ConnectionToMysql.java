/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author ioanna
 * 
 */
public class ConnectionToMysql {
    public Connection connection() throws SQLException{
        String url = "jdbc:mysql://79.103.252.134:3306/mynightout";
        String user = "root";
        String password = "";
        return DriverManager.getConnection(url, user, password);
    }
}