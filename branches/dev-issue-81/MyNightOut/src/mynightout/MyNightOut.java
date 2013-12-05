/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import mynightout.dao.ReservationDao;
import mynightout.entity.Reservation;
import mynightout.ui.MainFrame;

/**
 *  Εδώ είναι η main του προγράμματος, που φτιάχνει το αρχικό 
 * παράθυρο του προγράμματος
 * @author Dimitris
 */
public class MyNightOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        JFrame mainFrame=new MainFrame();
        mainFrame.setVisible(true);
        ReservationDao res=new ReservationDao();
        String date = "2/1/2014";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);
        res.insertReservationData("test", "Ελλήνων Γεύσεις", reservationDate, "Β2", 5);
        
             
    }
    
}
