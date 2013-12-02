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
//επιστρέφει το <clubid> του χρήστη <clubname>
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
 //ΔΕΔΟΜΕΝΑ ΚΑΤΑΣΤΗΜΑΤΟΣ(!!!!!!!!!!!!!!!!!!!!!!)
    //όρισμα : clubName
    //επιστρέφει αντικείμενο List με δεδομένα του <clubName>
    //null αν υπάρχει λάθος    
    public List getNightClubData(String clubName) {
        try {
            String hql = "select nin.clubName,nin.seatNumber, nin.telephoneNum  from Nightclub nin where nin.clubName='" + clubName + "'";
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List clubDataList = q.list();
            session.getTransaction().commit();         
            session.close();
            return clubDataList;
        } catch (HibernateException he) {
            he.printStackTrace();
            return null;
        }

    }
//ΕΝΗΜΕΡΩΣΗ ΤΩΝ ΔΕΔΟΜΕΝΩΝ ΕΝΟΣ ΜΑΓΑΖΙΟΥ
    //ορίσματα : clubName, clubPassword, seatNumber, telephoneNum
    //επιστρέφει true αν έγινε η ενημέρωση, alliws false
    // todo : είναι σωστό που επστρέφει boolean ?
    //todo : θα έχει περισσότερα πεδία το Nightclub αργότερα
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
    //έλεγχος των στοιχείων εισόδου ενός καταστήματος, αν υπάρχουν στη βάση
    //ορίσματα : clubName, clubPassWord
    //true αν είναι σωστά, αλλιώς false
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
