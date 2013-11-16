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
 * @author Miltos
 */
public class MockReservationDaoCreateFail implements IReservationDaoCreate {

    @Override
    public Reservation createReservation(String customerName,
            Date reservationDate, int seatNumber, String storeName)
            throws DaoException {
        Reservation reservation = new Reservation(customerName, reservationDate, seatNumber, storeName);

        reservation.setUserName(customerName);
        reservation.setReservationDate(reservationDate);
        reservation.setSeatNumber(seatNumber);
        reservation.setStoreName(storeName);
        reservation.setReservationId(12345);
        reservation.setSuccessCreate(false);
        return reservation;
    }
}
