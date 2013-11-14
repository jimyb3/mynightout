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
public class MockDeleteDaoFailure implements IReservationDaoDelete{
     @Override   
    public Reservation selectReservation(String reservationId) throws DaoException{
        int resId=Integer.parseInt(reservationId);
        Reservation reservation= new Reservation(resId);
        
        reservation.setReservationId(Integer.parseInt(reservationId));
        reservation.setCancelSuccessful(false);
        return reservation;
    }
    
}
