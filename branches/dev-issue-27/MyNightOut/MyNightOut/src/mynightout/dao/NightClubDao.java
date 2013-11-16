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
import mynightout.model.NightClub;

/**
 *
 * @author panos
 */
public class NightClubDao implements INightClubDao {
    @Override
    public NightClub selectNightClub(String storeName) throws DaoException{
        return new NightClub();    
}
   
    public void selectNightClubs(ConnectionToMysql conn) {
        PreparedStatement stmt = null;
        try {
            String sql;
            sql = ("SELECT Club_name, Seat_number, Telephone_num\n"
                    + "FROM  nightclub ");
            stmt = conn.connection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String clubName = rs.getString("Club_name");
                int seatNum = rs.getInt("Seat_number");
                String telephoneNum = rs.getString("Telephone_num");
                System.out.println(clubName + " " + seatNum + " " + telephoneNum + "\n");
            }
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}