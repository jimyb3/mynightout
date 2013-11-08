/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import mynightout.dao.MockReservationDaoCreateFail;
import mynightout.dao.MockReservationDaoCreateSuccess;
import mynightout.model.Reservation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miltos
 */
public class CreateBookControllerTest {
    
    public CreateBookControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createReservationNew method, of class CreateBookController.
     */
    @Test
    public void testCreateReservationNewSuccessed() throws Exception {
        System.out.println("createReservationNewSuccess");
        String customerName = "foufoutos";
        int reservationId = 12345;
        
        //Take the current day
        Calendar cal =
                Calendar.getInstance();

        //Add one day
        cal.add(Calendar.DAY_OF_MONTH, 1);

        //Set the time to 00:00:00
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        //Convert to Date object
        Date reservationDate = cal.getTime();

        //Convert date to a String of the form dd/MM/yyyy
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String dateString = df.format(reservationDate);

        
        CreateBookController instance = new CreateBookController(new
         MockReservationDaoCreateSuccess());

        
        
        
        //Date reservationDate = null;
        int numberParty = 5;
        String storeName = "Mas piran Eidisi";
        //CreateBookController instance = null;
       // Reservation expResult = null;
        Reservation result = instance.createReservationNew(customerName,
                /*reservationId,*/ dateString, numberParty, storeName);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(storeName, result.getStoreName());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(numberParty, result.getNumberParty());
        Assert.assertEquals(12345, result.getReservationId());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
  
   
        @Test
    public void testCreateReservationNewFailed() throws Exception {
        System.out.println("createReservationNewSuccess");
        String customerName = "foufoutos";
        int reservationId = 12345;
        
        //Take the current day
        Calendar cal =
                Calendar.getInstance();

        //Add one day
        cal.add(Calendar.DAY_OF_MONTH, 1);

        //Set the time to 00:00:00
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        //Convert to Date object
        Date reservationDate = cal.getTime();

        //Convert date to a String of the form dd/MM/yyyy
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        String dateString = df.format(reservationDate);

        
        CreateBookController instance = new CreateBookController(new
         MockReservationDaoCreateFail());

        
        
        
        //Date reservationDate = null;
        int numberParty = 5;
        String storeName = "Mas piran Eidisi";
        //CreateBookController instance = null;
       // Reservation expResult = null;
       try{
        Reservation result = instance.createReservationNew(customerName,
                /*reservationId,*/ dateString, numberParty, storeName);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(storeName, result.getStoreName());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(numberParty, result.getNumberParty());
        Assert.assertEquals(12345, result.getReservationId());
       }
       catch(Exception e){
       }
       }}
        //return 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    



