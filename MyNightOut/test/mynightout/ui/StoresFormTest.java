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
public class StoresFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public StoresFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(StoresForm.class, new String[0]));
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
    
    
    
    
  // Γίνεται Έλεγχος σχετκά με το αν εμφανίζεται δυναμικά το αντικείμενο JPanel  από το κουμπί "Back" της φόρμας. 
   @Test
    public void testBackfaqvisibility() {
        
      Window window = getMainWindow();
      
      Button resFaq = window.getButton("Back");
      Panel fpan = window.getPanel("null.contentPane");
      
      resFaq.click();
      
      assertTrue(fpan.isVisible()); 
                   
    }
    
    
      
     
    //Ελενχος εμφανίζεται κανονικά το κουμπί "Exit".
    
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Exit").isVisible());
   
        
        
    }
       
    
}
