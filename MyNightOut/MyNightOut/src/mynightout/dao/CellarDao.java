/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.Cellar;

import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Maria
 */
public class CellarDao {

    /*@Override
     public Cellar selectCellar(String NameOfBottle, int NumOfBottles) throws DaoException {
     return new Cellar(NameOfBottle, NumOfBottles);
     }*/
    public Cellar getNightClubCellarByClubName(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Cellar cl where cl.clubId='" + clubId + "'";
            Query getCellar = session.createQuery(mysqlQuery);
            List resultList = getCellar.list();
            session.getTransaction().commit();
            session.close();
            Cellar cellar = new Cellar();
            for (Object infoCellar : resultList) {
                cellar = (Cellar) infoCellar;
            }
            return cellar;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public Cellar updateClubCellarByClubId(int clubId, int vodka, int whiskey, int wine,
            int liqueur, int rum, int tequila, int beer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "update Cellar cl set vodka='" + vodka + "', whiskey='" + whiskey + "',"
                    + " wine='" + wine + "', liqueur='" + liqueur + "', rum='" + rum + "',"
                    + " tequila='" + tequila + "', beer='" + beer + "' where clubId='" + clubId + "'";
            Query q = session.createQuery(mysqlQuery);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            Cellar cellar = new Cellar(clubId, vodka, whiskey, wine,
                    liqueur, rum, tequila, beer);
            return cellar;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
}
