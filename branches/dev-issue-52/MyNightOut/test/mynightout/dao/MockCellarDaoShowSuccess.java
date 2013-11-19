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
public class MockCellarDaoShowSuccess implements ICellarDaoShow{
     @Override
     public Cellar selectCellar(String NameOfBottle,String NumOfBottles) throws DaoException{
        
       Cellar cellar=new Cellar(NameOfBottle,NumOfBottles);
        
              
       cellar.setShowCellarSuccessful(true);
        return cellar;
     
    }
}
