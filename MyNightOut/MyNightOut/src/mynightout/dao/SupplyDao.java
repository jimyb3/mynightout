/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.List;
import mynightout.entity.Supply;
import mynightout.entity.SupplyPk;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


public class SupplyDao {
    public Supply insertNewSupply(int clubId, int supplierId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            SupplyPk supplyPk = new SupplyPk();
            supplyPk.setClubId(clubId);
            supplyPk.setSupplierId(supplierId);
            Supply supply=new Supply();
            supply.setId(supplyPk);
            session.save(supply);
            session.getTransaction().commit();
            session.close();
            return supply;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public boolean deleteSuppliersByClubId(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "delete Supply su where su.id.clubId='" + clubId + "'";
            Query deleteSupply = session.createQuery(mysqlQuery);
            if (deleteSupply.executeUpdate() >= 0) {
                session.getTransaction().commit();
                session.close();
                return true;
            }
            return false;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
    }

    public List getSupplyByClubId(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String mysqlQuery = "from Supply su where su.id.clubId='" + clubId + "'";
            session.beginTransaction();
            Query getSupply = session.createQuery(mysqlQuery);
            List resultList = getSupply.list();
            session.getTransaction().commit();
            session.close();
            return resultList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
}
