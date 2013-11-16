/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.ConnectionToMysql;
import mynightout.dao.ReservationDao;
import mynightout.model.Reservation;

/**
 *
 * @author Dimitris
 */
public class CancelBookController {

    /**
     * Ένας απλός Controller. Ελέγχει αν ο αριθμός κράτησης που δώθηκε είναι
     * έγκυρος(θα πρέπει να είναι θετικός και όχι μεγαλύτερος του 100), και αν
     * το μήκος του ονόματος που δόθηκε είναι πάνω από 3 χαρακτήρες. Αν αυτά
     * ισχύουν τότε θα διαγράφει την κράτηση.
     *
     * @param userName το όνομα του πελάτη
     * @param reservationId ο αριθμός της κράτησης
     * @return διαγράφει την κράτηση
     * @throws IllegalArgumentException αν κάποια από τις παραμέτρους δεν ήταν
     * σωστή DaoException αν απέτυχε η επικοινωνία με τη βάση
     */
    public Reservation cancelReservation(String userName, int reservationId) {

        ReservationDao changeReservationStatus = new ReservationDao();
        ConnectionToMysql conn = new ConnectionToMysql();

        if (changeReservationStatus.isReservationCancelled(userName, reservationId, conn)) {
            try {
                Reservation reservation = new Reservation(userName, reservationId);
                return reservation;
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new IllegalArgumentException("Δεν έγινε η ακύρωση! Ελέγξτε τα δεδομένα.");
        }

    }
}
