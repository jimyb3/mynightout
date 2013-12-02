/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dimitris
 */
public class UpdateDB {
    public boolean isReservationCancelled(String userName, int reservationId, ConnectionToMysql conn){
        PreparedStatement stmt = null;

        try {
            String sql;
            sql = ("UPDATE reservation SET Reservation_status=\"inactive\" WHERE Reservation_id='"+reservationId+"' AND User_id=(SELECT User_id FROM user WHERE Username='"+userName+"');");
            stmt = conn.connection().prepareStatement(sql);
            stmt.executeUpdate(sql);
            if (stmt.executeUpdate(sql)==1) {
                
                stmt.close();
                System.out.println("ok");
                return true;
            } else {
                
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
