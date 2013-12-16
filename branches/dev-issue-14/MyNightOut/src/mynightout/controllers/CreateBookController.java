/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

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
    /**Η βάση μέσα στoν πίνακα κράτηση κρατάει μόνο το userId, το clubId, την ημερομηνία
     * κράτησης, των αριθμό θέσεων, και μια ένα status που μας δειχνει αν ειναι ενεργή
     * η κράτηση.
     * 
     */
    public Reservation createReservationNew(int userId, int clubId, 
            Date reservationDate, String trapezi, int seatNumber, String reservationStatus)
            throws IllegalArgumentException, DaoException {

        
        /*
        if (customerName.length() < 3) {
            throw new IllegalArgumentException("Customer name should be at least three characters long");
        }
        */
        if (seatNumber > 5) {
            throw new IllegalArgumentException("Each table has only 5 seats");
            // TODO edw prepei na ginei pio sun8eto problepsi gia parapanw trapezia
        }

        // TODO elenxo gia imerominia pou exei perasei
        try {
            ReservationPk res=new ReservationPk();
            res.setClubId(clubId);
            res.setUserId(userId);
            return createBookDao.createReservation(res, reservationDate, 
                    trapezi, seatNumber, reservationStatus);
        } catch (DaoException e) {
            throw e;
        }
    }
}
