/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.controllers;

import java.util.Date;
import mynightout.dao.NightClubDao;
import mynightout.entity.Nightclub;

/**
 *
 * @author Dimitris
 */
public class SetNightClubClosedDatesController {

    public Nightclub setClubClosedDates(String clubName, Date closedFrom, Date closedThrough) {
        int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
        Date today = new Date();

        if (closedFrom.before(closedThrough) && !closedThrough.before(today)) {
            NightClubDao nightClub = new NightClubDao();
            try {
                return nightClub.updateNightClubClosedDates(clubId, closedFrom, closedThrough);
            } catch (Exception e) {
                throw new IllegalArgumentException("Πρόβλημα στην βάση.");
            }
        } else {
            throw new IllegalArgumentException("Έχεις εισάγει λάθος ημερομηνίες!");
        }
    }

}
