package mynightout.dao;

import mynightout.dao.IReservationDao;
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
public class MockCancelBookDaoFailed implements IReservationDao{
    /**
     * Προσποιήσου ότι δεν διέγραψες μια κράτηση και επέστρεψε το 0 σαν κωδικό 
     * αποτυχημένης διαγραφής.
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
        reservation.setSuccessCancel(0);
        return reservation;
    }
    
}
