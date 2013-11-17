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
 * @author panos
 */
public interface INightClubDao {
    NightClub selectNightClub(String storeName) throws DaoException;
    
}
