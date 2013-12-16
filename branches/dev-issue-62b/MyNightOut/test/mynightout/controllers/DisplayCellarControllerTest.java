/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.entity.Cellar;
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
public class DisplayCellarControllerTest {
    
    public DisplayCellarControllerTest() {
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
     * Test of displayCellar method, of class DisplayCellarController.
     */
    @Test(expected=NullPointerException.class)
    public void testDisplayCellar() {
        System.out.println("displayCellar");
        String clubName = "";
        DisplayCellarController instance = new DisplayCellarController();
        Cellar expResult = null;
        Cellar result = instance.displayCellar(clubName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
