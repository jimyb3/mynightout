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
            Date reservationDate, int numberParty, String storeName)
            throws DaoException {
        Reservation r = new Reservation();

        r.setStoreName(storeName);
        r.setCustomerName(customerName);
        r.setReservationDate(reservationDate);
        r.setReservationId(12345);
        r.setNumberParty(numberParty);
        r.setSuccessCreate(false);
        return r;
    }
}
