/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.Date;
import static javax.xml.ws.soap.MTOMFeature.ID;
import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class MockEditDaoSuccess implements IReservationDaoEdit 
{

    /**
     *
     * @param customerName
     * @param date
     * @param numOfPeople
     * @param storeName
     * @param ID
     * @return
     * @throws DaoException
     */
    @Override
     public Reservation selectReservation(String customerName, Date reservationDate, int numOfPeople, String storeName) throws DaoException{
        Reservation reservation=new Reservation(customerName,reservationDate, numOfPeople,storeName);
        
        
       // String dateString=Integer.toString(date);
        reservation.setCustomerName(customerName);
     //   reservation.setReservationId(ID);
        reservation.setCancelSuccessful(true);
        return reservation;
     
    }

}