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
public class ConfirmUpdateCellarFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public ConfirmUpdateCellarFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(ConfirmUpdateCellarForm.class, new String[0]));
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
        
	assertTrue(window.containsLabel("Οι παρακάτω τιμές είναι σωστές;"));
        assertTrue(window.containsLabel("Vodka")); 
	assertTrue(window.containsLabel("Whiskey"));
	assertTrue(window.containsLabel("Wine"));    
	assertTrue(window.containsLabel("Liqueur"));
        assertTrue(window.containsLabel("Rum")); 
	assertTrue(window.containsLabel("Beer")); 
        assertTrue(window.containsLabel("Όνομα καταστήματος:")); 
        
        
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
        assertEquals(true, window.getButton("Ναι").isVisible());
        assertEquals(true, window.getButton("Όχι").isVisible());
    }
    
    
    
    
    
}
