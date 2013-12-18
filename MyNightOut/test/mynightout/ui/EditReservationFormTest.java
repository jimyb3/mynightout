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
public class EditReservationFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public EditReservationFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         setAdapter(new MainClassAdapter(EditReservationForm.class, new String[0]));
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
    
    
    
    
   //Έλεγχος εμφάνισης των διάφορων JLabels της φόρμας.
    @Test
    public void testalllabels() {
          
        Window window = getMainWindow();

 	assertTrue(window.containsLabel("Εδώ βάλτε τα δεδομένα της κράτησης που έχετε κανει"));        
	assertTrue(window.containsLabel("Εδώ βάλτε τις αλλαηγές που θέλετε να κάνετε"));
	assertTrue(window.containsLabel("Όνομα πελάτη"));
	assertTrue(window.containsLabel("Όνομα καταστήματος"));
	assertTrue(window.containsLabel("ID κράτησης"));
	assertTrue(window.containsLabel("Ημερομηνία κράτησης"));
	assertTrue(window.containsLabel("Πλήθος ατόμων"));
	assertTrue(window.containsLabel("Ημερομηνία κράτησης"));
	assertTrue(window.containsLabel("Πλήθος ατόμων"));
	
        
	     
   }
    
    
    
    
    //Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Επεξεργασία").isVisible());
        assertEquals(true, window.getButton("Ακύρωση").isVisible());
    }
    
    
    
    
}