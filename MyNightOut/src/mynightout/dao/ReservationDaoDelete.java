/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import mynightout.entity.Reservation;
import mynightout.entity.ReservationId;

/**
 *
 * @author Maria
 */
public class ReservationDaoDelete implements IReservationDaoDelete {

    @Override
    public ReservationId selectReservation(int reservationId, int userId, int clubId) {
        return new ReservationId(reservationId, userId, clubId);
    }
}
