/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.Cellar;

/**
 *
 * @author Maria
 */
public interface ICellarDao {
      Cellar selectCellar(String NameOfBottle, int NumOfBottles) throws DaoException;
}