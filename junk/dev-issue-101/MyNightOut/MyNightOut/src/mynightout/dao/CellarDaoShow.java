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
public class CellarDaoShow implements ICellarDaoShow {

    @Override
    public Cellar selectCellar(String NameOfBottle,int NumOfBottles) {
        return new Cellar(NameOfBottle, NumOfBottles);
    }
}
