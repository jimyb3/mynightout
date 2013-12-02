/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.Date;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class ReservationDaoEdit implements IReservationDaoEdit
{
 @Override 
  public Reservation selectReservation(String customerName,String reservationDate,int numOfPeople,String storeName){

 return new Reservation(customerName,reservationDate,numOfPeople,storeName);  
}
}
