/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.MockDeleteDaoFailure;
import mynightout.dao.MockDeleteDaoSuccess;
import mynightout.entity.Reservation;
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
        int reservationId = 5;
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoSuccess());
        Reservation result = instance.deleteReservation(reservationId);
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(true, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteReservation method, of class DeleteReservationController.
     */
    @Test
    public void testDeleteReservation_1args_2() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 5;
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(reservationId);
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReservation method, of class DeleteReservationController.
     */
    @Test
    public void testDeleteReservation() throws Exception {
        System.out.println("deleteReservation");
        int reservationId = 5;
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoSuccess());
        Reservation result = instance.deleteReservation(reservationId);
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(true, result.isCancelSuccessful());
    }

}
