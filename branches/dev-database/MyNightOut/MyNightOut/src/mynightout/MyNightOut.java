/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mynightout.dao.InsertReservationData;
import mynightout.dao.MysqlConnection;
import mynightout.dao.SelectReservation;
import mynightout.ui.MainFrame;

/**
 * Εδώ είναι η main του προγράμματος, που φτιάχνει το αρχικό παράθυρο του
 * προγράμματος
 *
 * @author Dimitris
 */
public class MyNightOut{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MysqlConnection conn = new MysqlConnection();
        JFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        try{
            conn.connection();
            MainFrame.jLabel1.setText("Έγινε η σύνδεση.");
            mainFrame.setTitle("MyNightOut: Εγινε η συνδεση");
            
            
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger("nope");
            lgr.log(Level.WARNING, ex.getMessage(), ex);
            MainFrame.jLabel1.setText("Δεν συνδέθηκε.");
            mainFrame.setTitle("MyNightOut: Δεν συνδέθηκε");
        }
        
        //SelectReservation res1 = new SelectReservation();
        //res1.selectReservation("USER2", conn);
        
        InsertReservationData res2 = new InsertReservationData();
        res2.insertReservationData("user1", "Club1", "2014-01-01", 4, conn);
        
    }

}
