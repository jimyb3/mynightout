/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.Date;
import mynightout.entity.Reservation;

/**
 *
 * @author Maria
 */
public class ReservationDaoEdit implements IReservationDaoEdit {

    @Override
    public Reservation selectReservation(int userId, int clubId,
            Date reservationDate, int seatNumber) {

        return new Reservation(userId, clubId, reservationDate, seatNumber);
    }
}
