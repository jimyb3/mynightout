/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.Date;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Maria
 */
public class ReservationDaoEdit implements IReservationDaoEdit {

    @Override
    public Reservation selectReservation(ReservationPk res, Date reservationDate, 
            String trapezi, int seatNumber, String reservationStatus) {

        return new Reservation(res, reservationDate, 
            trapezi, reservationStatus);
    }
}
