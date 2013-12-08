/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.List;
import mynightout.entity.SupplyPk;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Dimitris
 */
public class SupplyDao {

    public SupplyPk insertNewSupply(int clubId, int supplierId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            SupplyPk sup = new SupplyPk();
            sup.setClubId(clubId);
            sup.setSupplierId(supplierId);
            session.save(sup);
            session.getTransaction().commit();
            session.close();
            return sup;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }

    public boolean deleteSuppliersByClubId(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hql = "delete SupplyPk su where su.clubId='" + clubId + "'";
            Query q = session.createQuery(hql);
            if (q.executeUpdate() > 0) {
                session.getTransaction().commit();
                session.close();
                return true;
            }
            return false;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return false;
        }
    }

    public List getSupplyByClubId(int clubId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Supply su where su.id.clubId='" + clubId + "'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List supplyList = q.list();
            session.getTransaction().commit();
            session.close();
            return supplyList;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
}
