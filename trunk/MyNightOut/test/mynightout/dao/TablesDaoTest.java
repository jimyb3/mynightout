/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import mynightout.entity.Tables;
import org.dbunit.DBTestCase;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author ioanna
 */
public class TablesDaoTest  extends DBTestCase {
    
    
    private static JdbcDatabaseTester databaseTester;
    private static IDataSet dataSetBefore;
    private static IDataSet dataSetAfter;

    protected IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSetBuilder().build(new FileInputStream("src/xmlFiles/tablesXml.xml"));
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
        partDS.addTable("tables", "SELECT * FROM tables");
        FlatXmlDataSet.write(partDS, new FileOutputStream("src/xmlFiles/tablesXml.xml"));

        dataSetBefore = new FlatXmlDataSetBuilder().build(new FileInputStream("src/xmlFiles/tablesXml.xml"));
        databaseTester.setDataSet(dataSetBefore);
        databaseTester.onSetup();
    }

    @After
    public void tearDown() throws Exception {
        databaseTester.onTearDown();
    }
    
    @Test
    public void testGetClubsTablesSuccessful() throws Exception {
        String clubName = "Vogue";
        Tables actualTables = new TablesDao().getClubsTables(clubName);
        Tables expectedTables = new Tables(1,4,6,3,7,3,5) ;
        Assert.assertEquals(expectedTables.equals(actualTables), true);
    }

  @Test
    public void testUpdateClubsTablesSuccessful() throws Exception {
        Tables tables = new TablesDao().getClubsTables("Vogue");
        Tables actualTables = new TablesDao().updateClubsTables("Vogue",1,1,1,1,1,1);
        Tables expectedTables = new Tables(1,1,1,1,1,1,1) ;
        new TablesDao().updateClubsTables("Vogue",tables.getFirstRow(),tables.getSecondRow(),
                tables.getThirdRow(),tables.getFourthRow(),tables.getFifthRow(),tables.getSixthRow());
        Assert.assertEquals(expectedTables.equals(actualTables), true);       
    }
    @Test
    public void testNumberOfTablesByClubIdSuccessful() throws Exception {
        int expectedNumOfTables = 28;
        int actualNumOfTables = new TablesDao().numberOfTablesByClubId(1);
        Assert.assertTrue(expectedNumOfTables==actualNumOfTables);
    }
    
    

}
