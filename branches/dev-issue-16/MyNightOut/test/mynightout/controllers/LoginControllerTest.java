/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.MockLoginDaoFailure;
import mynightout.dao.MockLoginDaoSuccess;
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
    public void testLoginSuccess() throws Exception {
        System.out.println("Login Succeeded!!");
        String userName = "loulou";
        String passWord = "123456";
        
        
         LoginController instance = new LoginController(new MockLoginDaoSuccess());

        User result = instance.Login(userName, passWord);
        Assert.assertEquals(userName, result.getUserName());
        Assert.assertEquals(passWord, result.getPassWord());
        Assert.assertEquals(true, result.isloginSuccessful());
        
    }

    @Test
    public void testLoginFailure() throws Exception {
        System.out.println("Login Failed");
        String userName = "loulou";
        String passWord = "123456";

        LoginController instance = new LoginController(new MockLoginDaoFailure());

        User result = instance.Login(userName, passWord);
        Assert.assertEquals(userName, result.getUserName());
        Assert.assertEquals(passWord, result.getPassWord());
        Assert.assertEquals(false, result.isloginSuccessful());
       
    }

}
