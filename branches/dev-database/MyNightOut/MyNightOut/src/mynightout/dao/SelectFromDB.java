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
public class SelectFromDB {

    public void selectReservation(String userName, ConnectionToMysql conn) {
        PreparedStatement stmt1 = null;

        try {

            String sql1;
            sql1 = ("SELECT Customer_name, Customer_lastname, Club_name, Reservation_date,"
                    + " reservation.Seat_number\n"
                    + "FROM nightclub\n"
                    + "INNER JOIN (\n"
                    + "user\n"
                    + "INNER JOIN reservation ON user.User_id = reservation.User_id\n"
                    + ") ON nightclub.Club_id = reservation.Club_id\n"
                    + "WHERE Username ='" + userName + "';");
            stmt1 = conn.connection().prepareStatement(sql1);
            ResultSet rs1 = stmt1.executeQuery(sql1);

            while (rs1.next()) {
                String customerName = rs1.getString("Customer_name");
                String customerLastName = rs1.getString("Customer_lastname");
                String clubName = rs1.getString("Club_name");
                String reservationDate = rs1.getString("Reservation_date");
                String seatNumber = rs1.getString("Seat_number");
                System.out.println(customerName + " " + customerLastName + " " + clubName + " " + reservationDate + " " + seatNumber + "\n");
                //System.out.println("epitheto :" +customerLastName);
            }
            rs1.close();
            stmt1.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public void selectNightClubs(ConnectionToMysql conn) {
        PreparedStatement stmt2 = null;
        try {
            String sql2;
            sql2 = ("SELECT Club_name, Seat_number, Telephone_num\n"
                    + "FROM  nightclub ");
            stmt2 = conn.connection().prepareStatement(sql2);
            ResultSet rs2 = stmt2.executeQuery(sql2);
            while (rs2.next()) {
                String clubName = rs2.getString("Club_name");
                int seatNum = rs2.getInt("Seat_number");
                String telephoneNum = rs2.getString("Telephone_num");
                System.out.println(clubName + " " + seatNum + " " + telephoneNum + "\n");                
            }
            rs2.close();
            stmt2.close();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
