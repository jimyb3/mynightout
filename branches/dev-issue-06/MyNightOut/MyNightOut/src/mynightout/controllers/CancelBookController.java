/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.IReservationDao;
import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/**
 *  *****test******
 * @author Dimitris
 */
public class CancelBookController {
    private IReservationDao cancelBookDao;
    
    public CancelBookController(IReservationDao cancelBookDao){
        this.cancelBookDao=cancelBookDao;
    }
    
   /**
     * Ένας απλός Controller.
     * Ελέγχει αν ο αριθμός κράτησης που δώθηκε είναι έγκυρος(θα πρέπει να είναι
     * θετικός και όχι μεγαλύτερος του 100), και αν το μήκος του ονόματος που 
     * δόθηκε είναι πάνω από 3 χαρακτήρες. Αν αυτά ισχύουν τότε θα διαγράφει την
     * κράτηση.
     * @param customerName το όνομα του πελάτη
     * @param reservationId ο αριθμός της κράτησης
     * @return διαγράφει την κράτηση
     * @throws IllegalArgumentException αν κάποια από τις παραμέτρους δεν ήταν σωστή
     *         DaoException αν απέτυχε η επικοινωνία με τη βάση
    */
    public Reservation cancelReservationNew(String customerName, int reservationId)
                throws IllegalArgumentException, DaoException{
        //Check if reservationID is valid
        if (reservationId>=100){
            throw new IllegalArgumentException("Too big ID number for reservation!");
        }
        
        if (reservationId<=0){
            throw new IllegalArgumentException("Too small ID number fro reservation");
        }
        
        //Check if customer name is at least three character's long
        if (customerName.length()<3){
            throw new IllegalArgumentException("Customer name should be at least three characters long");
        }
        
        try{
            return cancelBookDao.selectReservation(customerName, reservationId);
        } catch(DaoException e){
            throw e;
        }
    }
}
