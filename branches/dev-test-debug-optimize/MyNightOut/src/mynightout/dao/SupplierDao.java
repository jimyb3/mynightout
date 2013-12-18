/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.Supplier;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Maria
 */
public class SupplierDao{
  
   
    
    public List getAllSuppliers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from Supplier";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List supplierList = q.list();
            session.getTransaction().commit();
            return supplierList;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
    
    public Supplier getSupplierDataById(int supplierId) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hql = "from Supplier sup where sup.supplierId='" + supplierId + "'";
            Query w = session.createQuery(hql);
            List resultList = w.list();
            session.getTransaction().commit();
            session.close();
            Supplier supplier = new Supplier();
            for (Object o : resultList) {
                supplier = (Supplier) o;
            }
            return supplier;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
    
    
    
}
