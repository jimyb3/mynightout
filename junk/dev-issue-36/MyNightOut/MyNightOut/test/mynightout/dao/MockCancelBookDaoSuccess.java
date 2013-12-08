/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.dao.IReservationDao;
import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;


/**
 * Παράδειγμα κλάσης Mock. Κανονικά θα τη γράφαμε χρησιμοποιώντας
 * ένα framework σαν το JMock ή το Mockito
 * @author Dimitris
 */
public class MockCancelBookDaoSuccess implements IReservationDao{
    /**
     * Προσποιήσου ότι διέγραψες μια κράτηση και επέστρεψε το true για 
     * επιτυχημένη διαγραφή.
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
        reservation.setCancelSuccessful(true);
        return reservation;
    }
    
}
