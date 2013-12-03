/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.entity.Reservation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Dimitris
 */
public class CancelBookControllerTest {
    
    public CancelBookControllerTest() {
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
     * Test of cancelReservation method, of class CancelBookController.
     */
    @Test
    public void testSuccessfulCancel() {
        System.out.println("cancelSuccessfulReservation");
        String userName = "user1";
        int reservationId = 5;
        CancelBookController instance = new CancelBookController();
        Reservation expResult = new Reservation("user1",5);
        Reservation result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUsername(), result.getUsername());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test(expected=AssertionError.class)
    public void testFailedCancelNoUserName() {
        System.out.println("cancelReservation");
        String userName = "";
        int reservationId = -1;
        CancelBookController instance = new CancelBookController();
        Reservation expResult = new Reservation("user1",5);
        Reservation result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUsername(), result.getUsername());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test (expected=AssertionError.class)
    public void testFailedCancelWithBigUserName() {
        System.out.println("cancelReservation");
        String userName = "qwertyuiopasdfgh";
        int reservationId = 1;
        CancelBookController instance = new CancelBookController();
        Reservation expResult = new Reservation("user1",5);
        Reservation result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUsername(), result.getUsername());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test (expected=AssertionError.class)
    public void testFailedCancelWithBigReservationId() {
        System.out.println("cancelReservation");
        String userName = "jim";
        int reservationId = 1999999999;
        CancelBookController instance = new CancelBookController();
        Reservation expResult = new Reservation("user1",5);
        Reservation result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUsername(), result.getUsername());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test (expected=AssertionError.class)
    public void testFailedCancelWithBigReservationIdAndUserName() {
        System.out.println("cancelReservation");
        String userName = "qwertyuiopasdfgh";
        int reservationId = 1999999999;
        CancelBookController instance = new CancelBookController();
        Reservation expResult = new Reservation("user1",5);
        Reservation result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUsername(), result.getUsername());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test(expected=AssertionError.class)
    public void testFailedCancelWithSmallReservationIdAndBigUserName() {
        System.out.println("cancelReservation");
        String userName = "qwertyuiopasdfgh";
        int reservationId = -1;
        CancelBookController instance = new CancelBookController();
        Reservation expResult = new Reservation("user1",5);
        Reservation result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUsername(), result.getUsername());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test (expected=AssertionError.class)
    public void testFailedCancelWithBigReservationIdNoUserName() {
        System.out.println("cancelReservation");
        String userName = "";
        int reservationId = 1999999999;
        CancelBookController instance = new CancelBookController();
        Reservation expResult = new Reservation("user1",5);
        Reservation result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUsername(), result.getUsername());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
}
