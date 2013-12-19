/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.Date;
import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Miltos
 */
public class ReservationDaoCreate implements IReservationDaoCreate {

    @Override
    public Reservation createReservation(ReservationPk res, Date reservationDate, 
            String trapezi, String reservationStatus) throws DaoException {
        return new Reservation(res, reservationDate, 
            trapezi, reservationStatus);
    }
}
