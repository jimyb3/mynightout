/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;


/**
 * Κλάση που κάποια στιγμή θα χρησιμοποιηθεί για την επικοινωνία
 * με το σύστημα μόνιμης αποθηκευσης.
 * Προς το παρόν δεν κάνει κάτι χρήσιμο
 * @author Dimitris
 */
public class ReservationDao implements IReservationDao{
    @Override
    public Reservation selectReservation(String customerName, int reservationId) throws DaoException{
        return new Reservation();
    }
}
