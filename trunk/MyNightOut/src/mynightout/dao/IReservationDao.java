/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.Reservation;


/**
 *  Εδώ έχουμε τις λειτουργίες της βάσης, ο καθένας αναλογα με το ποια λειτουργία
 * θέλει να κάνει η βάση για αυτόν θα αφήσει εκεινη την εντολή ενεργεί και θα κάνει
 * τις υπόλοιπες σχόλια.
 * 
 * @author Dimitris
 */
public interface IReservationDao {
    Reservation cancelReservation(String customerName, int reservationId) throws DaoException;
    //Reservation createReservation(String customerName, int reservationId) throws DaoException;
    //Reservation updateReservation(String customerName, int reservationId) throws DaoException;
    //Reservation deleteReservation(String customerName, int reservationId) throws DaoException;
    //Reservation selectReservation(String customerName, int reservationId) throws DaoException;
}
