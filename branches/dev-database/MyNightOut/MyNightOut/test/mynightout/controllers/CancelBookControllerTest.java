/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.MockCancelBookDaoFailure;
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
     * Τεστάρει την συμπεριφορά του Controller για επιτυχημένη διαγραφή.
     */
    @Test
    public void testCancelReservationSucceeded() throws Exception {
        System.out.println("CancelReservationNewSuccess");
        String customerName = "lalakis";
        int reservationId = 15;
        CancelBookController instance = new CancelBookController(new MockCancelBookDaoSuccess());
        
        Reservation result = instance.cancelReservation(customerName, reservationId);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals("Πέτυχε η ακυρωση", true, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
        
    }
   
    /**
     * Τεστάρει την συμπεριφορά του Controller για αποτυχημένη διαγραφή.
     */
    @Test
    public void testCancelReservationFailed() throws Exception {
        System.out.println("CancelReservationNewEmptyName");
        String customerName = "lalakis";
        int reservationId = 15;
        CancelBookController instance = new CancelBookController(new MockCancelBookDaoFailure());
        
        Reservation result = instance.cancelReservation(customerName, reservationId);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
