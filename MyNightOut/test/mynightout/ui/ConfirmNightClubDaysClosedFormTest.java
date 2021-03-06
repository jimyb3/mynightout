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
import org.uispec4j.Button;
import org.uispec4j.Panel;
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;

/**
 *
 * @author Dimitris
 */
public class ConfirmNightClubDaysClosedFormTest extends UISpecTestCase {
    
    static {
        UISpec4J.init();
    }
    
    public ConfirmNightClubDaysClosedFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(ConfirmNightClubDaysClosedForm.class, new String[0]));
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
        assertTrue(window.containsLabel("Είναι σωστές οι παρακάτω μέρες που θα ειναι κλειστό το κατάστημα;"));
        assertTrue(window.containsLabel("Όνομα καταστήματος:"));
        assertTrue(window.containsLabel("nightClubName"));
    }
    
    
     /**
 *
 * @author panos
 */
    
    
    /**
     * Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
     */
    @Test
    public void testAllButtons() {
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Ναι").isVisible());
        assertEquals(true, window.getButton("Όχι").isVisible());
    }
    
    
     //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel
   @Test
    public void testjpanelfaqvisibility() {
        
      Window window = getMainWindow();
      
      
      Panel fpan = window.getPanel("null.contentPane");
      
  
      assertTrue(fpan.isVisible()); 
                   
    }
    
    //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel  από το κουμπί "Ναι" της φόρμας
    @Test
    public void testnaifaqvisibility() {
        
      Window window = getMainWindow();
      
      Button conFaq = window.getButton("Ναι");
      Panel cpan = window.getPanel("null.contentPane");
      
      conFaq.click();
      
      assertTrue(cpan.isVisible()); 
                   
    }
    
    
    
}
