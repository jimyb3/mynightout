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
public class MockDeleteDaoSuccess implements IReservationDaoDelete {
  @Override   
    public Reservation selectReservation(String reservationId) throws DaoException{
        Reservation reservation= new Reservation();
        
        reservation.setReservationId(Integer.parseInt(reservationId));
        reservation.setCancelSuccessful(true);
        return reservation;
    }
}