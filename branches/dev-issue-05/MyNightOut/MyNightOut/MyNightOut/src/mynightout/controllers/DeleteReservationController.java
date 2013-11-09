/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.IReservationDao;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class DeleteReservationController {
    private
    IReservationDao reservationDao;
    
  public  DeleteReservationController (IReservationDao reservationDao ) 
  {
   this.reservationDao=reservationDao;
      
  }
  Reservation deleteReservation(String ID)
  {
      
      
  }
 
}
