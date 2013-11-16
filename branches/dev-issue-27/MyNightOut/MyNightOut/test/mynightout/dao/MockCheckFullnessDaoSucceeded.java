/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import mynightout.exceptions.DaoException;
import mynightout.model.NightClub;

/**
 *
 * @author Mustaine
 */
public class MockCheckFullnessDaoSucceeded implements INightClubDao{
    
    @Override
    public NightClub selectNightClub(String storeName) throws DaoException{
        NightClub nightclub = new NightClub();
        
        nightclub.setStoreName(storeName);            
        nightclub.setStoreFull(true);
        
        return nightclub;
    }
    
}
