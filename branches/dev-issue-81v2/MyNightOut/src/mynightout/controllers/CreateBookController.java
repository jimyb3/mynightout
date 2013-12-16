/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import mynightout.entity.Reservation;
import mynightout.exceptions.DaoException;
import mynightout.dao.IReservationDaoCreate;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Miltos
 */
public class CreateBookController {

    private IReservationDaoCreate createBookDao;

    public CreateBookController() {

    }

    /**
     * Η βάση μέσα στoν πίνακα κράτηση κρατάει μόνο το userId, το clubId, την
     * ημερομηνία κράτησης, των αριθμό θέσεων, και μια ένα status που μας
     * δειχνει αν ειναι ενεργή η κράτηση.
     *
     */
    public Reservation createReservationNew(int userId, int clubId,
            Date reservationDate, String trapezi, String reservationStatus)
            throws IllegalArgumentException, DaoException {

        
         if (trapezi.length() < 3) {
         throw new IllegalArgumentException("Υπαρχει σφαλμα στην επιλογη τραπεζιου");
         }
         
        if (0 == clubId){
            throw new IllegalArgumentException("Πρεπει να επιλεξεται καποιο καταστημα");
        }
        /*        if (seatNumber > 5) {
        throw new IllegalArgumentException("Καθε τραπεζι εχει 5 θεσεις");
        // TODO edw prepei na ginei pio sun8eto problepsi gia parapanw trapezia
        }*/

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date tempDate = new Date();
        String c = sdf.format(tempDate);
        try {
            tempDate = sdf.parse(c);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Incorrect date format");
        }

        /*
         * ελεγχος αν η ημερομηνια εχει παρελθει
         */
        if (Calendar.getInstance().getTime().compareTo(reservationDate) >= 0) {
            throw new IllegalArgumentException("Η ημερομηνια που επιλεξατε εχει παρέλθει!");

            //TODO edw ektws autou tou elenxou 8a mporouse na min afinei ton xristi
            //     na epile3ei imerominies pou exoun perasei
        }

        // TODO elenxo gia imerominia pou exei perasei
        try {
            ReservationPk res = new ReservationPk();
            res.setClubId(clubId);
            res.setUserId(userId);
            return createBookDao.createReservation(res, reservationDate,
                    trapezi, reservationStatus);
        } catch (DaoException e) {
            throw e;
        }
    }
}
