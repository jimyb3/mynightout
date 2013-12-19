/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import junit.framework.AssertionFailedError;
import mynightout.entity.Nightclub;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dimitris
 */
public class SetNightClubDaysClosedControllerTest {
    
    public SetNightClubDaysClosedControllerTest() {
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
     * Test of setClubClosedDates method, of class SetNightClubDaysClosedController.
     */
    @Test
    public void testSetClubClosedDatesSuccessful() {
        System.out.println("SetClubClosedDatesSuccessful");
        String clubName = "Vogue";
        String daysClosed = ",3,4,7";
        SetNightClubDaysClosedController instance = new SetNightClubDaysClosedController();
        Nightclub expResult = new Nightclub(daysClosed);
        Nightclub result = instance.setClubClosedDates(clubName, daysClosed);
        assertEquals(expResult.getDaysClosed(), result.getDaysClosed());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void testSetClubClosedDatesNoClubName() {
        System.out.println("SetClubClosedDatesNoClubName");
        String clubName = "";
        String daysClosed = ",3,4,7";
        SetNightClubDaysClosedController instance = new SetNightClubDaysClosedController();
        Nightclub expResult = new Nightclub(daysClosed);
        Nightclub result = instance.setClubClosedDates(clubName, daysClosed);
        assertEquals(expResult.getDaysClosed(), result.getDaysClosed());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testSetClubClosedDatesNoDaysClosed() {
        System.out.println("SetClubClosedDatesNoDaysClosed");
        String clubName = "Vogue";
        String daysClosed = "";
        SetNightClubDaysClosedController instance = new SetNightClubDaysClosedController();
        Nightclub expResult = new Nightclub(daysClosed);
        Nightclub result = instance.setClubClosedDates(clubName, daysClosed);
        assertEquals(expResult.getDaysClosed(), result.getDaysClosed());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void testSetClubClosedDatesNoClubNameNoDaysClosed() {
        System.out.println("SetClubClosedDatesNoClubNameNoDaysClosed");
        String clubName = "";
        String daysClosed = "";
        SetNightClubDaysClosedController instance = new SetNightClubDaysClosedController();
        Nightclub expResult = new Nightclub(daysClosed);
        Nightclub result = instance.setClubClosedDates(clubName, daysClosed);
        assertEquals(expResult.getDaysClosed(), result.getDaysClosed());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void testSetClubClosedDatesWrongClubName() {
        System.out.println("SetClubClosedDatesWrongClubName");
        String clubName = "sdfdfsdfasdfsad";
        String daysClosed = ",3,5,6";
        SetNightClubDaysClosedController instance = new SetNightClubDaysClosedController();
        Nightclub expResult = new Nightclub(daysClosed);
        Nightclub result = instance.setClubClosedDates(clubName, daysClosed);
        assertEquals(expResult.getDaysClosed(), result.getDaysClosed());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void testSetClubClosedDatesWrongClubNameNoDaysClosed() {
        System.out.println("SetClubClosedDatesWrongClubName");
        String clubName = "sdfdfsdfasdfsad";
        String daysClosed = "";
        SetNightClubDaysClosedController instance = new SetNightClubDaysClosedController();
        Nightclub expResult = new Nightclub(daysClosed);
        Nightclub result = instance.setClubClosedDates(clubName, daysClosed);
        assertEquals(expResult.getDaysClosed(), result.getDaysClosed());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void testSetClubClosedDatesWrongClubNameWrongDaysClosed() {
        System.out.println("SetClubClosedDatesWrongClubName");
        String clubName = "sdfdfsdfasdfsad";
        String daysClosed = ",4,8,9,43,43";
        SetNightClubDaysClosedController instance = new SetNightClubDaysClosedController();
        Nightclub expResult = new Nightclub(daysClosed);
        Nightclub result = instance.setClubClosedDates(clubName, daysClosed);
        assertEquals(expResult.getDaysClosed(), result.getDaysClosed());
        // TODO review the generated test code and remove the default call to fail.
    }
}
