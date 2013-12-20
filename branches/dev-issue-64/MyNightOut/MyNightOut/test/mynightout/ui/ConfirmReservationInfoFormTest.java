/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.ui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.uispec4j.UISpec4J;
import org.uispec4j.UISpecTestCase;
import org.uispec4j.Window;
import org.uispec4j.interception.MainClassAdapter;

/**
 *
 * @author Dimitris
 */
public class ConfirmReservationInfoFormTest extends UISpecTestCase {

    static {
        UISpec4J.init();
    }

    public ConfirmReservationInfoFormTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        setAdapter(new MainClassAdapter(ConfirmReservationInfoForm.class, new String[0]));
    }

    @After
    public void tearDown() {
    }

    /**
     * Αν εμφανίζεται κανονικά η φόρμα.
     */
    @Test
    public void testVisibility() {
        System.out.println("testVisibility");
        Window window = getMainWindow();
        assertTrue(window.isVisible());
    }

    /**
     * Αν εμφανίζονται κανονικά όλα τα labels.
     */
    @Test
    public void testAllLabels() {
        System.out.println("testAllLabels");
        Window window = getMainWindow();
        assertTrue(window.containsLabel("Όνομα:"));
        assertTrue(window.containsLabel("Επίθετο:"));
        assertTrue(window.containsLabel("Όνομα καταστήματος:"));
        assertTrue(window.containsLabel("Ημερομηνία κράτησης:"));
        assertTrue(window.containsLabel("Τραπέζι κράτησης:"));
        assertTrue(window.containsLabel("customerName"));
        assertTrue(window.containsLabel("customerLastName"));
        assertTrue(window.containsLabel("nightClubName"));
        assertTrue(window.containsLabel("reservationDate"));
        assertTrue(window.containsLabel("reservationTable"));
        assertTrue(window.containsLabel("Είναι τα παραπάνω στοιχεία σωστά;"));
    }

    /**
     * Αν εμφανίζoνται κανονικά ολα τα κουμπιά.
     */
    @Test
    public void testAllButtons() {
        System.out.println("testAllButtons");
        Window window = getMainWindow();
        assertEquals(true, window.getButton("Ναι").isVisible());
        assertEquals(true, window.getButton("Όχι").isVisible());
    }
}