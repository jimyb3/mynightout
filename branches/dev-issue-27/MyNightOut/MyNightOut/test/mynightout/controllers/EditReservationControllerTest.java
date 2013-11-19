/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import mynightout.dao.MockEditDaoFailure;
import mynightout.dao.MockEditDaoSuccess;
import mynightout.entity.Reservation;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testEditReservation() throws Exception {
        System.out.println("editReservation");
        //Μετατρέπουμε το string σε date
        String date = "16/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber = 4;

        EditReservationController instance = new EditReservationController(new MockEditDaoSuccess());
        Reservation result = instance.editReservation(userId, clubId, reservationDate, seatNumber);
        Assert.assertEquals(userId, result.getUserId());
        Assert.assertEquals(clubId, result.getClubId());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(seatNumber, result.getSeatNumber());
        Assert.assertEquals(true, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    @Test
    public void testEditReservation_1args_2() throws Exception {
        System.out.println("editReservation");
        String date = "16/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber = 4;

        EditReservationController instance = new EditReservationController(new MockEditDaoFailure());
        Reservation result = instance.editReservation(userId, clubId, reservationDate, seatNumber);
        Assert.assertEquals(userId, result.getUserId());
        Assert.assertEquals(clubId, result.getClubId());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(seatNumber, result.getSeatNumber());
        Assert.assertEquals(false, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
