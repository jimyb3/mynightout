/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.Date;
import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;

/**
 *
 * @author Maria
 */
public interface IReservationDaoEdit {

    public Reservation selectReservation(int userId, int clubId, 
            Date reservationDate, int seatNumber) throws DaoException;
    
}
