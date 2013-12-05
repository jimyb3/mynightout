/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.IReservationDaoDelete;
import mynightout.dao.NightClubDao;
import mynightout.dao.ReservationDao;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationId;

/**
 *
 * @author Maria
 */
public class DeleteReservationController {

    private IReservationDaoDelete reservationDao;

    public DeleteReservationController(IReservationDaoDelete reservationDao) {
        this.reservationDao = reservationDao;

    }

    public ReservationId deleteReservation(String clubName, int reservationId) {
        ReservationDao changeReservationStatus = new ReservationDao();
        ReservationId res = new ReservationId();
        res.setReservationId(reservationId);
        int clubId = new NightClubDao().getNightClubIdByNightClubName(clubName).getClubId();
        res.setClubId(clubId);
        if (changeReservationStatus.cancelReservationByNightClub(res)) {
            try {
                return res;
            } catch (Exception e) {
                throw new IllegalArgumentException("Πρόβλημα στην βάση");
            }
        } else {
            throw new IllegalArgumentException("Η διαγραφή δεν έγινε");
        }

    }
}
