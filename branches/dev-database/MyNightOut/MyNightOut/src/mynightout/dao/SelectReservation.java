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

/**
 *
 * @author ioanna
 */
public class SelectReservation {

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
}
