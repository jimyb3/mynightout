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

/**
 * Κλάση που κάποια στιγμή θα χρησιμοποιηθεί για την επικοινωνία με το σύστημα
 * μόνιμης αποθηκευσης. Προς το παρόν δεν κάνει κάτι χρήσιμο
 *
 * @author Dimitris
 */
public class ReservationDao implements IReservationDao {

    @Override
    public Reservation selectReservation(ReservationPk res, Date reservationDate,
            String trapezi, int seatNumber, String reservationStatus) throws DaoException {
        return new Reservation(res, reservationDate, trapezi, seatNumber, "active");
    }

    //ΚΡΑΤΗΣΗ
    //δημιουργεί νεα κράτηση στη βάση
    //ορίσματα : userName, nightClubName, reservationDate, seatNumber.....
    //επιστρέφει αντικείμενο Reservation με τα χαρακτηριστικά της νέας κράτησης, εαν προστέθηκε στη βάση η εγγραφή
    //αλλιώς, null
    public Reservation insertReservationData(String userName, String nightClubName, Date reservationDate, String trapezi, int seatNumber) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();
            int userId = new UserDao().getUserDataByUsername(userName).getUserId();
            int clubId = new NightClubDao().getNightClubDataByClubName(nightClubName).getClubId();
            ReservationPk res = new ReservationPk();
            res.setUserId(userId);
            res.setClubId(clubId);

            Reservation newReservation = new Reservation(res, reservationDate, trapezi, seatNumber, "active");
            session.save(newReservation);
            session.getTransaction().commit();
            session.close();
            return newReservation;
        } catch (HibernateException he) {
            he.printStackTrace();
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
            String hql = "from Reservation re where re.id.userId='" + userId + "' and re.reservationStatus=\'active\'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List reservationsList = q.list();
            session.getTransaction().commit();
            session.close();
            return reservationsList;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
//ΑΚΥΡΩΣΗ ΚΡΑΤΗΣΗΣ 
    //ο χρηστης ακυρώνει κάποια κράτηση
    //ορίσμα ReservationPl reservation
    // επιστρέφει to antoistoixo ReservationPK an egine swsta, alliws null

    public ReservationPk cancelReservationByUser(ReservationPk reservation) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            ReservationPk rpk = new ReservationPk();
            session.beginTransaction();
            String hql = "update Reservation re set re.reservationStatus ='inactive' "
                    + "where re.id.userId='" + reservation.getUserId() + "' and re.id.reservationId='" + reservation.getReservationId() + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            rpk.setUserId(reservation.getUserId());
            rpk.setReservationId(reservation.getReservationId());
            return rpk;
        } catch (HibernateException he) {
            he.printStackTrace();
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
            ReservationPk rpk = new ReservationPk();
            String hql = "update Reservation re set re.reservationStatus ='inactive' "
                    + "where re.id.clubId='" + reservation.getClubId() + "' and re.id.reservationId='" + reservation.getReservationId() + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            rpk.setClubId(reservation.getClubId());
            rpk.setReservationId(reservation.getReservationId());
            return rpk;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }

    public int numberOfReservationTablesByDate(int clubId, Date reservationDate) {
        int numberOfTables = 0;
        String DATE_FORMAT = "yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();

            String hql = "from Reservation re "
                    + "where re.id.clubId='" + clubId + "' and re.reservationDate='" + sdf.format(reservationDate) + "' and re.reservationStatus=\'active\'";
            Query w = session.createQuery(hql);
            List resultList = w.list();
            session.getTransaction().commit();
            session.close();

            Reservation re = new Reservation();
            for (Object o : resultList) {
                numberOfTables = numberOfTables + 1;
                re = (Reservation) o;

            }
            return numberOfTables;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return numberOfTables;
        }
    }

    public List listWithReservationTablesByDate(int clubId, Date reservationDate) {

        String DATE_FORMAT = "yyyy/MM/dd";
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();

            String hql = "from Reservation re where re.id.clubId='" + clubId + "' "
                    + "and re.reservationDate='" + sdf.format(reservationDate) + "' "
                    + "and re.reservationStatus=\'active\'";
            Query w = session.createQuery(hql);
            List resultList = w.list();
            session.getTransaction().commit();
            session.close();
            List tablesList = new ArrayList();
            Reservation re = new Reservation();
            for (Object o : resultList) {
                re = (Reservation) o;
                tablesList.add(re.getTrapezi());
            }
            return tablesList;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
}
