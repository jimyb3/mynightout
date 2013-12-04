/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.entity.ReservationId;

/**
 *
 * @author Maria
 */
public interface IReservationDaoDelete {
    ReservationId selectReservation(int reservationId, int userId, int clubId)throws DaoException;
}
