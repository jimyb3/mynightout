/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.MockDeleteDaoFailure;
import mynightout.dao.MockDeleteDaoSuccess;
import mynightout.dao.NightClubDao;
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
    

    /**
     * Test of DeleteReservation method, of class DeleteReservationController.
     */
    @Test(expected=IndexOutOfBoundsException.class)
    public void testDeleteReservationWithNegativeNumber() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = -1;
        String clubName="marias";
        int clubId=new ClubId().getUserIdByUser(clubId).getClubId();
        DeleteReservationController instance = new DeleteReservationController();
        Reservation expResult =new Reservation ("marias", 2); 
        Reservation result=instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(expResult.getClubName(), result.getReservationId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
        // Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of deleteReservation method, of class DeleteReservationController.
     */
     @Test(expected=IndexOutOfBoundsException.class)
    public void testDeleteReservationWithWrongBoth() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = -1;
        String clubName="mar";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
       // Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    @Test(expected=IndexOutOfBoundsException.class)
    public void testDeleteReservationWithCorrectNumber() throws Exception {
        System.out.println("deleteReservation");
        int reservationId = 5;
        String clubName="marias";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoSuccess());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
       // Assert.assertEquals(true, result.isCancelSuccessful());
    }
    
      @Test(expected=IndexOutOfBoundsException.class)
    public void testDeleteReservationWithZero() throws Exception {
        System.out.println("deleteReservation");
        
        int reservationId = 0;
        String clubName="marias";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
       // Assert.assertEquals(false, result.isCancelSuccessful());
    }
    
    //AUTO P EXW PEIRA3EI
     @Test(expected=IndexOutOfBoundsException.class)
    public void testDeleteReservationWithHugeId() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="marias";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation expResult = new Reservation ("marias",3);
        Reservation result=instance.deleteReservation(clubName,reservationId);
       // Assert.assertEquals(clubName,result.getClubName());
       // Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(expResult.getClubName(), result.getReservationId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
        
        // fail("The test case is a prototype.");
    }
    
     @Test(expected=IndexOutOfBoundsException.class)
    public void testDeleteReservationWithHugeIdAndSmallName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="mar";
        DeleteReservationController instance = new DeleteReservationController();
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
      @Test(expected=IndexOutOfBoundsException.class)
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
    
      @Test(expected=IndexOutOfBoundsException.class)
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
    @Test(expected=IndexOutOfBoundsException.class)
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
    
      @Test(expected=IndexOutOfBoundsException.class)
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
    
      @Test(expected=IndexOutOfBoundsException.class)
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
    
      @Test(expected=IndexOutOfBoundsException.class)
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
      @Test(expected=IndexOutOfBoundsException.class)
       public void testDeleteReservationWithZeroIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 0;
        String clubName="";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
       
    
      @Test(expected=IndexOutOfBoundsException.class)
       public void testDeleteReservationWithSmallIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = -1;
        String clubName="";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }   
        @Test(expected=IndexOutOfBoundsException.class)
       public void testDeleteReservationWithHugeIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 1000000000;
        String clubName="";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }   
        @Test(expected=IndexOutOfBoundsException.class)
       public void testDeleteReservationWithEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 10;
        String clubName="";
        DeleteReservationController instance = new DeleteReservationController(new MockDeleteDaoFailure());
        Reservation result = instance.deleteReservation(clubName,reservationId);
        Assert.assertEquals(clubName,result.getClubName());
        Assert.assertEquals(reservationId, result.getReservationId());
        Assert.assertEquals(false, result.isCancelSuccessful());// TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }   
       
}

