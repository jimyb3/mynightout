/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.Date;
import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationId;

/**
 *
 * @author Miltos
 */
public class ReservationDaoCreate implements IReservationDaoCreate {

    @Override
    public Reservation createReservation(ReservationId res, Date reservationDate, 
            String trapezi, int seatNumber, String reservationStatus) throws DaoException {
        return new Reservation(res, reservationDate, 
            trapezi, seatNumber, reservationStatus);
    }
}
