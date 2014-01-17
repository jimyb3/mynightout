/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.ui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.uispec4j.Panel;
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;

/**
 *
 * @author Dimitris
 */
public class SetNightClubDaysClosedFormTest extends UISpecTestCase {
    
    static {
        UISpec4J.init();
    }
    
    public SetNightClubDaysClosedFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(SetNightClubDaysClosedForm.class, new String[0]));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Αν εμφανίζεται κανονικά η φόρμα.
     */
    @Test
    public void testVisibility() {
        System.out.println("testVisibility");
        Window window = getMainWindow();
        assertTrue(window.isVisible());
    }
    
    /**
     * Αν εμφανίζονται κανονικά όλα τα labels.
     */
    @Test
    public void testAllLabels() {
        System.out.println("testAllLabels");
        Window window = getMainWindow();
        //assertTrue(window.containsLabel("Όνομα καταστήματος:"));
        assertTrue(window.containsLabel("Επέλεξε τις μέρες που θα είναι κλειστό το κατάστημα."));
    }

    /**
     * Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
     */
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("ΟΚ").isVisible());
        assertEquals(true, window.getButton("Άκυρο").isVisible());
    }
    
    /**
     * Αν εμφανίζoνται κανονικά ολα τα checkboxes.
     */
    @Test
    public void testAllCheckBoxes() {
        System.out.println("testAllCheckBoxes");
        Window window = getMainWindow();
        assertEquals(true, window.getCheckBox("1").isVisible());
        assertEquals(true, window.getCheckBox("2").isVisible());
        assertEquals(true, window.getCheckBox("3").isVisible());
        assertEquals(true, window.getCheckBox("4").isVisible());
        assertEquals(true, window.getCheckBox("5").isVisible());
        assertEquals(true, window.getCheckBox("6").isVisible());
        assertEquals(true, window.getCheckBox("7").isVisible());
    }
    
    
    
    
       /**
 *
 * @author panos
 */
    
    
    //Έλεγχος αν εμφανίζεται δυναμικά το  JPanel
    
      @Test
    public void testjframefaqvisibility() {
        
      Window window = getMainWindow();
      
      Panel fpan = window.getPanel("null.contentPane");
      
      assertTrue(fpan.isVisible()); 
                   
      
    }   
    
    
    
    
}
