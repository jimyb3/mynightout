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
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;

/**
 *
 * @author panos
 */
public class CreateNewUserFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public CreateNewUserFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(CreateNewUserForm.class, new String[0]));
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
        
	assertTrue(window.containsLabel("Όνομα"));
        assertTrue(window.containsLabel("Επώνυμο")); 
	assertTrue(window.containsLabel("Username"));
	assertTrue(window.containsLabel("Password"));    
	assertTrue(window.containsLabel("<html>Αριθμός <br></br>τηλεφώνου</html>"));
        assertTrue(window.containsLabel("E-mail")); 
	
        
        
   }
    
    
    
    
    //Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Δημιουργία λογαριασμού").isVisible());
        assertEquals(true, window.getButton("Καθαρισμός πεδίων").isVisible());
        assertEquals(true, window.getButton("Πίσω").isVisible());
        
    }
    
    
    
    
    
}
