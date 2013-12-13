/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.MockDeleteDaoFailure;
import mynightout.dao.NightClubDao;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;
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
   
     @Test (expected=NullPointerException.class)
    public void testDeleteReservationSuccess(){
        System.out.println("deleteReservation");
        int reservationId = 5;
        String clubName="marias";
        int clubId= new NightClubDao(). getNightClubDataByClubName(clubName).getClubId();
        DeleteReservationController instance = new DeleteReservationController();
        ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        
        //  Assert.assertEquals(clubId,result.getClubId());
     ///   Assert.assertEquals(reservationId, result.getReservationId());
       
    
    }
    
    
    
    @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithNegativeNumber(){
        System.out.println("DeleteReservation");
        int reservationId = -1;
        String clubName="marias";
       int clubId= new NightClubDao(). getNightClubDataByClubName(clubName).getClubId();
        DeleteReservationController instance = new DeleteReservationController();
        ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
       
    }

    /**
     * Test of deleteReservation method, of class DeleteReservationController.
     */
    @Test (expected=NullPointerException.class)
    public void testDeleteReservationWithWrongBoth() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = -1;
        String clubName="mar";
        int clubId= new NightClubDao(). getNightClubDataByClubName(clubName).getClubId();
        DeleteReservationController instance = new DeleteReservationController();
        ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
        
    }
   
    
      @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithZero() throws Exception {
        System.out.println("deleteReservation");
        
        int reservationId = 0;
        String clubName="marias";
      int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
       
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
     @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithHugeId() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="marias";
        int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
     
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
    
     @Test(expected=IllegalArgumentException.class)
    public void testDeleteReservationWithHugeIdAndSmallName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="mar";
          int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
      
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
        
    }
      @Test(expected=IllegalArgumentException.class)
    public void testDeleteReservationWithBothHuge() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 1000000000;
        String clubName="mariaskkkkkklllw";
         int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
      
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
    
      @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithHugeNameAndSmallId() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = -5;
        String clubName="mariaskkkkkklllw";
         int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
       
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
    @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithSmallName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 10;
        String clubName="mar";
        int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
       
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
    
      @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithHugeName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 10;
        String clubName="mariaskkkkkklllw";
      int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
       
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
    
      @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithZeroIdAndSmallName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId = 0;
        String clubName="mar";
         int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
         
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
    
      @Test (expected=IllegalArgumentException.class)
    public void testDeleteReservationWithHugeNameAndZeroId() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId =0;
        String clubName="mariaskkkkkklllw";
       int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
       
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
      @Test (expected=NullPointerException.class)
       public void testDeleteReservationWithZeroIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 0;
        String clubName=null;
        int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
        
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }
       
    
      @Test (expected=NullPointerException.class)
       public void testDeleteReservationWithSmallIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = -1;
        String clubName=null;
        int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
      
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }   
        @Test (expected=NullPointerException.class)
       public void testDeleteReservationWithHugeIdAndEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 1000000000;
        String clubName=null;
       int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
         
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }   
        @Test (expected=NullPointerException.class)
       public void testDeleteReservationWithEmptyName() throws Exception {
        System.out.println("DeleteReservation");
        int reservationId;
        reservationId = 10;
        String clubName=null;
        int clubId= new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
      
        DeleteReservationController instance = new DeleteReservationController();
       ReservationPk result = instance.deleteReservation(clubName,reservationId);
       
        ReservationPk expResult = new ReservationPk();
        expResult.setUserId(clubId);
        expResult.setReservationId(reservationId);
       
        Assert.assertEquals(expResult.getClubId(), result.getClubId());
        Assert.assertEquals(expResult.getReservationId(),result.getReservationId());
   
        


       // DeleteReservationController instance = new DeleteReservationController();
        //ReservationPk result = instance.deleteReservation(clubName,reservationId);
        //Assert.assertEquals(clubId,result.getClubId());
        //Assert.assertEquals(reservationId, result.getReservationId());
    }   
       
}

