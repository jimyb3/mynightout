/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.ArrayList;
import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.User;
import mynightout.entity.Reservation;
import mynightout.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ioanna
 */
public class UserDao implements IUserDao {

    @Override
    public User makeLogin(String userName, String passWord) throws DaoException {
        return new User();
    }
//εισαγωγή νέου χρήστη στη βάση
    //ορίσματα :userName, passWord, customerName, customerLastname, telephoneNum
    //επιστρέφει αντικείμενο user με τα χαρακτηριστικά του νέου χρήστη, εαν προστέθηκε στη βάση η εγγραφή
    //απιστρέφει null αν δεν έγινε η εισαγωγη στη βάση
    //TODO : θα προστεθούν νέα χαρακτηριστικά για το χρήστη
    public User insertNewUserData(String userName, String passWord, String customerName, String customerLastname, String telephoneNum) {
        try {
            User newUser = new User(userName, passWord, customerName, customerLastname, telephoneNum);
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session. save(newUser);
            session.getTransaction().commit();
            return newUser;
        } catch (HibernateException he) {
            he.printStackTrace();
            return null;
        }
    }
//έλεγχος στοιχείων εισόδου χρήστη
    //ορίσματα : username κ password
    //επιστρέφει true αν είναι σωστά, αλλιώς false
    public boolean isUserDataValid(String userName, String passWord) {
        try {
            String hql = "from User user where user.username='" + userName + "' and user.password='" + passWord + "'";
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
//επιστρέφει το <userid> του χρήστη <username>
    public int getUserIdByUsername(String userName) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String hqlUser = "select us.userId from User us where us.username='" + userName + "'";
            Query q = session.createQuery(hqlUser);
            List resultList1 = q.list();
            session.getTransaction().commit();
            int userId = (int) resultList1.get(0);
            session.close();
            return userId;
        } catch (HibernateException he) {
            he.printStackTrace();
            return -1;
        }
    }
//προβολή στοιχείων του χρήστη
    //όρισμα : userName
    //επιστρέφει αντικείμενο List με τα χαρακτηριστικα του χρήστη <userName>
    //επιστρέφει null αν κάτι πάει στραβά
    //todo : αργότερα ο User θα έχει περισσότερα πεδία
    public User getUserData(String userName) {
        try {            
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            String hql = "select user.username, user.password, user.customerName, user.customerLastname, user.telephoneNum"
                    + " from User user where user.username='" + userName + "'";
            Query q = session.createQuery(hql);
            List<String> userDataList = q.list();
            session.getTransaction().commit();             
            session.close();
            String name=(String)userDataList.get(0);
            User user=new User();
            user.setUsername(name);
            
            return user;
        } catch (HibernateException he) {
            he.printStackTrace();
            return null;
        }

    }
//ΔΙΑΧΕΙΡΙΣΗ ΠΡΟΣΩΠΙΚΩΝ ΣΤΟΙΧΕΙΩΝ
    //ορίσματα : userName, password, customerName, customerLastname, telephoneNum
    //επιστρέφει true αν έγινε η ενημέρωση, alliws false
    // todo : είναι σωστό που επστρέφει boolean ?
    public boolean updateUserData(String userName, String password, String customerName, String customerLastname, String telephoneNum) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            int userId = new UserDao().getUserIdByUsername(userName);
            String hql = "update User set password = '" + password + "', customerName = '" + customerName + "', customerLastname = '" + customerLastname + "', telephoneNum = '" + telephoneNum + "'  where userId='" + userId + "'";
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
}
 