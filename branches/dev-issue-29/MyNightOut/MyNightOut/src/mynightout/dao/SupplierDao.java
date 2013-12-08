/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.dao;

import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.model.Supplier;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;


/**
 *
 * @author Maria
 */
public class SupplierDao implements ISupplierDao{
  
    @Override   
    public Supplier selectSupplier(String firstName, String lastName, String companyName, String address, int  cellPhoneNumber, int officePhoneNumber, String email) throws DaoException{
    return new Supplier(firstName,lastName,companyName,address,cellPhoneNumber,officePhoneNumber,email);
    }
    
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
    
    
    
}
