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
import org.uispec4j.Trigger;
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;
import org.uispec4j.interception.WindowHandler;
import org.uispec4j.interception.WindowInterceptor;

/**
 *
 * @author panos
 */
public class NightclubMainFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public NightclubMainFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         setAdapter(new MainClassAdapter(NightclubMainForm.class, new String[0]));
    }
    
    @After
    public void tearDown() {
    }

     //-----------------------------GUI Testing---------------------------------------//
    
    
  //Έλεγχος εμφάνισης φόρμας ή αν η φόρμα εμποδίζεται δυναμικά από κάποια 
    //κλάση και εσφαλμένως δεν εμφανίζεται γενικά.
    @Test
    public void testvisibility() {
          
        Window window = getMainWindow();
        
        assertTrue(window.isVisible());         
        
        
    }
    
    
    
    
   
    
    
    //Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Εμφάνιση προμηθευτών").isVisible());
        assertEquals(true, window.getButton("Μέρες κλειστό").isVisible());
	assertEquals(true, window.getButton("Πληρότητα Καταστήματος").isVisible());
	assertEquals(true, window.getButton("Διαγραφή κράτησης").isVisible());
	assertEquals(true, window.getButton("Αλλαγή στην κάτοψη").isVisible());
	assertEquals(true, window.getButton("Διάστημα κλειστό").isVisible());
	assertEquals(true, window.getButton("Εμφάνιση/επεξεργασία κάβας").isVisible());
	assertEquals(true, window.getButton("Κλείσιμο").isVisible());
	assertEquals(true, window.getButton("Αποσύνδεση").isVisible());
	
    }
    
    
    
    
}
