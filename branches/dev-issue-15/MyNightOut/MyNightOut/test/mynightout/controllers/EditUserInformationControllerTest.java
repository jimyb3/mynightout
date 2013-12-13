/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.entity.User;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ioanna
 */
public class EditUserInformationControllerTest {

    public EditUserInformationControllerTest() {
    }

    /**
     * Test of getUserInfo method, of class EditUserInformationController.
     */
    @Test
    public void testGetUserInfoSuccess() {
        System.out.println("getUserInfoSuccess");
        String currentUserName = "user1";
        EditUserInformationController instance = new EditUserInformationController();
        User resultUser = instance.getUserInfo(currentUserName);
        User expResult = new User(1,"user1", "123456", "Ioanna", "Koufaki", "6908743750", "user1@yahoo.gr");
        Assert.assertTrue(expResult.equals(resultUser));
        
    }   
    
     @Test //(expected=IllegalArgumentException.class)
    public void testGetUserInfoFailure() {
       System.out.println("getUserInfoFailure");
        String currentUserName = "userlala";
        EditUserInformationController instance = new EditUserInformationController();
        User expResult = new User(1,"user1", "123456", "Ioanna", "Koufaki", "6908743750", "user1@yahoo.gr");
        User resultUser = instance.getUserInfo(currentUserName);       
        Assert.assertFalse(expResult.equals(resultUser));
    }
    /**
     * Test of saveChanges method, of class EditUserInformationController.
     */
    /*  @Test
     public void testSaveChanges() {
     System.out.println("saveChanges");
     String userName = "";
     String password = "";
     String customerName = "";
     String customerLastname = "";
     String telephoneNum = "";
     String email = "";
     EditUserInformationController instance = new EditUserInformationController();
     User expResult = null;
     User result = instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
     assertEquals(expResult, result);
     // TODO review the generated test code and remove the default call to fail.
     fail("The test case is a prototype.");
     }*/
}
