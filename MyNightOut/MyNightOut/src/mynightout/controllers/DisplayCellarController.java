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

        CellarDao cellar = new CellarDao();

        try {
            return cellar.getNightClubCellarByClubName(clubId);
        } catch (Exception exception) {
            throw new IllegalArgumentException("Πρόβλημα στην βάση.");
        }
    }

}
