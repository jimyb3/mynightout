/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.IReservationDaoDelete;
import mynightout.dao.ReservationDao;
import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;

/**
 *
 * @author Maria
 */
public class DeleteReservationController {

    private IReservationDaoDelete reservationDao;

    public DeleteReservationController(IReservationDaoDelete reservationDao) {
        this.reservationDao = reservationDao;

    }

    public Reservation deleteReservation(String clubName,int reservationId) {
       ReservationDao changeReservationStatus = new ReservationDao();
       
        if (changeReservationStatus.cancelReservationByNightClub(clubName,reservationId)) {
          try 
          {
                Reservation reservation = new Reservation(clubName, reservationId);
                return reservation;
            } 
          catch (Exception e)
            {
                throw new IllegalArgumentException("Πρόβλημα στην βάση");
            }
        } else
        {
            throw new IllegalArgumentException("Η διαγραφή δεν έγινε");
         }
       
       

     
  }
}
