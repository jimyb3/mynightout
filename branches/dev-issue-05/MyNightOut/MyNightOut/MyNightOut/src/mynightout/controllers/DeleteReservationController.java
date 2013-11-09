/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.IReservationDaoDelete;
import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class DeleteReservationController {
    private IReservationDaoDelete reservationDao;
    
  public  DeleteReservationController (IReservationDaoDelete reservationDao ) 
  {
   this.reservationDao=reservationDao;
      
  }
  public Reservation deleteReservation(String ID) throws IllegalArgumentException,DaoException
  {
                if (ID.length()!=5)
            {
                throw new IllegalArgumentException("to ID pou dwsate den einai egkuro");
             }
  }
 
}
