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
 * @author Fuzzaki
 */
public class UserHistoryFormTest extends UISpecTestCase {
    static {
      UISpec4J.init();
    }
    
    public UserHistoryFormTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
         setAdapter(new MainClassAdapter(UserHistoryForm.class, new String[0]));
    }
    
    @After
    public void tearDown() {
    }

     //-----------------------------GUI Testing---------------------------------------//
    
    
  //Έλεγχος εμφάνισης φόρμας. 
    
    @Test
    public void testvisibility() {
        Window window = getMainWindow();
        assertTrue(window.isVisible());         
               
    }
    //Έλεγχος των 2 Labels που υπάρχουν στην UserHistoryForm.
    @Test
    public void testbothlabels() {
          
        Window window = getMainWindow();

 	assertTrue(window.containsLabel("History Viewer"));  
        assertTrue(window.containsLabel("jLabel2"));
    }
    
    
    //Έλεγχος ύπαρξης του "Πισω" Button της form.
    @Test
    public void buttontesting(){
        Window window = getMainWindow();
        assertTrue(window.getButton("backButton").isVisible());
    }
    
    
    //Έλεγχος ύπαρξης του "resultTable" της Φόρμας.
    @Test
    public void tabletesting(){
        Window window = getMainWindow();
        assertTrue(window.getTable("resultTable").isVisible());
    }
}
