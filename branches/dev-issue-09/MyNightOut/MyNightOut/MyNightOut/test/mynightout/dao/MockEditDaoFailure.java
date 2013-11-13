/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.Date;
import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class MockEditDaoFailure implements IReservationDaoEdit  {
    
 @Override
      public Reservation selectReservation(String customerName, Date reservationDate, int numOfPeople, String storeName) throws DaoException{

        Reservation reservation=new Reservation(customerName,reservationDate, numOfPeople,storeName);
        
        
        //String numOfPeopleString=Integer.toString(numOfPeople);
        reservation.setCustomerName(customerName);
      //  reservation.setReservationId(ID);
        reservation.setCancelSuccessful(false);
        return reservation;
     
}
}