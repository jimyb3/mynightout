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
    public void testEditReservationWithCorrectInfo(){}
    
    /*
    public void testEditReservationWithCorrectInfo() throws Exception {
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
    public void testEditReservationWithZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "16/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =0 ;

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
     @Test
    public void testEditReservationWithNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "16/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =-1;

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
    
     @Test (expected=IllegalArgumentException.class)
    public void testEditReservationWithHugeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "16/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =100;

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
    
     @Test
    public void testEditReservationWithNegativeDay() throws Exception {
        System.out.println("editReservation");
        String date = "-1/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithZeroDay() throws Exception {
        System.out.println("editReservation");
        String date = "00/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithBigDay() throws Exception {
        System.out.println("editReservation");
        String date = "32/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
  @Test
    public void testEditReservationWithNegativeMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/-01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithZeroMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/00/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithBigMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/13/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithNegativeYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/01/-2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithZeroYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/01/0000";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithBigYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/01/2050";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =5;

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
    @Test
    public void testEditReservationWithZeroDayAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "00/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =0;

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
      @Test
    public void testEditReservationWithZeroDayAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "00/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =-1;

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
      @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithZeroDayAndBigSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "00/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =100;

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
      @Test
    public void testEditReservationWithNegativeDayAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "-01/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =0;

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
      @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithNegativeDayAndBigSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "-01/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =100;

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
      @Test
    public void testEditReservationWithNegativeDayAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "-01/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =-1;

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
      @Test
    public void testEditReservationWithZeroMonthAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/00/-2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =0;

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
    @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithZeroMonthAndBigSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/00/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =100;

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
    @Test
    public void testEditReservationWithZeroMonthAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/00/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =-1;

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
    @Test
    public void testEditReservationWithNegativeMonthAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/-01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =0;

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
    @Test
    public void testEditReservationWithNegativeMonthAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/-01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =-1;

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
    @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithNegativeMonthAndBigSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/-01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =100;

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
    @Test
    public void testEditReservationWithNonxistentMonthAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/13/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =0;

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
     @Test
    public void testEditReservationWithNonxistentMonthAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/13/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =-1;

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
     @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithNonxistentMonthAndBigSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/13/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =100;

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
     @Test
    public void testEditReservationWithBigYearAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2050";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =0;

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
     @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithBigYearAndBigSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2050";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =100;

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
     @Test
    public void testEditReservationWithBigYearAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2050";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 2;
        int seatNumber =-1;

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
     @Test
    public void testEditReservationWithBigClubId() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId = 1000000000;
        int seatNumber =4;

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
      @Test
    public void testEditReservationWithZeroClubId() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =4;

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
    @Test
    public void testEditReservationWithNegativeClubId() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =4;

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
     @Test
    public void testEditReservationWithZeroClubIdAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =0;

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
     @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithZeroClubIdAndHugeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =100;

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
     @Test
    public void testEditReservationWithZeroClubIdAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =-1;

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
     @Test
    public void testEditReservationWithNegativeClubIdAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =0;

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
     @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithNegativeClubIdAndHugeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =100;

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
     @Test
    public void testEditReservationWithNegativeClubIdAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =-1;

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
     @Test
    public void testEditReservationWithHugeClubIdAndZeroSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =0;

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
     @Test
    public void testEditReservationWithHugeClubIdAndNegativeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =-1;

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
     @Test(expected=IllegalArgumentException.class)
    public void testEditReservationWithHugeClubIdAndHugeSeatNumber() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =100;

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
     @Test
    public void testEditReservationWithHugeClubIdAndZeroDay() throws Exception {
        System.out.println("editReservation");
        String date = "00/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithHugeClubIdAndNegativeDay() throws Exception {
        System.out.println("editReservation");
        String date = "-01/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithHugeClubIdAndBigDay() throws Exception {
        System.out.println("editReservation");
        String date = "32/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithHugeClubIdAndNonexistentMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/13/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
  @Test
    public void testEditReservationWithHugeClubIdAndZeroMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/00/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithHugeClubIdAndNegativeMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/-12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithHugeClubIdAndNegativeYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/-2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithHugeClubIdAndZeroYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/0000";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithHugeClubIdAndBigYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2050";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =1000000000;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithNegativeClubIdAndNegativeYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/-2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithNegativeClubIdAndZeroYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/0000";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithNegativeClubIdAndBigYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/12/2050";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithNegativeClubIdAndNegativeMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/-12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithNegativeClubIdAndZeroMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/00/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
    @Test
    public void testEditReservationWithNegativeClubIdAndNegativeDay() throws Exception {
        System.out.println("editReservation");
        String date = "-01/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
    @Test
    public void testEditReservationWithNegativeClubIdAndZeroDay() throws Exception {
        System.out.println("editReservation");
        String date = "00/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
    @Test
    public void testEditReservationWithNegativeClubIdAndBigDay() throws Exception {
        System.out.println("editReservation");
        String date = "32/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =-1;
        int seatNumber =3;

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
    @Test
    public void testEditReservationWithZeroClubIdAndNegativeDay() throws Exception {
        System.out.println("editReservation");
        String date = "-01/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithZeroClubIdAndZeroDay() throws Exception {
        System.out.println("editReservation");
        String date = "00/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithZeroClubIdAndBigDay() throws Exception {
        System.out.println("editReservation");
        String date = "32/01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
     @Test
    public void testEditReservationWithZeroClubIdAndNegativeMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/-01/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithZeroClubIdAndZeroMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/00/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithZeroClubIdAndNonexistentMonth() throws Exception {
        System.out.println("editReservation");
        String date = "01/13/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithZeroClubIdAndNegativeYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/01/-2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithZeroClubIdAndZeroYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/01/0000";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

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
      @Test
    public void testEditReservationWithZeroClubIdAndBigYear() throws Exception {
        System.out.println("editReservation");
        String date = "01/01/2050";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);

        int userId = 1;
        int clubId =0;
        int seatNumber =3;

        EditReservationController instance = new EditReservationController(new MockEditDaoFailure());
        Reservation result = instance.editReservation(userId, clubId, reservationDate, seatNumber);
        Assert.assertEquals(userId, result.getUserId());
        Assert.assertEquals(clubId, result.getClubId());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(seatNumber, result.getSeatNumber());
        Assert.assertEquals(false, result.isCancelSuccessful());
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }*/
  
    
    
}
