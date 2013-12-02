/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import mynightout.model.User;

/**
 *
 * @author ioanna
 */
public class SelectFromDB {

    public void selectReservation(String userName, ConnectionToMysql conn) {
        PreparedStatement stmt = null;

        try {

            String sql;
            sql = ("SELECT Customer_name, Customer_lastname, Club_name, Reservation_date,"
                    + " reservation.Seat_number\n"
                    + "FROM nightclub\n"
                    + "INNER JOIN (\n"
                    + "user\n"
                    + "INNER JOIN reservation ON user.User_id = reservation.User_id\n"
                    + ") ON nightclub.Club_id = reservation.Club_id\n"
                    + "WHERE Username ='" + userName + "';");
            stmt = conn.connection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String customerName = rs.getString("Customer_name");
                String customerLastName = rs.getString("Customer_lastname");
                String clubName = rs.getString("Club_name");
                String reservationDate = rs.getString("Reservation_date");
                String seatNumber = rs.getString("Seat_number");
                System.out.println(customerName + " " + customerLastName + " " + clubName + " " + reservationDate + " " + seatNumber + "\n");
                //System.out.println("epitheto :" +customerLastName);
            }
            rs.close();
            stmt.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }
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
