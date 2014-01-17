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
public class ContactAdminFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public ContactAdminFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
                setAdapter(new MainClassAdapter(ContactAdminForm.class, new String[0]));

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
        
        assertTrue(window.containsLabel("Frequently Asked Questions ")); 
        assertTrue(window.containsLabel("Αντιμετωπίζω πρόβλημα με:"));
        assertTrue(window.containsLabel("Περιγράψτε το πρόβλημα που αντιμετωπίζετε:"));
        
       
   }
   
    
    
   //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel  από το κουμπί "Κράτηση" της φόρμας. 
   @Test
    public void testreservationfaqvisibility() {
        
      Window window = getMainWindow();
      
      Button resFaq = window.getButton("Κράτηση");
      Panel fpan = window.getPanel("null.contentPane");
      
      resFaq.click();
      
      assertTrue(fpan.isVisible()); 
                   
    }
    
    
    
    //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel  από το κουμπί "Σύνδεση" της φόρμας.
    @Test
    public void testconnectfaqvisibility() {
        
      Window window = getMainWindow();
      
      Button conFaq = window.getButton("Σύνδεση");
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
    
    
    
    
    
   //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel  από το κουμπί "Άλλο" της φόρμας.
    @Test
    public void testotherfaqvisibility() {
        
      Window window = getMainWindow();
      
      Button conFaq = window.getButton("Άλλο");
      Panel cpan = window.getPanel("null.contentPane");
      
      conFaq.click();
      
      assertTrue(cpan.isVisible()); 
                   
    }
    
    
    
    
    //Έλεγχος τπυ κουμπιού "Αποστολή Αίτησης" και έλεγχος αν όντως δυναμικά 
    //ανοίγει ένα μήνυμα τύπου JOptionPane.
    @Test
    public void testsendMailButton() {
        
        Window window = getMainWindow();

        WindowInterceptor.init(window.getButton("Αποστολή").triggerClick()).process(new WindowHandler() {
            @Override
            public Trigger process(Window dialog) {
                assertTrue(dialog.titleEquals("Success")); 
            return dialog.getButton("OK").triggerClick();
            }
        })
        .run();
  
   }
    
    

    
}
