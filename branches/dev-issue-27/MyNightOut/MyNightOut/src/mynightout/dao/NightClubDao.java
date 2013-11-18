/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import mynightout.entity.User;
import mynightout.exceptions.DaoException;
import mynightout.model.NightClub;
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
    public NightClub selectNightClub(String storeName) throws DaoException {
        return new NightClub();
    }
//επιστρέφει List με clubName, seatNumber, telephoneNum για όλα τα καταστήματα της βάσης
//ΕΜΦΑΝΙΣΗ ΚΑΤΑΣΤΗΜΑΤΟΣ
    public List getAllNightClubs() {
        try {
            String hql = "select nin.clubName,nin.seatNumber, nin.telephoneNum  from Nightclub nin";
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List nightclubsList = q.list();
            session.getTransaction().commit();
            return nightclubsList;
        } catch (HibernateException he) {
            he.printStackTrace();
            return null;
        }

    }
//βρίσκει και επιστρέφει το clubId to  καταστήματος με clubName
    //TODO dn m aresei to return -1
    public int getNightClubIdByNightClubName(String clubName) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String hqlNightClub = "select cl.clubId from Nightclub cl where cl.clubName='" + clubName + "'";
            Query w = session.createQuery(hqlNightClub);
            List resultList2 = w.list();
            session.getTransaction().commit();
            int clubId = (int) resultList2.get(0);
            session.close();
            return clubId;
        } catch (HibernateException he) {
            he.printStackTrace();
            return -1;
        }
    }

    public void insertNewNightClub() {
        //8a doume an xreiastei
    }
//επιστρέφει List με clubname, seatNumber, nightclub συγκεκριμένου καταστήματος
    public List getNightClubData(String clubName) {
        try {
            String hql = "select nin.clubName,nin.seatNumber, nin.telephoneNum  from Nightclub nin where nin.clubName='" + clubName + "'";
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List nightclubList = q.list();
            session.getTransaction().commit();
            return nightclubList;
        } catch (HibernateException he) {
            he.printStackTrace();
            return null;
        }

    }
//allagi ton dedomenon sugekrimenou magaziou
    public boolean updateNightClubData(String clubName, String clubPassword, int seatNumber, String telephoneNum) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubIdByNightClubName(clubName);
            String hql = "update Nightclub set clubPassword = '" + clubPassword + "', seatNumber = '" + seatNumber + "', telephoneNum = '" + telephoneNum + "' where clubId='" + clubId + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (HibernateException he) {
            he.printStackTrace();
            return false;
        }
    }
    //έλεγχος των στοιχείων εισόδου ενός καταστήματος, αν υπάρχουν στη βάση -> true αλλιώς false
    //LOGIN
     public boolean isNightClubDataValid(String clubName, String clubPassWord) {
        try {
            String hql = "from Nightclub nclub where nclub.clubName='" + clubName + "' and nclub.clubPassword='" + clubPassWord + "'";
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            if (!resultList.isEmpty()) {
                return true;
            } else {
                return false;
            }
        } catch (HibernateException he) {
            he.printStackTrace();
            return false;
        }

    }
}
