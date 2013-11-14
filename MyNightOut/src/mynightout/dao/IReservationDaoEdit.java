/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.Date;
import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public interface IReservationDaoEdit {

    public Reservation selectReservation(String customerName,String reservationDate, int numOfPeople, String storeName) throws DaoException;
    
}
