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
public class UpdateCellarController {
    
    public Cellar updateCellar(String clubName, int vodka, int whiskey, int wine,
            int liqueur, int rum, int tequila, int beer) {
        int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();

        CellarDao cd = new CellarDao();

        try {
            return cd.updateClubCellarByClubId(clubId, vodka, whiskey, wine, liqueur, rum, tequila, beer);
        } catch (Exception e) {
            throw new IllegalArgumentException("Πρόβλημα στην βάση.");
        }
    }
}
