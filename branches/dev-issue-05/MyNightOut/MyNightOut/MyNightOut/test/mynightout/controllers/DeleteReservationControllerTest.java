/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.MockDeleteDaoSuccess;
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
public class DeleteReservationControllerTest {
    
    public DeleteReservationControllerTest() {
    
    
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
     * Test of deleteReservation method, of class DeleteReservationController.
     */
    @Test
    public void testDeleteReservation_1args_1() throws Exception {
        System.out.println("deleteReservation");
        String ID = "44444";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoSuccess());
        Reservation result = instance.deleteReservation(ID);
        Assert.assertEquals(Integer.parseInt(ID),result.getReservationId());//metatroph toy string se int
        Assert.assertEquals(true, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteReservation method, of class DeleteReservationController.
     */
    @Test
    public void testDeleteReservation_1args_2() {
        System.out.println("DeleteReservation");
        String ID = "";
        DeleteReservationController instance = null;
        Reservation expResult = null;
        Reservation result = instance.DeleteReservation(ID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
