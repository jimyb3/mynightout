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
import mynightout.entity.ReservationPk;

/**
 *
 * @author Maria
 */
public class DeleteReservationController {

    private IReservationDaoDelete reservationDao;

    public DeleteReservationController(IReservationDaoDelete reservationDao) {
        this.reservationDao = reservationDao;

    }

    public ReservationPk deleteReservation(String clubName, int reservationId) {
        ReservationDao changeReservationStatus = new ReservationDao();
        ReservationPk res = new ReservationPk();
        res.setReservationId(reservationId);
        int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
        res.setClubId(clubId);
        if (res.equals(changeReservationStatus.cancelReservationByNightClub(res))) {
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
