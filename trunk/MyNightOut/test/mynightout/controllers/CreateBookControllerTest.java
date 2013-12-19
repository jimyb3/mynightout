/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Miltos
 */
public class CreateBookControllerTest {

    public CreateBookControllerTest() {
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
     * Test of createReservationNew method, of class CreateBookController.
     */
 @Test
    public void testCreateReservationNewSuccessed() throws Exception {
        /**
         * Η βάση μέσα στoν πίνακα κράτηση κρατάει μόνο το userId, το clubId,
         * την ημερομηνία κράτησης, των αριθμό θέσεων, και μια ένα status που
         * μας δειχνει αν ειναι ενεργή η κράτηση.
         *
         * Παρακάτω πρεπει να αλαχθουν οι μεταβλητές και τα ορίσματα μέσα στον
         * controller για να τρέχει σωστά το test. Η γενική δομή δεν έχει
         * αλλάξει
         */

        System.out.println("createReservationNewSuccess");
        int userId = 1;
        int reservationId = 12345;
        //Μετατρέπουμε το string σε date
        String date = "16/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);
        /*
         //Take the current day
         Calendar cal
         = Calendar.getInstance();

         //Add one day
         cal.add(Calendar.DAY_OF_MONTH, 1);

         //Set the time to 00:00:00
         cal.set(Calendar.HOUR_OF_DAY, 0);
         cal.set(Calendar.MINUTE, 0);
         cal.set(Calendar.SECOND, 0);
         cal.set(Calendar.MILLISECOND, 0);

         //Convert to Date object
         Date reservationDate = cal.getTime();

         //Convert date to a String of the form dd/MM/yyyy
         SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

         String dateString = df.format(reservationDate);
         */

       // CreateBookController instance = new CreateBookController(new MockReservationDaoCreateSuccess());

        int seatNumber = 5;
        int clubId = 2;

       /*Reservation result = instance.createReservationNew(userId, clubId,
                reservationDate, seatNumber, "active");
        Assert.assertEquals(userId, result.getUserId());
        Assert.assertEquals(clubId, result.getClubId());
        Assert.assertEquals(reservationDate, result.getReservationDate());
        Assert.assertEquals(seatNumber, result.getSeatNumber());
        Assert.assertEquals(12345, result.getReservationId());
        Assert.assertEquals(true, result.isSuccessCreate());*/

    }

    @Test
    public void testCreateReservationNewFailed() throws Exception {
        System.out.println("createReservationNewSuccess");
        int userId = 1;
        int reservationId = 12345;
        //Μετατρέπουμε το string σε date
        String date = "16/11/2013";
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date reservationDate = (Date) formatter.parseObject(date);
        /*
         //Take the current day
         Calendar cal
         = Calendar.getInstance();

         //Add one day
         cal.add(Calendar.DAY_OF_MONTH, 1);

         //Set the time to 00:00:00
         cal.set(Calendar.HOUR_OF_DAY, 0);
         cal.set(Calendar.MINUTE, 0);
         cal.set(Calendar.SECOND, 0);
         cal.set(Calendar.MILLISECOND, 0);

         //Convert to Date object
         Date reservationDate = cal.getTime();

         //Convert date to a String of the form dd/MM/yyyy
         SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

         String dateString = df.format(reservationDate);
         */
        //CreateBookController instance = new CreateBookController(new MockReservationDaoCreateFail());

        int seatNumber = 5;
        int clubId = 2;

        /*try {
            Reservation result = instance.createReservationNew(userId, clubId,
                    reservationDate, seatNumber, "active");
            Assert.assertEquals(userId, result.getUserId());
            Assert.assertEquals(clubId, result.getClubId());
            Assert.assertEquals(reservationDate, result.getReservationDate());
            Assert.assertEquals(seatNumber, result.getSeatNumber());
            Assert.assertEquals(12345, result.getReservationId());
            Assert.assertEquals(false, result.isSuccessCreate());
        } catch (Exception e) {
        }*/
    }
}
