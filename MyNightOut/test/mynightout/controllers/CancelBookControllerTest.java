/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.UserDao;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationId;
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
        int userId=new UserDao().getUserIdByUsername(userName).getUserId();
        int reservationId = 6;
        CancelBookController instance = new CancelBookController();
        ReservationId expResult = new ReservationId();
        expResult.setUserId(userId);
        expResult.setReservationId(reservationId);
        
        ReservationId result = instance.cancelReservation(userName, reservationId);
        Assert.assertEquals(expResult.getUserId(), result.getUserId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test(expected=NullPointerException.class)
    public void testFailedCancelNoUserName() {
        System.out.println("cancelReservation");
        String userName = null;
        int userId=new UserDao().getUserIdByUsername(userName).getUserId();
        int reservationId = 5;
        
        CancelBookController instance = new CancelBookController();
        ReservationId expResult = new ReservationId();
        expResult.setUserId(userId);
        expResult.setReservationId(reservationId);
        ReservationId result = instance.cancelReservation(userName, reservationId);
        
        Assert.assertEquals(expResult.getUserId(), result.getUserId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test (expected=NullPointerException.class)
    public void testFailedCancelWithBigUserName() {
        System.out.println("cancelReservation");
        String userName = "qwertyuiopasdfgh";
        int userId=new UserDao().getUserIdByUsername(userName).getUserId();
        int reservationId = 1;
        
        CancelBookController instance = new CancelBookController();
        ReservationId expResult = new ReservationId();
        expResult.setUserId(userId);
        expResult.setReservationId(reservationId);
        ReservationId result = instance.cancelReservation(userName, reservationId);
        
        Assert.assertEquals(expResult.getUserId(), result.getUserId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
    }
    
    @Test 
    public void testFailedCancelWithBigReservationId() {
        System.out.println("cancelReservation");
        String userName = "user1";
        int userId=new UserDao().getUserIdByUsername(userName).getUserId();
        int reservationId = 1999999999;
        
        CancelBookController instance = new CancelBookController();
        ReservationId expResult = new ReservationId();
        expResult.setUserId(userId);
        expResult.setReservationId(reservationId);
        ReservationId result = instance.cancelReservation(userName, reservationId);
        
        Assert.assertEquals(expResult.getUserId(), result.getUserId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test (expected=NullPointerException.class)
    public void testFailedCancelWithBigReservationIdAndUserName() {
        System.out.println("cancelReservation");
        String userName = "qwertyuiopasdfgh";
        int userId=new UserDao().getUserIdByUsername(userName).getUserId();
        int reservationId = 1999999999;
        
        CancelBookController instance = new CancelBookController();
        ReservationId expResult = new ReservationId();
        expResult.setUserId(userId);
        expResult.setReservationId(reservationId);
        ReservationId result = instance.cancelReservation(userName, reservationId);
        
        Assert.assertEquals(expResult.getUserId(), result.getUserId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test(expected=NullPointerException.class)
    public void testFailedCancelWithSmallReservationIdAndBigUserName() {
        System.out.println("cancelReservation");
        String userName = "qwertyuiopasdfgh";
        int userId=new UserDao().getUserIdByUsername(userName).getUserId();
        int reservationId = -1;
        
        CancelBookController instance = new CancelBookController();
        ReservationId expResult = new ReservationId();
        expResult.setUserId(userId);
        expResult.setReservationId(reservationId);
        ReservationId result = instance.cancelReservation(userName, reservationId);
        
        Assert.assertEquals(expResult.getUserId(), result.getUserId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
    
    @Test (expected=NullPointerException.class)
    public void testFailedCancelWithBigReservationIdNoUserName() {
        System.out.println("cancelReservation");
        String userName = "";
        int userId=new UserDao().getUserIdByUsername(userName).getUserId();
        int reservationId = 1999999999;
        
        CancelBookController instance = new CancelBookController();
        ReservationId expResult = new ReservationId();
        expResult.setUserId(userId);
        expResult.setReservationId(reservationId);
        ReservationId result = instance.cancelReservation(userName, reservationId);
        
        Assert.assertEquals(expResult.getUserId(), result.getUserId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
    }
}
