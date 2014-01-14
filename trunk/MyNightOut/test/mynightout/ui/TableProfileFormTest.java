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
public class TableProfileFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public TableProfileFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         setAdapter(new MainClassAdapter(TableProfileForm.class, new String[0]));
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

 	assertTrue(window.containsLabel("Είναι η κατοψη όπως θέλετε;"));  
        assertTrue(window.containsLabel("jLabel2"));
        assertTrue(window.containsLabel("jLabel3"));
        assertTrue(window.containsLabel("jLabel4"));
        assertTrue(window.containsLabel("jLabel5"));
        assertTrue(window.containsLabel("jLabel6"));
        assertTrue(window.containsLabel("jLabel7"));
        assertTrue(window.containsLabel("jLabel8"));
        
	
	
        
	     
   }
    
    
    
    
   
    
   //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel
      @Test
    public void testprofilfaqvisibility() {
        
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