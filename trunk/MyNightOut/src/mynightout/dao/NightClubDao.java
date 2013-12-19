/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.Nightclub;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class NightClubDao {
//ΕΜΦΑΝΙΣΗ ΚΑΤΑΣΤΗΜΑΤΟΣ
//επιστρέφει List με clubName, seatNumber, telephoneNum για όλα τα καταστήματα της βάσης
    //αν κάτι πάει στραβα επιστρέφει null

    public List getAllNightClubs() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String mysqlQuery = "from Nightclub";
            session.beginTransaction();
            Query getNightclubs = session.createQuery(mysqlQuery);
            List resultList = getNightclubs.list();
            session.getTransaction().commit();
            session.close();
            return resultList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
//επιστρέφει το <clubid> του χρήστη <clubname>

    public Nightclub getNightClubDataByClubName(String clubName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Nightclub cl where cl.clubName='" + clubName + "'";
            Query getNightclubData = session.createQuery(mysqlQuery);
            List resultList = getNightclubData.list();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub();
            for (Object nightclubInfo : resultList) {
                nightClub = (Nightclub) nightclubInfo;
            }
            return nightClub;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

//βρίσκει και επιστρέφει το clubName to  καταστήματος με clubId
    public Nightclub getNightClubDataByClubId(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Nightclub cl where cl.clubId='" + clubId + "'";
            Query getNightclubData = session.createQuery(mysqlQuery);
            List resultList = getNightclubData.list();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub();
            for (Object nightclubInfo : resultList) {
                nightClub = (Nightclub) nightclubInfo;
            }
            return nightClub;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public void insertNewNightClub() {
        //8a doume an xreiastei
    }

//ΕΝΗΜΕΡΩΣΗ ΤΩΝ ΔΕΔΟΜΕΝΩΝ ΕΝΟΣ ΜΑΓΑΖΙΟΥ
    //ορίσματα : clubName, clubPassword, seatNumber, telephoneNum
    //επιστρέφει true αν έγινε η ενημέρωση, alliws false
    // todo : είναι σωστό που επστρέφει boolean ?
    //todo : θα έχει περισσότερα πεδία το Nightclub αργότερα
    public Nightclub updateNightClubData(String clubName, String clubPassword, String telephoneNum,
            String address, String email, String category, String clubImage) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
            String mysqlQuery = "update Nightclub set clubPassword = '" + clubPassword + "', "
                    + " telephoneNum = '" + telephoneNum + "', address='" + address + "', email='" + email + "', category='" + category + "',"
                    + " clubImage='" + clubImage + "'  where clubId='" + clubId + "'";
            Query updateNightclub = session.createQuery(mysqlQuery);
            updateNightclub.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub(clubName, clubPassword, address, email, telephoneNum, category, clubImage);
            return nightClub;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    //έλεγχος των στοιχείων εισόδου ενός καταστήματος, αν υπάρχουν στη βάση
    //ορίσματα : clubName, clubPassWord
    //true αν είναι σωστά, αλλιώς false
    public Nightclub isNightClubDataValid(String clubName, String clubPassWord) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String mysqlQuery = "from Nightclub nclub where nclub.clubName='" + clubName + "' and nclub.clubPassword='" + clubPassWord + "'";
            session.beginTransaction();
            Query getNightclub = session.createQuery(mysqlQuery);
            List resultList = getNightclub.list();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub();
            for (Object nightclubInfo : resultList) {
                nightClub = (Nightclub) nightclubInfo;
            }
            return nightClub;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public boolean isNightClubOpenByDate(String clubName, Date reservationDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String mysqlQuery = "from Nightclub nclub where nclub.clubName='" + clubName + "'";
            session.beginTransaction();
            Query getNightclub = session.createQuery(mysqlQuery);
            List resultList = getNightclub.list();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub();
            for (Object nightclubInfo : resultList) {
                nightClub = (Nightclub) nightclubInfo;
            }
            return reservationDate.before(nightClub.getClosedFrom()) || reservationDate.after(nightClub.getClosedThrough());
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
    }

    public boolean isNightClubOpenByWeekDay(String clubName, Date reservationDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            boolean isOpen = true;
            String mysqlQuery = "from Nightclub nclub where nclub.clubName='" + clubName + "'";
            session.beginTransaction();
            Query getNightclub = session.createQuery(mysqlQuery);
            List resultList = getNightclub.list();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub();
            for (Object nightclubInfo : resultList) {
                nightClub = (Nightclub) nightclubInfo;
            }
            String[] daysClosedArray = nightClub.getDaysClosed().split(",");
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(reservationDate);
            int dayOfReservation = calendar.get(Calendar.DAY_OF_WEEK);
            for (int i = 1; i < daysClosedArray.length; i++) {
                if (Integer.toString(dayOfReservation).equals(daysClosedArray[i])) {
                    isOpen = false;
                }
            }
            return isOpen;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
    }

    public Nightclub updateNightClubClosedDates(int clubId, Date closedFrom, Date closedThrough) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        String closedFromDate = dateFormat.format(closedFrom);
        String closedThroughDate = dateFormat.format(closedThrough);
        try {
            session.beginTransaction();
            String mysqlQuery = "update Nightclub set closedFrom='" + closedFromDate + "',  closedThrough='" + closedThroughDate + "'"
                    + "  where clubId='" + clubId + "'";
            Query getNightclub = session.createQuery(mysqlQuery);
            getNightclub.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub(closedFrom, closedThrough);
            return nightClub;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public Nightclub updateNightClubDaysClosed(int clubId, String daysClosed) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "update Nightclub set daysClosed='" + daysClosed + "'"
                    + "  where clubId='" + clubId + "'";
            Query updateNightclub = session.createQuery(mysqlQuery);
            updateNightclub.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub(daysClosed);
            return nightClub;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
}
