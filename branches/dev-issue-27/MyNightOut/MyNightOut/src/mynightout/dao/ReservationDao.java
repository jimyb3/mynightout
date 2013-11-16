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
import mynightout.model.Reservation;

/**
 * Κλάση που κάποια στιγμή θα χρησιμοποιηθεί για την επικοινωνία με το σύστημα
 * μόνιμης αποθηκευσης. Προς το παρόν δεν κάνει κάτι χρήσιμο
 *
 * @author Dimitris
 */
public class ReservationDao implements IReservationDao {

    @Override
    public Reservation selectReservation(String userName, int reservationId) throws DaoException {
        return new Reservation(userName, reservationId);
    }

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

    public void selectReservationByUsername(String userName, ConnectionToMysql conn) {
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

    public boolean isReservationCancelled(String userName, int reservationId, ConnectionToMysql conn) {
        PreparedStatement stmt = null;

        try {
            String sql;
            sql = ("UPDATE reservation SET Reservation_status=\"inactive\" WHERE Reservation_id='" + reservationId + "' AND User_id=(SELECT User_id FROM user WHERE Username='" + userName + "');");
            stmt = conn.connection().prepareStatement(sql);
            stmt.executeUpdate(sql);
            if (stmt.executeUpdate(sql) == 1) {
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
