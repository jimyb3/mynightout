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
import javax.swing.JFrame;
import mynightout.dao.NightClubDao;
import mynightout.dao.ReservationDao;
import mynightout.dao.TablesDao;
import mynightout.ui.MainFrame;

/**
 * Εδώ είναι η main του προγράμματος, που φτιάχνει το αρχικό παράθυρο του
 * προγράμματος
 *
 * @author Dimitris
 */
public class MyNightOut {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        JFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        /*String clubName="Vogue";
         NightClubDao nCDao=new NightClubDao();
         int clubId= nCDao.getNightClubIdByNightClubName(clubName).getClubId();
         TablesDao td=new TablesDao();
         int allTables=td.numberOfTablesByClubId(clubId);
         String date = "01/01/2014";
         Format formatter = new SimpleDateFormat("dd/MM/yyyy");
         Date reservationDate = (Date) formatter.parseObject(date);
         ReservationDao rDao=new ReservationDao();
         int reservationTables=rDao.numberOfReservationTablesByDate(clubId, reservationDate);
        
         System.out.print(clubName+" "+reservationTables+"/"+allTables);*/

    }

}
