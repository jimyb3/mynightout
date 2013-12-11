/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import mynightout.dao.IReservationDaoEdit;
import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Maria
 */
public class EditReservationController {

    private IReservationDaoEdit reservationDao;

    public EditReservationController(IReservationDaoEdit reservationDao) {
        this.reservationDao = reservationDao;

    }

    @SuppressWarnings("empty-statement")
    public Reservation editReservation(int userId, int clubId, 
            Date reservationDate, String trapezi, int seatNumber, String reservationStatus)
            throws IllegalArgumentException, DaoException {
        /**
         * Η βάση μέσα στoν πίνακα κράτηση κρατάει μόνο το userId, το clubId, την ημερομηνία
         * κράτησης, των αριθμό θέσεων, και μια ένα status που μας δειχνει αν ειναι ενεργή
         * η κράτηση.
         * 
         */
         
        /*if (customerName.length() < 3) {
            throw new IllegalArgumentException("Το όνομα πελάτη πρέπει να έχει μήκος τουλάχιστον 3 χαρακτήρες ");
        }*/

        if (seatNumber > 7) {
            throw new IllegalArgumentException("Το τραπέζι έχει 7 θέσεις");
            // TODO 
        }
        try {
            ReservationPk res=new ReservationPk();
            res.setClubId(clubId);
            res.setUserId(userId);
            return reservationDao.selectReservation(res, 
            reservationDate, trapezi, seatNumber, reservationStatus);
        } catch (DaoException e) {
            throw e;
        }

    }

}
