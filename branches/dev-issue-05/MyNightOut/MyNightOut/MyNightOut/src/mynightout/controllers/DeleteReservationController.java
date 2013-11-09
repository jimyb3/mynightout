/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import java.io.FileNotFoundException;
import mynightout.dao.IReservationDao;
import mynightout.exceptions.DaoException;
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
  Reservation deleteReservation(String ID) throws IllegalArgumentException,DaoException
  {
    public static void CountDigits(String ID) throws FileNotFoundException
        {
           
            if (ID.length()!=5)
            {
                System.out.printf("to ID pou dwsate den einai egkuro");
             }
         }  
      
  }
 
}
