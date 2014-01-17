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
 * @author Mustaine
 */
public class StoreRegisterFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public StoreRegisterFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(StoreRegisterForm.class, new String[0]));
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
        
        assertTrue(window.containsLabel("Εγγραφή εμπόρου")); 
        assertTrue(window.containsLabel("Επιθυμητό όνομα χρήστη:"));
        assertTrue(window.containsLabel("Επιθυμητός κωδικός"));
        assertTrue(window.containsLabel("Στοιχεία Λογαριασμού"));
        assertTrue(window.containsLabel("Στοιχεία Εταιρείας"));              
        assertTrue(window.containsLabel("Επωνυμία"));
        assertTrue(window.containsLabel("Διεύθυνση"));
        assertTrue(window.containsLabel("Ταχυδρομικός Κώδικας"));
        assertTrue(window.containsLabel("Τηλέφωνο 1"));
        assertTrue(window.containsLabel("Τηλέφωνο 2"));
        assertTrue(window.containsLabel("Fax"));
        assertTrue(window.containsLabel("Κινητό"));
        assertTrue(window.containsLabel("Email")); 
       
   }
    
    
    
    
    
    /**
     * Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
     */
    @Test
    public void testAllButtons() {
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Αποστολή Αίτησης").isVisible());
        assertEquals(true, window.getButton("Πίσω").isVisible());
    }
    
    
    
     //Έλεγχος αν εμφανίζεται δυναμικά το αντικείμενο JPanel
    
    
      @Test
    public void testjframefaqvisibility() {
        
      Window window = getMainWindow();
      
      
      Panel fpan = window.getPanel("null.contentPane");
      
      
      
      assertTrue(fpan.isVisible()); 
                   
    }
    
    
    
    
    //Έλεγχος τπυ κουμπιού "Αποστολή Αίτησης" και έλεγχος αν όντως δυναμικά 
    //ανοίγει ένα μήνυμα τύπου JOptionPane.
//    @Test
//    public void testsendMailButton() {
//        
//        Window window = getMainWindow();
//
//        WindowInterceptor.init(window.getButton("Αποστολή Αίτησης").triggerClick()).process(new WindowHandler() {
//            @Override
//            public Trigger process(Window dialog) {
//                assertTrue(dialog.titleEquals("Success")); 
//            return dialog.getButton("OK").triggerClick();
//            }
//        })
//       .run();
//  
//   }
    
    
    
}
