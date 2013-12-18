/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.UserDao;
import mynightout.entity.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ioanna
 */
public class EditUserInformationControllerTest {

    public EditUserInformationControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of saveChanges method, of class EditUserInformationController.
     */
    @Test(expected = NullPointerException.class)
    public void testSaveChangesWithNullUserName() {
        System.out.println("testSaveChangesWithNullUserName");
        String userName = null;
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testSaveChangesWithNullPassword() {
        System.out.println("testSaveChangesWithNullPassword");
        String userName = "testUserName";
        String password = null;
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testSaveChangesWithNullCustomerName() {
        System.out.println("testSaveChangesWithNullCustomerName");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = null;
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testSaveChangesNullWithCustomeLastname() {
        System.out.println("testSaveChangesNullWithCustomeLastname");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = null;
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testSaveChangesWithNullTelephone() {
        System.out.println("testSaveChangesWithNullTelephone");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = null;
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = NullPointerException.class)
    public void testSaveChangesWithNullEmail() {
        System.out.println("testSaveChangesWithNullEmail");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = null;
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithNoUserName() {
        System.out.println("testSaveChangesWithNoUserName");
        String userName = "";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = new User("testUsername", password, customerName, customerLastname, telephoneNum, email);
       /* expResult.setUsername(userName);
         expResult.setCustomerName(customerName);
         expResult.setCustomerLastname(customerLastname);
         expResult.setTelephoneNum(telephoneNum);
         expResult.setEmail(email);*/
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithNoPassword() {
        System.out.println("testSaveChangesWithNoPassword");
        String userName = "testUserName";
        String password = "";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithNoCustomerName() {
        System.out.println("testSaveChangesWithNoCustomerName");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithNoCustomeLastname() {
        System.out.println("testSaveChangesWithNoCustomeLastname");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = "";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithNoTelephone() {
        System.out.println("testSaveChangesWithNoTelephone");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithNoEmail() {
        System.out.println("testSaveChangesWithNoEmail");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);
    }

    @Test
    public void testSaveChangesSuccessfull() {
        System.out.println("testSaveChangesSuccessfull");
        String userName = "lalala";
        String password = new UserDao().getUserDataByUsername(userName).getPassword();
        String customerName = new UserDao().getUserDataByUsername(userName).getCustomerName();
        String customerLastname = new UserDao().getUserDataByUsername(userName).getCustomerLastname();
        String telephoneNum = new UserDao().getUserDataByUsername(userName).getTelephoneNum();
        String email = new UserDao().getUserDataByUsername(userName).getEmail();
        EditUserInformationController instance = new EditUserInformationController();
        User expResult = new User(userName, password, customerName, customerLastname, telephoneNum, email);
        User result = instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithWrongEmail() {
        System.out.println("testSaveChangesWithNoEmail");
        /*String userName = "lalala";
         String password = new UserDao().getUserDataByUsername(userName).getPassword();
         String customerName = new UserDao().getUserDataByUsername(userName).getCustomerName();
         String customerLastname = new UserDao().getUserDataByUsername(userName).getCustomerLastname();
         String telephoneNum = new UserDao().getUserDataByUsername(userName).getTelephoneNum();*/
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "wrong@email.";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = new User(userName, password, customerName, customerLastname, telephoneNum, email);
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);
    }

    @Test//(expected = IllegalArgumentException.class)
    //apo ti stigmi pou trexei to testSaveChangesSuccessfull auto to test mporei na fugei
    public void testSaveChangesWithCorrectEmail() {
        System.out.println("testSaveChangesWithNoEmail");
        String userName = "lalala";
        String password = new UserDao().getUserDataByUsername(userName).getPassword();
        String customerName = new UserDao().getUserDataByUsername(userName).getCustomerName();
        String customerLastname = new UserDao().getUserDataByUsername(userName).getCustomerLastname();
        String telephoneNum = new UserDao().getUserDataByUsername(userName).getTelephoneNum();
        String email = "test2@yahoo.gr";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = new User(userName, password, customerName, customerLastname, telephoneNum, email);
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWrongTelephone() {
        System.out.println("testSaveChangesSuccessfull");
        /*String userName = "lalala";
         String password = new UserDao().getUserDataByUsername(userName).getPassword();
         String customerName = new UserDao().getUserDataByUsername(userName).getCustomerName();
         String customerLastname = new UserDao().getUserDataByUsername(userName).getCustomerLastname();*/
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234a67890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = new User(userName, password, customerName, customerLastname, telephoneNum, email);
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithShortUsername() {
        System.out.println("testSaveChangesWithShortUsername");
        String userName = "tes";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithLongUsername() {
        System.out.println("testSaveChangesWithLongUsername");
        String userName = "testUserNametestUserNametestUserNametestUserNametestUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    
    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithShortPassword() {
        System.out.println("testSaveChangesWithShortPassword");
        String userName = "testUserName";
        String password = "tes";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithLongPassword() {
        System.out.println("testSaveChangesWithLongPassword");
        String userName = "testUserName";
        String password = "testPasswordtestPasswordtestPasswordtestPasswordtestPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithShortCustomerName() {
        System.out.println("testSaveChangesWithShortCustomerName");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "tes";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithLongCustomerName() {
        System.out.println("testSaveChangesWithLongCustomerName");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerNametestCustomerNametestCustomerNametestCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithShortCustomerLastName() {
        System.out.println("testSaveChangesWithShortCustomerLastName");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "tes";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithLongCustomerLastName() {
        System.out.println("testSaveChangesWithLongCustomerLastName");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastnametestCustomeLastnametestCustomeLastnametestCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithShortTelephone() {
        System.out.println("testSaveChangesWithShortTelephone");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "123456789";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithLongTelephone() {
        System.out.println("testSaveChangesWithLongTelephone");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "12345678901";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithShortEmail() {
        System.out.println("testSaveChangesWithShortEmail");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "t@e.c";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithLongEmail() {
        System.out.println("testSaveChangesWithLongEmail");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomerName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "correct@email.comcorrect@email.comcorrect@email.comcorrect@email.comcorrect@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        //User expResult = null;
        /*User result = */
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
        //Assert.assertEquals(expResult, result)
    }
    
}
