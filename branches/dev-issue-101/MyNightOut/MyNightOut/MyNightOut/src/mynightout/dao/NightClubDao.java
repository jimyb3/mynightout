/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.Nightclub;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author panos
 */
public class NightClubDao implements INightClubDao {

    @Override
    public Nightclub selectNightClub(String storeName) throws DaoException {
        return new Nightclub();
    }
//ΕΜΦΑΝΙΣΗ ΚΑΤΑΣΤΗΜΑΤΟΣ
//επιστρέφει List με clubName, seatNumber, telephoneNum για όλα τα καταστήματα της βάσης
    //αν κάτι πάει στραβα επιστρέφει null

    public List getAllNightClubs() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Nightclub";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List nightclubsList = q.list();
            session.getTransaction().commit();
            return nightclubsList;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
//επιστρέφει αντικείμενο nightclub με τα δεδομένα του καταστήματος με <clubName>

    public Nightclub getNightClubDataByClubName(String clubName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hqlNightClub = "from Nightclub cl where cl.clubName='" + clubName + "'";
            Query w = session.createQuery(hqlNightClub);
            List resultList = w.list();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub();
            for (Object o : resultList) {
                nightClub = (Nightclub) o;
            }
            return nightClub;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

//επιστρέφει αντικείμενο nightclub με τα δεδομένα του καταστήματος με <clubId>
    public Nightclub getNightClubDataByClubId(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hqlNightClub = "from Nightclub cl where cl.clubId='" + clubId + "'";
            Query w = session.createQuery(hqlNightClub);
            List resultList = w.list();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub();
            for (Object o : resultList) {
                nightClub = (Nightclub) o;
            }
            return nightClub;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

  

//ΕΝΗΜΕΡΩΣΗ ΤΩΝ ΔΕΔΟΜΕΝΩΝ ΕΝΟΣ ΜΑΓΑΖΙΟΥ
    //ορίσματα : clubName, clubPassword, seatNumber, telephoneNum,address,email,category,clubImage
    //επιστρέφει to antikeimeno an egine swsta, alliws null
    public Nightclub updateNightClubData(String clubName, String clubPassword, int seatNumber, String telephoneNum,
            String address, String email, String category, String clubImage) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
            String hql = "update Nightclub set clubPassword = '" + clubPassword + "', seatNumber = '" + seatNumber + "',"
                    + " telephoneNum = '" + telephoneNum + "', address='" + address + "', email='" + email + "', category='" + category + "',"
                    + " clubImage='" + clubImage + "'  where clubId='" + clubId + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub(clubName, clubPassword, address, email, seatNumber, telephoneNum, category, clubImage);
            return nightClub;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    //έλεγχος των στοιχείων εισόδου ενός καταστήματος, αν υπάρχουν στη βάση
    //ορίσματα : clubName, clubPassWord
    //Nightclub an einai swsto, alliws null
    public Nightclub isNightClubDataValid(String clubName, String clubPassWord) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Nightclub nclub where nclub.clubName='" + clubName + "' and nclub.clubPassword='" + clubPassWord + "'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            Nightclub nightClub = new Nightclub();
            for (Object o : resultList) {
                nightClub = (Nightclub) o;
            }
            return nightClub;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public boolean isNightClubOpenByDate(String clubName, Date reservationDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Nightclub nclub where nclub.clubName='" + clubName + "'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            Nightclub nightClub = new Nightclub();
            for (Object o : resultList) {
                nightClub = (Nightclub) o;
            }
            return reservationDate.before(nightClub.getClosedFrom()) || reservationDate.after(nightClub.getClosedThrough());
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
    }

    public boolean isNightClubOpenByWeekDay(String clubName, Date reservationDate) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            boolean open = false;
            String hql = "from Nightclub nclub where nclub.clubName='" + clubName + "'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            Nightclub nightClub = new Nightclub();
            for (Object o : resultList) {
                nightClub = (Nightclub) o;
            }
            String[] daysClosedArray = nightClub.getDaysClosed().split(",");
            Calendar c = Calendar.getInstance();
            c.setTime(reservationDate);
            int dayOfReservation = c.get(Calendar.DAY_OF_WEEK);
            for (int i = 0; i <= daysClosedArray.length; i++) {
                if (!Integer.toString(dayOfReservation).equals(daysClosedArray[i])) {
                    open = true;
                }
            }
            return open;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
    }

    public Nightclub updateNightClubClosedDates(int clubId, Date closedFrom, Date closedThrough) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hql = "update Nightclub set closedFrom='" + closedFrom + "'"
                    + " and closedThrough='" + closedThrough + "'"
                    + "  where clubId='" + clubId + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub(closedFrom, closedThrough);
            return nightClub;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public Nightclub updateNightClubDaysClosed(int clubId, String daysClosed) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hql = "update Nightclub set daysClosed='" + daysClosed + "'"
                    + "  where clubId='" + clubId + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Nightclub nightClub = new Nightclub(daysClosed);
            return nightClub;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
}
