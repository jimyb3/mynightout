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
 * @author Mustaine
 */
public class StoreViewtest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public StoreViewtest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(StoreView.class, new String[0]));
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
        
        assertTrue(window.containsLabel("Πληροφορίες Καταστήματος")); 
               
       
   }
    
    
    
    
//Έλεγχος αν εμφανίζεται δυναμικά το  JPanel
    
      @Test
    public void testjframefaqvisibility() {
        
      Window window = getMainWindow();
      
      Panel fpan = window.getPanel("null.contentPane");
      
      assertTrue(fpan.isVisible()); 
                   
      
    }    
    
    
    
    
    
}
