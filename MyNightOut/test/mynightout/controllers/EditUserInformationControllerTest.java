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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
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
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWithWrongEmail() {
        System.out.println("testSaveChangesWithNoEmail");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234567890";
        String email = "wrong@email.";
        EditUserInformationController instance = new EditUserInformationController();
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSaveChangesWrongTelephone() {
        System.out.println("testSaveChangesSuccessfull");
        String userName = "testUserName";
        String password = "testPassword";
        String customerName = "testCustomeName";
        String customerLastname = "testCustomeLastname";
        String telephoneNum = "1234a67890";
        String email = "correct@email.com";
        EditUserInformationController instance = new EditUserInformationController();
        instance.saveChanges(userName, password, customerName, customerLastname, telephoneNum, email);
    }
}
