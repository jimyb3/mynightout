/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.Reservation;
import mynightout.entity.ReservationPk;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class ReservationDao {

    //ΚΡΑΤΗΣΗ
    //δημιουργεί νεα κράτηση στη βάση
    //ορίσματα : userName, nightClubName, reservationDate, seatNumber
    //επιστρέφει αντικείμενο Reservation με τα χαρακτηριστικά της νέας κράτησης, εαν προστέθηκε στη βάση η εγγραφή
    //αλλιώς, null
    public Reservation insertReservationData(int userId, int clubId, Date reservationDate, String trapezi) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            ReservationPk reservationPk = new ReservationPk();
            reservationPk.setUserId(userId);
            reservationPk.setClubId(clubId);
            Reservation newReservation = new Reservation(reservationPk, reservationDate, trapezi, "active");
            session.save(newReservation);
            session.getTransaction().commit();
            session.close();
            return newReservation;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
//ΧΡΗΣΤΗΣ-ΙΣΤΟΡΙΚΟ
    //επιστρέφει μια λίστα που περιέχει όλες τις active=δεν έχουν ακυρωθεί, κρατήσεις τος χρήστη
    //αν κάτι πάει στραβά, επιστρέφει NULL
    //παίρνει ως όρισμα το userName, με βάση αυτό βρίσκει τις κρατήσεις

    public List getUserReservations(String userName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            int userId = new UserDao().getUserDataByUsername(userName).getUserId();
            String mysqlQuery = "from Reservation re where re.id.userId='" + userId + "' and re.reservationStatus=\'active\'";
            session.beginTransaction();
            Query getReservation = session.createQuery(mysqlQuery);
            List resultList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            return resultList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }

    public List getClubReservations(String clubName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
            String mysqlQuery = "from Reservation re where re.id.clubId='" + clubId + "' and re.reservationStatus=\'active\'";
            session.beginTransaction();
            Query getReservation = session.createQuery(mysqlQuery);
            List resultList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            return resultList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }

    public List getUserCurrentReservations(String userName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            int userId = new UserDao().getUserDataByUsername(userName).getUserId();
            String dataFormat = "yyyy/MM/dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dataFormat);
            Date currentDate = new Date();
            String today = simpleDateFormat.format(currentDate);
            String mysqlQuery = "from Reservation re where re.id.userId='" + userId + "' and re.reservationStatus=\'active\' and re.reservationDate>='" + today + "'";
            session.beginTransaction();
            Query getReservation = session.createQuery(mysqlQuery);
            List resultList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            return resultList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }

    public List getClubCurrentReservations(String clubName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
            String dateFormat = "yyyy/MM/dd";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
            Date currentDate = new Date();
            String today = simpleDateFormat.format(currentDate);
            String mysqlQuery = "from Reservation re where re.id.clubId='" + clubId + "' and re.reservationStatus=\'active\' and re.reservationDate>='" + today + "'";
            session.beginTransaction();
            Query getReservation = session.createQuery(mysqlQuery);
            List reservationsList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            return reservationsList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
//ΑΚΥΡΩΣΗ ΚΡΑΤΗΣΗΣ 
    //ο χρηστης ακυρώνει κάποια κράτηση
    //ορίσματα username και reservationId
    // επιστρέφει true αν έγινε η ακύρωση, αλλιώς false

    public ReservationPk cancelReservationByUser(ReservationPk reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            ReservationPk reservationPk = new ReservationPk();
            session.beginTransaction();
            String mysqlQuery = "update Reservation re set re.reservationStatus ='inactive' "
                    + "where re.id.userId='" + reservation.getUserId() + "' and re.id.reservationId='" + reservation.getReservationId() + "'";
            Query updateReservation = session.createQuery(mysqlQuery);
            updateReservation.executeUpdate();
            session.getTransaction().commit();
            session.close();
            reservationPk.setUserId(reservation.getUserId());
            reservationPk.setReservationId(reservation.getReservationId());
            return reservationPk;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }

    //ΔΙΑΓΡΑΦΗ ΚΡΑΤΗΣΗΣ
    //ο καταστηματάρχης διαγράφει κάποια κράτηση
    //ορίσματα clubName και reservationId
    //επιστρέφει true αν έγινε η ακύρωση, αλλιώς false
    public ReservationPk cancelReservationByNightClub(ReservationPk reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            ReservationPk reservationPk = new ReservationPk();
            String mysqlQuery = "update Reservation re set re.reservationStatus ='inactive' "
                    + "where re.id.clubId='" + reservation.getClubId() + "' and re.id.reservationId='" + reservation.getReservationId() + "'";
            Query updateReservation = session.createQuery(mysqlQuery);
            updateReservation.executeUpdate();
            session.getTransaction().commit();
            session.close();
            reservationPk.setClubId(reservation.getClubId());
            reservationPk.setReservationId(reservation.getReservationId());
            return reservationPk;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }

    public int numberOfReservationTablesByDate(int clubId, Date reservationDate) {
        int numberOfTables = 0;
        String dateFormat = "yyyy/MM/dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Reservation re "
                    + "where re.id.clubId='" + clubId + "' and re.reservationDate='" + simpleDateFormat.format(reservationDate) + "' and re.reservationStatus=\'active\'";
            Query getReservation = session.createQuery(mysqlQuery);
            List resultList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            Reservation reservation = new Reservation();
            for (Object reservationInfo : resultList) {
                numberOfTables = numberOfTables + 1;
                reservation = (Reservation) reservationInfo;
            }
            return numberOfTables;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return numberOfTables;
        }
    }

    public List listWithReservationTablesByDate(int clubId, Date reservationDate) {

        String dateFormat = "yyyy/MM/dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Reservation re where re.id.clubId='" + clubId + "' "
                    + "and re.reservationDate='" + simpleDateFormat.format(reservationDate) + "' "
                    + "and re.reservationStatus=\'active\'";
            Query getReservation = session.createQuery(mysqlQuery);
            List resultList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            List<String> tablesList = new ArrayList<String>();
            Reservation reservation = new Reservation();
            for (Object reservationInfo : resultList) {
                reservation = (Reservation) reservationInfo;
                tablesList.add(reservation.getTrapezi());
            }
            return tablesList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public Reservation getReservationDataByReservationIdAndUserId(int reservationId, int userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Reservation re where re.id.reservationId='" + reservationId + "' and re.id.userId='" + userId + "' and re.reservationStatus=\'active\'";
            Query getReservation = session.createQuery(mysqlQuery);
            List resultList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            Reservation reservation = new Reservation();
            for (Object reservationInfo : resultList) {
                reservation = (Reservation) reservationInfo;
            }
            return reservation;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public Reservation getReservationDataByReservationIdAndClubId(int reservationId, int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Reservation re where re.id.reservationId='" + reservationId + "' and re.id.clubId='" + clubId + "' and re.reservationStatus=\'active\'";
            Query getReservation = session.createQuery(mysqlQuery);
            List resultList = getReservation.list();
            session.getTransaction().commit();
            session.close();
            Reservation reservation = new Reservation();
            for (Object reservationInfo : resultList) {
                reservation = (Reservation) reservationInfo;
            }
            return reservation;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

}
