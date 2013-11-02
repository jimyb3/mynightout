/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.MockCancelBookDaoFailed;
import mynightout.model.Reservation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import mynightout.dao.MockCancelBookDaoSuccess;
import org.junit.Assert;

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
     * Test of selectReservationNew method, of class CancelBookController for Success
 cancel book.
     */
    @Test
    public void testCancelReservationNewSuccess() throws Exception {
        System.out.println("CancelReservationNewSuccess");
        String customerName = "lalakis";
        int reservationId = 15;
        CancelBookController instance = new CancelBookController(new MockCancelBookDaoSuccess());
        
        Reservation result = instance.cancelReservationNew(customerName, reservationId);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(1, result.getSuccessCancel());
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
    /**
     * Test of selectReservationNew method, of class CancelBookController for 
 empty name for customer.
     */
    @Test
    public void testCancelReservationNewFailed() throws Exception {
        System.out.println("CancelReservationNewEmptyName");
        String customerName = "lalakis";
        int reservationId = 15;
        CancelBookController instance = new CancelBookController(new MockCancelBookDaoFailed());
        
        Reservation result = instance.cancelReservationNew(customerName, reservationId);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(0, result.getSuccessCancel());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
