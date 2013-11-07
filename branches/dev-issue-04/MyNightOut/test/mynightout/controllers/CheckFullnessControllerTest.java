/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.MockCheckFullnessDaoSucceeded;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mustaine
 */
public class CheckFullnessControllerTest {
    
    public CheckFullnessControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testCheckFullnessSucceeded() throws Exception {
        System.out.println("CheckFullnessNewSuccess");
        String storeName = "rockbarserres";
        boolean StoreFull;
        
        CheckFullnessController instance = new CheckFullnessController(new MockCheckFullnessDaoSucceeded());
        
        NightClub result = instance.checkFullnessNew(storeName);
        Assert.assertEquals(storeName, result.getstoreName());
        Assert.assertEquals(true, result.isStoreFull());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    
    @Test
    public void testCheckFullnessFailed() throws Exception {
        System.out.println("CheckFullnessNewFail");
        String storeName = "rockbarserres";
        boolean StoreFull;
        
        CheckFullnessController instance = new CheckFullnessController(new MockCheckFullnessDaoSucceeded());
        
        NightClub result = instance.checkFullnessNew(storeName);
        Assert.assertEquals(storeName, result.getstoreName());
        Assert.assertEquals(false, result.isStoreFull());
        // TODO review the generated test code and remove the default call to fail.
        
    }
}
