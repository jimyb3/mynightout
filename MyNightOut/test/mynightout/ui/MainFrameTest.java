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
public class MainFrameTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public MainFrameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         setAdapter(new MainClassAdapter(MainFrame.class, new String[0]));
    }
    
    @After
    public void tearDown() {
    }

     //-----------------------------GUI Testing---------------------------------------//
    
    
  //Γίνεται Έλεγχος εμφάνισης της φόρμας 
    @Test
    public void testvisibility() {
          
        Window window = getMainWindow();
        
        assertTrue(window.isVisible());         
        
        
    }
    
    
    
    
     //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel
   @Test
    public void testjpanelfaqvisibility() {
        
      Window window = getMainWindow();
      
      
      Panel fpan = window.getPanel("null.contentPane");
      
      
      assertTrue(fpan.isVisible()); 
                   
    }
    
    
    //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel  από το κουμπί "Έξοδος" της φόρμας
    
    
    @Test
    public void testkataxkrafaqvisibility() {
        
      Window window = getMainWindow();
      
      Button conFaq = window.getButton("Έξοδος");
      Panel cpan = window.getPanel("null.contentPane");
      
      conFaq.click();
      
      assertTrue(cpan.isVisible()); 
                   
    }
    
    
    
    
    
    
    //Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Είσοδος χρήστη").isVisible());
        assertEquals(true, window.getButton("Είσοδος επιχειρηματία").isVisible());
	assertEquals(true, window.getButton("Δημιουργία Καταστήματος").isVisible());
	assertEquals(true, window.getButton("FAQ/Help").isVisible());
    }
    
    
    
    
}
