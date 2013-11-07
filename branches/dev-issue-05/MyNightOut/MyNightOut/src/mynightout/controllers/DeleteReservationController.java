package mynightout.controllers;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.io.FileNotFoundException;
import mynightout.dao.IReservationDao;
import mynightout.model.Reservation;


public class DeleteReservationController {
    private final IReservationDao deleteReservationDao;
    private IReservationDao deleteReservation;
    
    public  DeleteReservationController(IReservationDao  deleteReservationDao){
        this.deleteReservationDao= deleteReservation;
     }
       
        public static void CountDigits(String ID) throws FileNotFoundException
        {
            int count = 0;
            for (int i = 0, len = ID.length(); i < len; i++)
            {
              if (Character.isDigit(ID.charAt(i)))
               {
                 count++;
               }
            }
             
            if (count==5)
            {
                 DeleteReservation delres= new DeleteReservation(); 
             }
         }

    public Reservation DeleteReservationNew(Type String) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Reservation DeleteReservationNew(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class DeleteReservation {

        public DeleteReservation() {
        }
    }
}

  
