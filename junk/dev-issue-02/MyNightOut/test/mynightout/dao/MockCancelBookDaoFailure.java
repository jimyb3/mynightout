package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MyPro
 */
public class MockCancelBookDaoFailure implements IReservationDao{
    /**
     * Προσποιήσου ότι δεν διέγραψες μια κράτηση και επέστρεψε το false για 
     * αποτυχημένη διαγραφή.
     * @param customerName το όνομα του πελάτη
     * @param reservationId ο αριθμός της κράτησης
     * @return επιστρέφει διαγραφή κράτησης 
     * @throws DaoException σε περίπτωση που δεν γίνει η διαγραφή.
     */
    
    @Override
    public Reservation selectReservation(String customerName, int reservationId) throws DaoException{
        Reservation reservation= new Reservation();
        
        reservation.setCustomerName(customerName);
        reservation.setReservationId(reservationId);
        reservation.setCancelSuccessful(false);
        return reservation;
    }
    
}