/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.ICellarDaoShow;

/**
 *
 * @author Maria
 */
public class ShowCellarController {
  
    private ICellarDaoShow CellarDao;
    
    public ShowCellarController(ICellarDaoShow cellarDao) {
        this.CellarDao = cellarDao;
    }
}

  