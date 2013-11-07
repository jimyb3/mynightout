/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maria
 */
public class DeleteReservationTest {
    
    public DeleteReservationTest() {
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

    /**
     * Test of DeleteFromList method, of class deleteReservation.
     */
    @Test
    public void testIfListIsEmpty() {
        System.out.println("IfListIsEmpty");
        ArrayList<String> temp = new ArrayList<String>();
        int line = 0;
        ArrayList<String> expResult = new ArrayList<String>();
        ArrayList<String> result = DeleteReservation.DeleteFromList(temp, line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    

 @Test
    public void testIfListContainsReservations() {
        System.out.println("IsListContainsReservation");
        ArrayList<String> temp =new ArrayList<String>();
        String input1="55555 Mary";
        String input2="99999 John";
        
        temp.add(input1);
        temp.add(input2);
        
        int line = 0;
        
        
        ArrayList<String> expResult = new ArrayList<String>();
        expResult.add(input2);
        ArrayList<String> result = DeleteReservation.DeleteFromList(temp, line);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of DeleteFromList method, of class DeleteReservation.
     */
    @Test
    public void testDeleteFromList() {
        System.out.println("DeleteFromList");
        ArrayList<String> temp = null;
        int line = 0;
        ArrayList<String> expResult = null;
        ArrayList<String> result = DeleteReservation.DeleteFromList(temp, line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
    
    
    
} 