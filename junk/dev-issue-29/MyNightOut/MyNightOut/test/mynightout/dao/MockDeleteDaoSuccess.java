/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;

/**
 *
 * @author Maria
 */
public class MockDeleteDaoSuccess implements IReservationDaoDelete {

    @Override
    public Reservation selectReservation(String clubName,int reservationId) throws DaoException {
        Reservation reservation = new Reservation(clubName,reservationId);
        reservation.setCancelSuccessful(true);
        return reservation;
    }
}
