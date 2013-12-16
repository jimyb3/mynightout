/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.controllers;

import mynightout.dao.NightClubDao;
import mynightout.entity.Nightclub;

/**
 *
 * @author ioanna
 */
public class NightclubLoginController {
    public Nightclub login(String clubName, String clubPassword) {

        NightClubDao currentClub = new NightClubDao();
        Nightclub club = new Nightclub(clubName, clubPassword);

        if (club.equalsForLogin(currentClub.isNightClubDataValid(clubName, clubPassword))) {
            try {
                return club;

            } catch (Exception e) {
                throw new IllegalArgumentException("Πρόβλημα στην βάση");
            }
        } else {
            throw new IllegalArgumentException("Λάθος στοιχεία εισόδου");
        }

    }
}
