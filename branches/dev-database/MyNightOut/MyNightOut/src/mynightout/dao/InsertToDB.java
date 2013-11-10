/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ioanna
 */
public class InsertToDB {

    public void insertReservationData(String userName, String nightClubName, String reservationDate, int seatNumber, ConnectionToMysql conn) {
        PreparedStatement pst = null;
        PreparedStatement stmt = null;

        try {
            String sql1;
            sql1 = ("SELECT User_id FROM user WHERE Username = '" + userName + "';");
            stmt = conn.connection().prepareStatement(sql1);
            ResultSet rsuserId = stmt.executeQuery(sql1);
            rsuserId.next();
            String UserId = rsuserId.getString("User_id");
            String sql2;
            sql2 = ("SELECT Club_id FROM nightclub WHERE Club_name = '" + nightClubName + "';");
            stmt = conn.connection().prepareStatement(sql2);
            ResultSet rsclubId = stmt.executeQuery(sql2);
            rsclubId.next();
            String ClubId = rsclubId.getString("Club_id");
            String status = "not canceled";
            String sql = ("INSERT INTO reservation(User_id, Club_id, Reservation_date, Seat_number, Reservation_status) VALUES ('" + UserId + "', '" + ClubId + "', '" + reservationDate + "', '" + seatNumber + "', '" + status + "');");
            pst = conn.connection().prepareStatement(sql);
            pst.executeUpdate();

            //conn.connection().prepareStatement("SELECT User_id FROM user WHERE Username = '" + userName + "';");
        } catch (SQLException se) {
            se.printStackTrace();
        }
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
}
