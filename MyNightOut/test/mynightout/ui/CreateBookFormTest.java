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
 * @author panos
 */
public class CreateBookFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public CreateBookFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(CreateBookForm.class, new String[0]));
    }
    
    @After
    public void tearDown() {
    }

   //-----------------------------GUI Testing UISPEC4J---------------------------------------//
    
    
       
  //Γίνεται Έλεγχος εμφάνισης της φόρμας 
    @Test
    public void testvisibility() {
          
        Window window = getMainWindow();
        
        assertTrue(window.isVisible());         
        
        
    }
    
    
    
     
   //Έλεγχος εμφάνισης των διάφορων JLabels της φόρμας.
    @Test
    public void testalllabels() {
          
        Window window = getMainWindow();

 	assertTrue(window.containsLabel("εδώ εμφανιζει το ονομα του πελατη"));        
	assertTrue(window.containsLabel("Επιλογή Καταστήματος"));
        assertTrue(window.containsLabel("Αριθμός Ατόμων")); 
	assertTrue(window.containsLabel("Επιλογή Ημερομηνίας"));
	   
	     
   }
    
    //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel  από το κουμπί "Καταχώρηση Κράτησης" της φόρμας
    
    
    @Test
    public void testkataxkrafaqvisibility() {
        
      Window window = getMainWindow();
      
      Button conFaq = window.getButton("Καταχώρηση Κράτησης");
      Panel cpan = window.getPanel("null.contentPane");
      
      conFaq.click();
      
      assertTrue(cpan.isVisible()); 
                   
    }
    
   
    
    
    
    
    //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel
   @Test
    public void testjpanelfaqvisibility() {
        
      Window window = getMainWindow();
      
      
      Panel fpan = window.getPanel("null.contentPane");
      
      
      
      assertTrue(fpan.isVisible()); 
                   
    }
    
    
    
    
    //Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Καταχώρηση Κράτησης").isVisible());
        assertEquals(true, window.getButton("Άκυρο").isVisible());
    }
    
    
    
}
