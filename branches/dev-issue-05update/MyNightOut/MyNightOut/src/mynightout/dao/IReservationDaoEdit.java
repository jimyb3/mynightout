/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.Date;
import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;

/**
 *
 * @author Maria
 */
public interface IReservationDaoEdit {

    public Reservation selectReservation(ReservationPk res, Date reservationDate, 
            String trapezi, int seatNumber, String reservationStatus) throws DaoException;
    
}
