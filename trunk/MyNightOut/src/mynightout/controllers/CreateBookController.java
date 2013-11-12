/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import mynightout.model.Reservation;
import mynightout.exceptions.DaoException;
import mynightout.dao.IReservationDaoCreate;

/**
 *
 * @author Miltos
 */
public class CreateBookController {

    private IReservationDaoCreate createBookDao;

    public CreateBookController(IReservationDaoCreate createBookDao) {
        this.createBookDao = createBookDao;
    }

    public Reservation createReservationNew(String customerName,
            String dateString, int numberParty, String storeName)
            throws IllegalArgumentException, DaoException {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dtStr = dateString.trim();  // 01/01/2011
        Date reservationDate;
        try {
            reservationDate = df.parse(dtStr);  // dt = Sun Jan 01 00:00:00 IST 2011
        } catch (ParseException e) {
            throw new IllegalArgumentException("Incorrect date format");
        }

        if (customerName.length() < 3) {
            throw new IllegalArgumentException("Customer name should be at least three characters long");
        }

        if (numberParty > 5) {
            throw new IllegalArgumentException("Each table has only 5 seats");
            // TODO edw prepei na ginei pio sun8eto problepsi gia parapanw trapezia
        }

        // TODO elenxo gia imerominia pou exei perasei
        try {
            return createBookDao.createReservation(customerName,
                    reservationDate, numberParty, storeName);
        } catch (DaoException e) {
            throw e;
        }
    }
}
