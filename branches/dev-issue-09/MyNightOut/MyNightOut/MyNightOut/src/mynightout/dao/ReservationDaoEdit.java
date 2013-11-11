/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class ReservationDaoEdit implements IReservationDaoEdit 
{
 @Override 
  public Reservation selectReservation(String customerName,String dateString,int numOfPeople,String storeName,String ID){

 return new Reservation();  
}
}
