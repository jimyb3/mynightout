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

public class TablesDao {

    public Tables getClubsTables(String clubName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
            String mysqlQuery = "from Tables tables where tables.clubId='" + clubId + "'";
            Query getTables = session.createQuery(mysqlQuery);
            List resultList = getTables.list();
            session.getTransaction().commit();
            session.close();
            Tables tables = new Tables();
            for (Object tablesInfo : resultList) {
                tables = (Tables) tablesInfo;
            }
            return tables;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
//den xreazetai

    public Tables insertClubsTables(String clubName, int firstRow, int secondRow, int thirdRow, int fourthRow, int fifthRow, int sixthRow) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
            Tables tables = new Tables(clubId, firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow);
            session.save(tables);
            session.flush();
            session.getTransaction().commit();
            return tables;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public Tables updateClubsTables(String clubName, int firstRow, int secondRow, int thirdRow, int fourthRow, int fifthRow, int sixthRow) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int clubId = new NightClubDao().getNightClubDataByClubName(clubName).getClubId();
            String mysqlQuery = "update Tables set firstRow = '" + firstRow + "', secondRow = '" + secondRow + "',"
                    + " thirdRow = '" + thirdRow + "', fourthRow = '" + fourthRow + "', fifthRow='" + fifthRow + "',"
                    + " sixthRow='" + sixthRow + "'  where clubId='" + clubId + "'";
            Query updateTables = session.createQuery(mysqlQuery);
            updateTables.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Tables tables = new Tables(clubId, firstRow, secondRow, thirdRow, fourthRow, fifthRow, sixthRow);
            return tables;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public int numberOfTablesByClubId(int clubId) {
        int numberOfTables = 0;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Tables ta where ta.clubId='" + clubId + "'";
            Query getTables = session.createQuery(mysqlQuery);
            List resultList = getTables.list();
            session.getTransaction().commit();
            session.close();
            Tables tables = new Tables();
            for (Object tablesInfo : resultList) {
                tables = (Tables) tablesInfo;
                numberOfTables = tables.getFirstRow() + tables.getSecondRow() + tables.getThirdRow() + tables.getFourthRow() + tables.getFifthRow() + tables.getSixthRow();
            }
            return numberOfTables;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return numberOfTables;
        }
    }
}
