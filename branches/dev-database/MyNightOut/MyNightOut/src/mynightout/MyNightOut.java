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
import mynightout.dao.InsertToDB;
import mynightout.dao.ConnectionToMysql;
import mynightout.dao.SelectFromDB;
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
        ConnectionToMysql conn = new ConnectionToMysql();
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
    }

}
