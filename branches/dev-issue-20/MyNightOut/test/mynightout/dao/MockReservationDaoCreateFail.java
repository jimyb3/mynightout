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
    public Reservation createReservation(String customerName, /*int reservationId,*/
            Date reservationDate, int numberParty, String storeName)
            throws DaoException {
        try {
            Reservation r = new Reservation();

            r.setStoreName(storeName);
            r.setCustomerName(customerName);
            r.setReservationDate(reservationDate);
            r.setReservationId(1);
            r.setNumberParty(numberParty);
            return r;
        } catch (Exception e) {
            throw new IllegalArgumentException("Problima me tin basi de exw reservationNumber");
        }
    }
}
