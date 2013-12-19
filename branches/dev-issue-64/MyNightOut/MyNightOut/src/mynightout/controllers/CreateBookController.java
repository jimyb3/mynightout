/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.util.Date;
import mynightout.entity.Reservation;
import mynightout.exceptions.DaoException;
import mynightout.dao.ReservationDao;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Miltos
 */
public class CreateBookController {


    public CreateBookController() {
        
    }
    /**Η βάση μέσα στoν πίνακα κράτηση κρατάει μόνο το userId, το clubId, την ημερομηνία
     * κράτησης, των αριθμό θέσεων, και μια ένα status που μας δειχνει αν ειναι ενεργή
     * η κράτηση.
     * 
     */
    public Reservation createReservationNew(int userId, int clubId, 
            Date reservationDate, String trapezi)
            throws IllegalArgumentException, Exception {

        
        /*
        if (customerName.length() < 3) {
            throw new IllegalArgumentException("Customer name should be at least three characters long");
        }
        */
        

        // TODO elenxo gia imerominia pou exei perasei
        try {
            ReservationPk res=new ReservationPk();
            res.setClubId(clubId);
            res.setUserId(userId);
            return new ReservationDao().insertReservationData(userId, clubId, 
            reservationDate, trapezi);
        } catch (Exception e) {
            throw e;
        }
    }
}
