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
public class UpdateCellarControllerTest {
    
    public UpdateCellarControllerTest() {
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
     * Test of updateCellar method, of class UpdateCellarController.
     */
    @Test(expected=NullPointerException.class)
    public void testUpdateCellar() {
        System.out.println("updateCellar");
        String clubName = "";
        int vodka = 0;
        int whiskey = 0;
        int wine = 0;
        int liqueur = 0;
        int rum = 0;
        int tequila = 0;
        int beer = 0;
        UpdateCellarController instance = new UpdateCellarController();
        Cellar expResult = null;
        Cellar result = instance.updateCellar(clubName, vodka, whiskey, wine, liqueur, rum, tequila, beer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
