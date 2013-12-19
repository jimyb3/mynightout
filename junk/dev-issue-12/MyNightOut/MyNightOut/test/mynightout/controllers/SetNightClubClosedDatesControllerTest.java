/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import mynightout.entity.Nightclub;
import mynightout.ui.ConfirmNightClubClosedDatesForm;
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
public class SetNightClubClosedDatesControllerTest {

    public SetNightClubClosedDatesControllerTest() {
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
     * Test of setClubClosedDates method, of class
     * SetNightClubClosedDatesController.
     */
    @Test
    public void SetClubClosedDatesSuccessful() {
        System.out.println("setClubClosedDatesSuccessful");
        String clubName = "Vogue";
        String closedFromDate = "17/12/2013";
        String closedThroughDate = "25/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFrom = new Date();
        Date closedThrough = new Date();
        try {
            Date Date = (Date) formatter.parseObject(closedFromDate);
            closedFrom = Date;
            Date = (Date) formatter.parseObject(closedThroughDate);
            closedThrough = Date;
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, ex);

        }

        SetNightClubClosedDatesController instance = new SetNightClubClosedDatesController();
        Nightclub expResult = new Nightclub(closedFrom, closedThrough);
        Nightclub result = instance.setClubClosedDates(clubName, closedFrom, closedThrough);
        assertEquals(expResult.getClosedFrom(), result.getClosedFrom());
        assertEquals(expResult.getClosedThrough(), result.getClosedThrough());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void SetClubClosedDatesNoClubName() {
        System.out.println("setClubClosedDatesNoClubName");
        String clubName = "";
        String closedFromDate = "17/12/2013";
        String closedThroughDate = "25/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFrom = new Date();
        Date closedThrough = new Date();
        try {
            Date Date = (Date) formatter.parseObject(closedFromDate);
            closedFrom = Date;
            Date = (Date) formatter.parseObject(closedThroughDate);
            closedThrough = Date;
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, ex);

        }

        SetNightClubClosedDatesController instance = new SetNightClubClosedDatesController();
        Nightclub expResult = new Nightclub(closedFrom, closedThrough);
        Nightclub result = instance.setClubClosedDates(clubName, closedFrom, closedThrough);
        assertEquals(expResult.getClosedFrom(), result.getClosedFrom());
        assertEquals(expResult.getClosedThrough(), result.getClosedThrough());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void SetClubClosedDatesWrongDateClosedThroughBeforeToday() {
        System.out.println("SetClubClosedDatesWrongDateClosedThroughBeforeToday");
        String clubName = "Vogue";
        String closedFromDate = "17/12/2013";
        String closedThroughDate = "5/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFrom = new Date();
        Date closedThrough = new Date();
        try {
            Date Date = (Date) formatter.parseObject(closedFromDate);
            closedFrom = Date;
            Date = (Date) formatter.parseObject(closedThroughDate);
            closedThrough = Date;
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, ex);

        }

        SetNightClubClosedDatesController instance = new SetNightClubClosedDatesController();
        Nightclub expResult = new Nightclub(closedFrom, closedThrough);
        Nightclub result = instance.setClubClosedDates(clubName, closedFrom, closedThrough);
        assertEquals(expResult.getClosedFrom(), result.getClosedFrom());
        assertEquals(expResult.getClosedThrough(), result.getClosedThrough());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void SetClubClosedDatesWrongDateClosedThroughBeforeClosedFrom() {
        System.out.println("SetClubClosedDatesWrongDateClosedThroughBeforeClosedFrom");
        String clubName = "Vogue";
        String closedFromDate = "30/12/2013";
        String closedThroughDate = "26/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFrom = new Date();
        Date closedThrough = new Date();
        try {
            Date Date = (Date) formatter.parseObject(closedFromDate);
            closedFrom = Date;
            Date = (Date) formatter.parseObject(closedThroughDate);
            closedThrough = Date;
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, ex);

        }

        SetNightClubClosedDatesController instance = new SetNightClubClosedDatesController();
        Nightclub expResult = new Nightclub(closedFrom, closedThrough);
        Nightclub result = instance.setClubClosedDates(clubName, closedFrom, closedThrough);
        assertEquals(expResult.getClosedFrom(), result.getClosedFrom());
        assertEquals(expResult.getClosedThrough(), result.getClosedThrough());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void SetClubClosedDatesWrongDateClosedThroughAndNoClubName() {
        System.out.println("SetClubClosedDatesWrongDateClosedThroughAndNoClubName");
        String clubName = "";
        String closedFromDate = "30/12/2013";
        String closedThroughDate = "26/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFrom = new Date();
        Date closedThrough = new Date();
        try {
            Date Date = (Date) formatter.parseObject(closedFromDate);
            closedFrom = Date;
            Date = (Date) formatter.parseObject(closedThroughDate);
            closedThrough = Date;
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, ex);

        }

        SetNightClubClosedDatesController instance = new SetNightClubClosedDatesController();
        Nightclub expResult = new Nightclub(closedFrom, closedThrough);
        Nightclub result = instance.setClubClosedDates(clubName, closedFrom, closedThrough);
        assertEquals(expResult.getClosedFrom(), result.getClosedFrom());
        assertEquals(expResult.getClosedThrough(), result.getClosedThrough());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void SetClubClosedDatesWrongClubName() {
        System.out.println("SetClubClosedDatesWrongClubName");
        String clubName = "sfasdfa";
        String closedFromDate = "30/12/2013";
        String closedThroughDate = "26/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFrom = new Date();
        Date closedThrough = new Date();
        try {
            Date Date = (Date) formatter.parseObject(closedFromDate);
            closedFrom = Date;
            Date = (Date) formatter.parseObject(closedThroughDate);
            closedThrough = Date;
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, ex);

        }

        SetNightClubClosedDatesController instance = new SetNightClubClosedDatesController();
        Nightclub expResult = new Nightclub(closedFrom, closedThrough);
        Nightclub result = instance.setClubClosedDates(clubName, closedFrom, closedThrough);
        assertEquals(expResult.getClosedFrom(), result.getClosedFrom());
        assertEquals(expResult.getClosedThrough(), result.getClosedThrough());
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test(expected=NullPointerException.class)
    public void SetClubClosedDatesWrongClubNameAndWrongDate() {
        System.out.println("SetClubClosedDatesWrongClubNameAndWrongDate");
        String clubName = "sfasdfa";
        String closedFromDate = "30/12/2013";
        String closedThroughDate = "26/12/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date closedFrom = new Date();
        Date closedThrough = new Date();
        try {
            Date Date = (Date) formatter.parseObject(closedFromDate);
            closedFrom = Date;
            Date = (Date) formatter.parseObject(closedThroughDate);
            closedThrough = Date;
        } catch (ParseException ex) {
            Logger.getLogger(ConfirmNightClubClosedDatesForm.class.getName()).log(Level.SEVERE, null, ex);

        }

        SetNightClubClosedDatesController instance = new SetNightClubClosedDatesController();
        Nightclub expResult = new Nightclub(closedFrom, closedThrough);
        Nightclub result = instance.setClubClosedDates(clubName, closedFrom, closedThrough);
        assertEquals(expResult.getClosedFrom(), result.getClosedFrom());
        assertEquals(expResult.getClosedThrough(), result.getClosedThrough());
        // TODO review the generated test code and remove the default call to fail.
    }

}
