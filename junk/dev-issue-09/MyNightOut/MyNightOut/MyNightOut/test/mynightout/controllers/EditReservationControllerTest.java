/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import java.util.Date;
import mynightout.dao.MockEditDaoFailure;
import mynightout.dao.MockEditDaoSuccess;
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
 * @author Maria
 */
public class EditReservationControllerTest {
    
    public EditReservationControllerTest() {
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
     * Test of editReservation method, of class EditReservationController.
     */
    @Test
    public void testEditReservation() throws Exception {
        System.out.println("editReservation");
        String customerName = "mary";
        String reservationDate = "16/11/2013";
        int numOfPeople = 5;
        String storeName = "Gkazi";
        EditReservationController instance = new EditReservationController(new MockEditDaoSuccess());
        Reservation result = instance.editReservation(customerName, reservationDate, numOfPeople, storeName);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(numOfPeople, result.getNumOfPeople());
        Assert.assertEquals(storeName, result.getStoreName()); 
        Assert.assertEquals(true, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
     @Test
    public void testEditReservation_1args_2() throws Exception {
        System.out.println("editReservation");
        String customerName = "mary";
        String reservationDate = "16/11/2013";
        int numOfPeople = 5;
        String storeName = "Gkazi";
        EditReservationController instance = new EditReservationController(new MockEditDaoFailure());
        Reservation result = instance.editReservation(customerName, reservationDate, numOfPeople, storeName);
        Assert.assertEquals(customerName, result.getCustomerName());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(numOfPeople, result.getNumOfPeople());
        Assert.assertEquals(storeName, result.getStoreName()); 
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}