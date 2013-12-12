/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;

/**
 *
 * @author ioanna
 */
public class UserLoginFormTest extends UISpecTestCase {

    public UserLoginFormTest() {
    }

    static {
        UISpec4J.init();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(UserLoginForm.class, new String[0]));
    }

    @After
    public void tearDown() {
    }

    /**
     * Αν εμφανίζεται κανονικά η φόρμα.
     */
    @Test
    public void testVisibility() {
        Window window = getMainWindow();
        assertTrue(window.isVisible());
    }

    /**
     * Αν εμφανίζονται κανονικά όλα τα labels.
     */
    @Test
    public void testAllLabels() {
        Window window = getMainWindow();
        assertTrue(window.containsLabel("Username"));
        assertTrue(window.containsLabel("Password"));
    }

    /**
     * Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
     */
    @Test
    public void testAllButtons() {
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Enter").isVisible());
        assertEquals(true, window.getButton("Reset").isVisible());
    }

}
