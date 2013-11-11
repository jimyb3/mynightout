/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

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
    public Reservation editReservation(String customerName,int date,int numOfPeople,String storeName,String ID )
    throws DaoException{
        Reservation reservation=new Reservation();
        
        
        String dateString=Integer.toString(date);
        reservation.setCustomerName(customerName);
        reservation.setReservationId(ID);
        reservation.setCancelSuccessful(true);
        return reservation;
     
    }

    @Override
    public Reservation selectReservation(String customerName, String dateString, int numOfPeople, String storeName, String ID) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
