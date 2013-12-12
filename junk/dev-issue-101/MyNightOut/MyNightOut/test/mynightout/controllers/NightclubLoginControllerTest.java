/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.entity.Nightclub;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author ioanna
 */
public class NightclubLoginControllerTest {

    public NightclubLoginControllerTest() {
    }

    /**
     * Test of login method, of class NightclubNightclubLoginController.
     */
    @Test
    public void testSuccessfulLogin() {

        String clubName = "Vogue";
        String clubPassWord = "123123";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
        Assert.assertEquals(expResult.getClubName(), result.getClubName());
        Assert.assertEquals(expResult.getClubPassword(), result.getClubPassword());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedLogin() {

        String clubName = "user1";
        String clubPassWord = "_-_-_-";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
        //Assert. assertEquals(expResult.getNightclubName() , result.getNightclubName());
        //Assert. assertEquals(expResult.getPassWord() , result.getPassWord())); 

    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedLoginNoNightclubname() {
        String clubName = "";
        String clubPassWord = "123123";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedLoginNoPassword() {
        String clubName = "Vogue";
        String clubPassWord = "";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedLoginSmallNightclubname() {
        String clubName = "Vo";
        String clubPassWord = "123123";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedLoginSmallPassword() {
        String clubName = "Vogue";
        String clubPassWord = "1";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedLoginNightclubnameTooBig() {
        String clubName = "user1234user12345userclubclubclub";
        String clubPassWord = "123123";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFailedLoginPasswordTooBig() {
        String clubName = "Vogue";
        String clubPassWord = "12345678912345671231231231238";
        NightclubLoginController instance = new NightclubLoginController();
        Nightclub expResult = new Nightclub("Vogue", "123123");
        Nightclub result = instance.login(clubName, clubPassWord);
    }
}
