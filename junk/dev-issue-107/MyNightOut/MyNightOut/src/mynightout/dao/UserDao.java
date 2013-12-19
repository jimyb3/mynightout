/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynightout.dao;

import java.util.List;
import mynightout.exceptions.DaoException;
import mynightout.entity.User;
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

    public User insertNewUserData(String username, String password, String customerName, String customerLastname, String telephoneNum, String emailAddress) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            User newUser = new User(username, password, customerName, customerLastname, telephoneNum, emailAddress);
            session.save(newUser);
            session.flush();
            session.getTransaction().commit();
            return newUser;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
//έλεγχος στοιχείων εισόδου χρήστη
    //ορίσματα : username κ password
    //επιστρέφει true αν είναι σωστά, αλλιώς false

    public User isUserDataValid(String userName, String passWord) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            String hql = "from User user where user.username='" + userName + "' and user.password='" + passWord + "'";
            session.beginTransaction();
            Query q = session.createQuery(hql);
            List resultList = q.list();
            session.getTransaction().commit();
            session.close();
            User user = new User();
            for (Object o : resultList) {
                user = (User) o;
            }
            return user;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }

//προβολή στοιχείων του χρήστη
    //όρισμα : userName
    //επιστρέφει αντικείμενο List με τα χαρακτηριστικα του χρήστη <userName>
    //επιστρέφει null αν κάτι πάει στραβά
    //todo : αργότερα ο User θα έχει περισσότερα πεδία
    public User getUserDataByUsername(String userName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            String hql = "from User user where user.username='" + userName + "'";
            Query q = session.createQuery(hql);
            List userDataList = q.list();
            session.getTransaction().commit();
            session.close();
            User user = new User();
            for (Object o : userDataList) {
                user = (User) o;
            }
            return user;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }

    }
//ΔΙΑΧΕΙΡΙΣΗ ΠΡΟΣΩΠΙΚΩΝ ΣΤΟΙΧΕΙΩΝ
    //ορίσματα : userName, password, customerName, customerLastname, telephoneNum
    //επιστρέφει true αν έγινε η ενημέρωση, alliws false
    // todo : είναι σωστό που επστρέφει boolean ?

    public User updateUserData(String userName, String password, String customerName, String customerLastname, String telephoneNum, String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            int userId = new UserDao().getUserDataByUsername(userName).getUserId();
            String hql = "update User set password = '" + password + "', customerName = '" + customerName + "',"
                    + " customerLastname = '" + customerLastname + "', telephoneNum = '" + telephoneNum + "'  where userId='" + userId + "'";
            Query q = session.createQuery(hql);
            q.executeUpdate();
            session.getTransaction().commit();
            session.close();
            User user = new User(userName, password, customerName, customerLastname, telephoneNum, email);
            return user;
        } catch (HibernateException he) {
            he.printStackTrace();
            session.beginTransaction().rollback();
            return null;
        }
    }
}
