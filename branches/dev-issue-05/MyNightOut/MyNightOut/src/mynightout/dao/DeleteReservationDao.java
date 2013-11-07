/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */


public abstract class DeleteReservationDao implements IReservationDao{
        public Reservation deleteReservation(String ID) throws DaoException{
        return new Reservation();
    }

  
}

    
