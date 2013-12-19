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
public class SetNightClubDaysClosedController {

    public Nightclub setClubClosedDates(String clubName, String daysClosed) {
        int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
        NightClubDao nightClub = new NightClubDao();
        try {
            return nightClub.updateNightClubDaysClosed(clubId, daysClosed);
        } catch (Exception exception) {
            throw new IllegalArgumentException("Πρόβλημα στην βάση.");
        }

    }

}
