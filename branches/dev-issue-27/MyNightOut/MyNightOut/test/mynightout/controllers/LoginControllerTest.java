/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.model.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ioanna
 */
public class LoginControllerTest {
    
    public LoginControllerTest() {
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
     * Test of Login method, of class LoginController.
     */
    @Test
    public void testSuccessfulLogin() {
        
        String userName = "user1";
        String passWord = "123456";
        LoginController instance = new LoginController();
        User expResult = new User("user1", "123456");
        User result = instance.Login(userName, passWord);
        Assert.assertEquals(expResult.getUserName() , result.getUserName()); 
        Assert.assertEquals(expResult.getPassWord() , result.getPassWord()); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test (expected=IllegalArgumentException.class)
    public void testFailedLogin() {
        
        String userName = "user1";
        String passWord = "_-_-_-";
        LoginController instance = new LoginController();
        User expResult = new User("user1", "123456");
        User result = instance.Login(userName, passWord);
        //Assert. assertEquals(expResult.getUserName() , result.getUserName());
        //Assert. assertEquals(expResult.getPassWord() , result.getPassWord())); 
               
           }
       } 
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    

