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
public class ReservationDaoDelete implements IReservationDaoDelete{
@Override
public Reservation selectReservation(String ID){

int resId=Integer.parseInt(ID);
return new Reservation(resId);
}
}