/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.List;
import mynightout.entity.Nightclub;
import mynightout.entity.Reservation;
import mynightout.entity.Tables;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Dimitris
 */
public class TablesDao {

    public Tables getClubsTables(String clubName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubIdByNightClubName(clubName).getClubId();
            String hql = "from Tables tables where tables.clubId='" + clubId + "'";
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            session.close();
            Tables tables = new Tables();
            for (Object o : resultList) {
                tables = (Tables) o;
            }
            return tables;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public Tables insertClubsTables(String clubName, int firstRow, int secondRow, int thirdRow, int fourthRow, int fifthRow, int sixthRow) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubIdByNightClubName(clubName).getClubId();
            Tables tables = new Tables(clubId, firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow);
            session.save(tables);
            session.flush();
            session.getTransaction().commit();
            return tables;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public boolean updateClubsTables(String clubName, int firstRow, int secondRow, int thirdRow, int fourthRow, int fifthRow, int sixthRow) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubIdByNightClubName(clubName).getClubId();
            String hql = "update Tables set firstRow = '" + firstRow + "', secondRow = '" + secondRow + "', thirdRow = '" + thirdRow + "', fourthRow = '" + fourthRow + "', fifthRow='" + fifthRow + "', sixthRow='" + sixthRow + "'  where clubId='" + clubId + "'";
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

    public int numberOfTablesByClubId(int clubId) {
        int numberOfTables = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();

            String hql = "from Tables ta where ta.clubId='" + clubId + "'";
            Query w = session.createQuery(hql);
            List resultList = w.list();
            session.getTransaction().commit();
            session.close();

            Tables ta = new Tables();
            for (Object o : resultList) {
                ta = (Tables) o;
                numberOfTables = ta.getFirstRow() + ta.getSecondRow() + ta.getThirdRow() + ta.getFourthRow() + ta.getFifthRow() + ta.getSixthRow();
            }
            return numberOfTables;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return numberOfTables;
        }
    }
}
