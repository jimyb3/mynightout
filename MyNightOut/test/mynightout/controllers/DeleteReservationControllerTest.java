/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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
    public void testDeleteReservationWithNegativeNumber(){}

    /**
     * Test of DeleteReservation method, of class DeleteReservationController.
     */
    /*@Test
    public void testDeleteReservationWithNegativeNumber(){
        System.out.println("DeleteReservation");
        int reservationId = -1;
        String clubName="marias";
        int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
        //DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
        //Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }*/

    /**
     * Test of deleteReservation method, of class DeleteReservationController.
     */
     /*@Test
    public void testDeleteReservationWithWrongBoth() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = -1;
        String clubName="mar";
        //DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        //Reservation result = instance.deleteReservation(clubName,reservationId);
       // Assert.assertEquals(clubName,result.getClubName());
        //Assert.assertEquals(reservationId, result.getReservationId());
        //Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }*/
    /*@Test
    public void testDeleteReservationWithCorrectNumber(){
        System.out.println("deleteReservation");
        int reservationId = 5;
        String clubName="marias";
        //DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoSuccess());
        //Reservation result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubName,result.getClubName());
        //Assert.assertEquals(reservationId, result.getReservationId());
       // Assert.assertEquals(false, result.isCancelSuccessful());
    }*/
    
      /*@Test
    public void testDeleteReservationWithZero() throws Exception {
        System.out.println("deleteReservation");
        
        int reservationId = 0;
        String clubName="marias";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());
    }
     @Test
    public void testDeleteReservationWithHugeId() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="marias";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
     @Test
    public void testDeleteReservationWithHugeIdAndSmallName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="mar";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
      @Test
    public void testDeleteReservationWithBothHuge() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="mariaskkkkkklllw";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
      @Test
    public void testDeleteReservationWithHugeNameAndSmallId() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = -5;
        String clubName="mariaskkkkkklllw";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test
    public void testDeleteReservationWithSmallName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 10;
        String clubName="mar";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
      @Test
    public void testDeleteReservationWithHugeName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 10;
        String clubName="mariaskkkkkklllw";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
      @Test
    public void testDeleteReservationWithZeroIdAndSmallName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 0;
        String clubName="mar";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
      @Test
    public void testDeleteReservationWithHugeNameAndZeroId() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId =0;
        String clubName="mariaskkkkkklllw";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
      @Test
       public void testDeleteReservationWithZeroIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 0;
        String clubName=null;
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
       
    
      @Test
       public void testDeleteReservationWithSmallIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = -1;
        String clubName=null;
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }   
        @Test
       public void testDeleteReservationWithHugeIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 1000000000;
        String clubName=null;
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }   
        @Test
       public void testDeleteReservationWithEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 10;
        String clubName=null;
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }   */
       
}

