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

public class SupplierDao{ 
    
    public List getAllSuppliers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String mysqlQuery = "from Supplier";
            session.beginTransaction();
            Query getSupplier = session.createQuery(mysqlQuery);
            List resultList = getSupplier.list();
            session.getTransaction().commit();
            return resultList;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
    
    public Supplier getSupplierDataById(int supplierId) {
         Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String mysqlQuery = "from Supplier sup where sup.supplierId='" + supplierId + "'";
            Query getSupplier = session.createQuery(mysqlQuery);
            List resultList = getSupplier.list();
            session.getTransaction().commit();
            session.close();
            Supplier supplier = new Supplier();
            for (Object supplierInfo : resultList) {
                supplier = (Supplier) supplierInfo;
            }
            return supplier;
        } catch (HibernateException exception) {
            exception.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
    
    
    
}
