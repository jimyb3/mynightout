/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.model.Reservation;

/**
 *
 * @author Maria
 */
public class MockDeleteReservationDaoFailed {
    
public Reservation DeleteReservation (String ID)
{
    Reservation r= new Reservation();
    r.setID(ID);
    r.setSuccessDelete(0);
   //r.setID("33");
    return r; 
}
}
