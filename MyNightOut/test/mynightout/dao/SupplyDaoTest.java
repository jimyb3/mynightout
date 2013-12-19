/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import junit.framework.Assert;
import mynightout.entity.Supply;
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
public class SupplyDaoTest extends DBTestCase {

    private static JdbcDatabaseTester databaseTester;
    private static IDataSet dataSetBefore;
    private static IDataSet dataSetAfter;

    protected IDataSet getDataSet() throws Exception {
        return new FlatXmlDataSetBuilder().build(new FileInputStream("src/xmlFiles/supplyXml.xml"));
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
        partDS.addTable("supply", "SELECT * FROM supply");
        FlatXmlDataSet.write(partDS, new FileOutputStream("src/xmlFiles/supplyXml.xml"));

        dataSetBefore = new FlatXmlDataSetBuilder().build(new FileInputStream("src/xmlFiles/supplyXml.xml"));
        databaseTester.setDataSet(dataSetBefore);
        databaseTester.onSetup();
    }

    @After
    public void tearDown() throws Exception {
        databaseTester.onTearDown();
    }

  /*  dhmiourgei provlima   
    
    @Test
    public void testInsertNewSupplySuccessful() throws Exception {
        List resultListBefore = new SupplyDao().getSupplyByClubId(1);
        Supply supply = new SupplyDao().insertNewSupply(1, 10);
        List resultListAfter = new SupplyDao().getSupplyByClubId(1);
        new SupplyDao().deleteSuppliersByClubId(1);
        for (Object o : resultListBefore) {
            Supply supp = (Supply) o;
            new SupplyDao().insertNewSupply(1, supp.getId().getSupplierId());
        }
        Assert.assertEquals(resultListBefore.size() + 1, resultListAfter.size());

    }*/

    @Test
    public void testDeleteSuppliersByClubIdSuccessful() throws Exception {
        List resultListBefore = new SupplyDao().getSupplyByClubId(1);
        boolean result = new SupplyDao().deleteSuppliersByClubId(1);       
        for (Object o : resultListBefore) {
            Supply supp = (Supply) o;
            new SupplyDao().insertNewSupply(1, supp.getId().getSupplierId());
        }
        List resultListAfter = new SupplyDao().getSupplyByClubId(1);
        Assert.assertEquals(resultListBefore.size(), resultListAfter.size());
        Assert.assertTrue(result);
    }

    @Test
    public void testGetSupplyByClubIdSuccessful() throws Exception {
        List resultList = new SupplyDao().getSupplyByClubId(1);
        Assert.assertEquals(resultList.size(), 2);
    }

}
