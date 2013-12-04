/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.Nightclub;
import mynightout.entity.Reservation;
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
            String hql = "from Nightclub nin";
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
//επιστρέφει το <clubid> του χρήστη <clubname>
    public Nightclub getNightClubIdByNightClubName(String clubName) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hqlNightClub = "from Nightclub cl where cl.clubName='" + clubName + "'";
            Query w = session.createQuery(hqlNightClub);
            List resultList = w.list();
            session.getTransaction().commit();
            session.close();
            Nightclub ninghtClub=new Nightclub(); 
            for(Object o:resultList){
                ninghtClub=(Nightclub)o;
             }
             return ninghtClub;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
    
//βρίσκει και επιστρέφει το clubName to  καταστήματος με clubId
    
    public String getNightClubNameByNightClubId(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hqlNightClub = "select cl.clubName from Nightclub cl where cl.clubId='" + clubId + "'";
            Query w = session.createQuery(hqlNightClub);
            List resultList = w.list();
            session.getTransaction().commit();
            String clubName = (String) resultList.get(0);
            session.close();
            return clubName;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
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
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Nightclub nin where nin.clubName='" + clubName + "'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List clubDataList = q.list();
            session.getTransaction().commit();         
            session.close();
            return clubDataList;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
//ΕΝΗΜΕΡΩΣΗ ΤΩΝ ΔΕΔΟΜΕΝΩΝ ΕΝΟΣ ΜΑΓΑΖΙΟΥ
    //ορίσματα : clubName, clubPassword, seatNumber, telephoneNum
    //επιστρέφει true αν έγινε η ενημέρωση, alliws false
    // todo : είναι σωστό που επστρέφει boolean ?
    //todo : θα έχει περισσότερα πεδία το Nightclub αργότερα
    public boolean updateNightClubData(String clubName, String clubPassword, int seatNumber, String telephoneNum) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubIdByNightClubName(clubName).getClubId();
            String hql = "update Nightclub set clubPassword = '" + clubPassword + "', seatNumber = '" + seatNumber + "', telephoneNum = '" + telephoneNum + "' where clubId='" + clubId + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
    }
    //έλεγχος των στοιχείων εισόδου ενός καταστήματος, αν υπάρχουν στη βάση
    //ορίσματα : clubName, clubPassWord
    //true αν είναι σωστά, αλλιώς false
     public boolean isNightClubDataValid(String clubName, String clubPassWord) {
        Session session = HibernateUtil.getSessionFactory().openSession();
         try {
            String hql = "from Nightclub nclub where nclub.clubName='" + clubName + "' and nclub.clubPassword='" + clubPassWord + "'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            return !resultList.isEmpty();
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }

    }
}
