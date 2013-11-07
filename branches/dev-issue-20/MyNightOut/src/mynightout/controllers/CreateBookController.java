/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

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
    
    public Reservation createReservationNew (String customerName, int reservationId,
        Date reservationDate, int numberParty, String storeName) 
            throws IllegalArgumentException, DaoException{
         
        if(customerName.length()<3){
            throw new IllegalArgumentException("Customer name should be at least three characters long");
        }
        
        if (numberParty > 5){
        throw new IllegalArgumentException("Each table has only 5 seats");
        // TODO edw prepei na ginei pio sun8eto problepsi gia parapanw trapezia
        }
        
        // TODO elenxos gia imerominia opws to apo katw -.-
        
        
        /*
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dtStr = dateString.trim();  // 01/01/2011
        Date date;
        try {
             date = df.parse(dtStr);  // dt = Sun Jan 01 00:00:00 IST 2011
        } catch (ParseException e) {
            throw new IllegalArgumentException("Incorrect date format");
        }

        //Check if date is correct

        if (Calendar.getInstance().getTime().after(date)) {
            throw new IllegalArgumentException("Date has already passed");
        }
        
        //Check if customer name is at least three character's long
        if (customerName.length() < 3) {
            throw new IllegalArgumentException("Customer name should be at least three characters long");
        }
        try {
            return createBookDao.createReservation(customerName, reservationId, 
                    reservationDate, numberParty, storeName);
        } catch (DaoException e) {
            throw e;
        */
        
        
        
        
        /* if(reservationId>=100){
                throw new IllegalArgumentException("Megalos ari8mos kratisis");
            }*/
                try{
            return createBookDao.createReservation(customerName, reservationId, 
                    reservationDate, numberParty, storeName);
        } catch(DaoException e){
            throw e;
        }
        }      
    }

