/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import junit.framework.Assert;
import mynightout.entity.User;
import org.dbunit.DBTestCase;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author ioanna
 */
public class UserDaoTest extends DBTestCase {

    private static JdbcDatabaseTester databaseTester;
    private static IDataSet dataSetBefore;
    private static IDataSet dataSetAfter;

    protected IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSetBuilder().build(new FileInputStream("src/xmlFiles/userXml.xml"));
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        // Init test environment, session etc.

    }

    @AfterClass
    public static void tearDownClass() {
        // Close session etc.
    }

    @Before
    public void setUp() throws Exception {
        databaseTester = new JdbcDatabaseTester("com.mysql.jdbc.Driver",
                "jdbc:mysql://mynightout.no-ip.biz:3306/mynightout?useUnicode=yes&characterEncoding=UTF-8", "root", "");
        QueryDataSet partDS = new QueryDataSet(databaseTester.getConnection());
        partDS.addTable("user", "SELECT * FROM user");
        FlatXmlDataSet.write(partDS, new FileOutputStream("src/xmlFiles/userXml.xml"));

        dataSetBefore = new FlatXmlDataSetBuilder().build(new FileInputStream("src/xmlFiles/userXml.xml"));
        databaseTester.setDataSet(dataSetBefore);
        databaseTester.onSetup();
    }

    @After
    public void tearDown() throws Exception {
        databaseTester.onTearDown();
    }

    /* @Test
     public void testUser() throws Exception {

     ITable beforeTable = dataSetBefore.getTable("user");
     User user = new UserDao().insertNewUserData("testuser", "testuser",
     "testuserjtyjttj", "testuser", "testuser", "testuser");

     IDatabaseConnection connection = databaseTester.getConnection();
     dataSetAfter = connection.createDataSet();
     ITable afterTable = dataSetAfter.getTable("user");

     int afterRows = afterTable.getRowCount();
     int beforeRows = beforeTable.getRowCount();
     beforeRows++;
     Assert.assertEquals(afterRows, beforeRows);
     }*/
    
    
    //test gia insert dn exei
    
    @Test
    public void testIsUserDataValidSuccessful() throws Exception {
        String username = "user1";
        String password = "123456";
        User actualUser = new UserDao().isUserDataValid(username, password);
        User expectedUser = new User("user1", "123456", "Ioanna", "Koufaki", "6908743750", "user1@yahoo.gr");
        Assert.assertEquals(expectedUser.equalsForLogin(actualUser), true);
    }

    @Test(expected = NullPointerException.class)
    public void testIsUserDataValidFailure() throws Exception {
        String username = "userFailureTest";
        String password = "passFailureTest";
        new UserDao().isUserDataValid(username, password);
    }

    @Test
    public void testGetUserDataByUsernameSuccessful() throws Exception {
        String username = "user1";
        User actualUser = new UserDao().getUserDataByUsername(username);
        User expectedUser = new User("user1", "123456", "Ioanna", "Koufaki", "6908743750", "user1@yahoo.gr");
        Assert.assertEquals(true, expectedUser.equalsForLogin(actualUser));
    }

    @Test(expected = NullPointerException.class)
    public void testGetUserDataByUsernameFailure() throws Exception {
        String username = "userFailureTest";
        new UserDao().getUserDataByUsername(username);
    }

    @Test
    public void testGetUserDataByIdSuccessful() throws Exception {
        int validId = 1;
        User actualUser = new UserDao().getUserDataById(validId);
        User expectedUser = new User(1, "user1", "123456", "Ioanna", "Koufaki", "6908743750", "user1@yahoo.gr");
        Assert.assertEquals(true, expectedUser.equals(actualUser));
    }

    @Test(expected = NullPointerException.class)
    public void testGetUserDataByIdFailure() throws Exception {
        int invalidId = -1;
        new UserDao().getUserDataById(invalidId);
    }

    @Test
    public void testUpdateUserDataSuccessful() throws Exception {
        String password = "passwordTest";
        String telephone = "1234567890";
        String mail = "emailTest";
        User user = new UserDao().getUserDataById(1);
        User actualUser = new UserDao().updateUserData("user1", password, "Ioanna", "Koufaki", telephone, mail);
        User expectedUser = new User("user1", password, "Ioanna", "Koufaki", telephone, mail);
        new UserDao().updateUserData("user1", user.getPassword(), "Ioanna", "Koufaki", user.getTelephoneNum(), user.getEmail());
        Assert.assertEquals(true, expectedUser.equals(actualUser));
    }

    @Test
    public void testUpdateUserDataFailure() throws Exception {
        String password = "passwordTest";
        String telephone = "1234567890";
        String mail = "emailTest";
        User actualUser = new UserDao().updateUserData("user1", password, "Ioannaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                "Koufaki", telephone, mail);
        Assert.assertNull(actualUser);
    }
}
