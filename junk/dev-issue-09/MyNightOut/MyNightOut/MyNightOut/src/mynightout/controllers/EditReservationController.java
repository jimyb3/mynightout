/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import mynightout.dao.IReservationDaoEdit;
import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class EditReservationController {
   private IReservationDaoEdit reservationDao; 

 public EditReservationController(IReservationDaoEdit reservationDao)
 {
   this.reservationDao= reservationDao;
   

  }
 
 @SuppressWarnings("empty-statement")
   public Reservation editReservation(String customerName,String reservationDate,int numOfPeople,String storeName)
        throws IllegalArgumentException,DaoException
    {
          
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dtStr = reservationDate.trim();  // 01/01/2011
        Date resDate;
        try
        {
             resDate = df.parse(dtStr);  // dt = Sun Jan 01 00:00:00 IST 2011
        } 
        catch (ParseException e)
        {
            throw new IllegalArgumentException("Λάθος ημερομηνία");
        }
         if(customerName.length()<3)
         {
            throw new IllegalArgumentException("Το όνομα πελάτη πρέπει να έχει μήκος τουλάχιστον 3 χαρακτήρες ");
        }
        
        if (numOfPeople > 7)
        {
        throw new IllegalArgumentException("Το τραπέζι έχει 7 θέσεις");
        // TODO 
        }
        try
        {
                    return reservationDao.selectReservation(customerName,reservationDate,numOfPeople,storeName);
        } 
        catch(DaoException e)
        {
            throw e;
        }
   
        

      }
  /* public void getChangedData(int numberOfPeopleNew,String customerNameNew,String storeNameNew){
    String  newStoreName,newName; 
     int newNumber=0;
       
       String newNumberString=Integer.toString(numberOfPeopleNew);
       newNumberString =numberOfPeopleNew;
       newName=customerNameNew;
    
    newStoreName=storeNameNew;
*/
 }
