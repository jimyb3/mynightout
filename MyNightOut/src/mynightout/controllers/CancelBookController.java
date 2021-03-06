/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.ReservationDao;
import mynightout.dao.UserDao;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Dimitris
 */
public class CancelBookController {

    /**
     * Ένας απλός Controllexceptionr. Ελέγχει αν ο αριθμός κράτησης που δώθηκε είναι
     * έγκυρος(θα πρέπει να είναι θετικός και όχι μεγαλύτερος του 100), και αν
     * το μήκος του ονόματος που δόθηκε είναι πάνω από 3 χαρακτήρες. Αν αυτά
     * ισχύουν τότε θα διαγράφει την κράτηση.
     *
     * @param userName το όνομα του πελάτη
     * @param reservationId ο αριθμός της κράτησης
     * @return διαγράφει την κράτηση
     * @throws IllegalArgumentException αν κάποια από τις παραμέτρους δεν ήταν
 σωστή DaoExcexceptionption αν απέτυχε η επικοινωνία με τη βάση
     */
    public ReservationPk cancelReservation(String userName, int reservationId) {
        
        if(reservationId<0){
            throw new IllegalArgumentException("Πολύ μικρό reservation ID.");
        }
        
        if(reservationId>=1999999999){
            throw new IllegalArgumentException("Πολύ μεγάλο reservation ID.");
        }
        
        if(userName.length()>=15){
            throw new IllegalArgumentException("Πολύ μεγάλο username.");
        }
         
        if(userName.equals("")){
            throw new IllegalArgumentException("Πολύ μικρό username.");
        }
            
        ReservationDao changeReservationStatus = new ReservationDao();
        ReservationPk reservation = new ReservationPk();
        reservation.setReservationId(reservationId);
        int userId = new UserDao().getUserDataByUsername(userName).getUserId();
        reservation.setUserId(userId);
        if (reservation.equals(changeReservationStatus.cancelReservationByUser(reservation))) {
            try {
                return reservation;
            } catch (Exception exception) {
                throw new IllegalArgumentException("Πρόβλημα στην βάση");
            }
        } else {
            throw new IllegalArgumentException("Δεν έγινε η ακύρωση! Ελέγξτε τα δεδομένα.");
        }

    }
}
