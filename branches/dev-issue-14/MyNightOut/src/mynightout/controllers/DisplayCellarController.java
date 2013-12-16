/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import mynightout.dao.CellarDao;
import mynightout.dao.NightClubDao;
import mynightout.entity.Cellar;

/**
 *
 * @author Dimitris
 */
public class DisplayCellarController {

    public Cellar displayCellar(String clubName) {
        int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();

        CellarDao cd = new CellarDao();

        try {
            return cd.getNightClubCellarByClubName(clubId);
        } catch (Exception e) {
            throw new IllegalArgumentException("Πρόβλημα στην βάση.");
        }
    }

}
