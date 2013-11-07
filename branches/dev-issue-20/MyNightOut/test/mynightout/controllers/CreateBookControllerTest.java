/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import java.util.Date;
import mynightout.model.Reservation;
import org.junit.After;
import org.junit.AfterClass;
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
    public void testCreateReservationNew() throws Exception {
        System.out.println("createReservationNew");
        String customerName = "";
        int reservationId = 0;
        Date reservationDate = null;
        int numberParty = 0;
        String storeName = "Mas piran Eidisi";
        CreateBookController instance = null;
        Reservation expResult = null;
        Reservation result = instance.createReservationNew(customerName, reservationId, reservationDate, numberParty, storeName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
