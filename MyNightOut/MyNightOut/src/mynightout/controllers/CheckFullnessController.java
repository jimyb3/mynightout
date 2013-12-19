/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.NightClubDao;
import mynightout.exceptions.DaoException;
import mynightout.entity.Nightclub;

/**
 *
 * @author panos
 */
public class CheckFullnessController {

    public Nightclub checkFullness(String storeName) throws IllegalArgumentException, Exception {

        if (storeName.length() < 3) {
            throw new IllegalArgumentException("Το όνομα του καταστήματος είναι πολύ μικρο");
        }

        try {
            return new Nightclub();
        } catch (Exception e) {      //minima la8ous apo th vash (den vgazei mhmyma)
            throw e;
        }
    }
}
